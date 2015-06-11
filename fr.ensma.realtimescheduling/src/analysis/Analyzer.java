package analysis;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Network;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Task;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * Performs schedulability analysis for classes in this package.
 * This class only knows about Partitions and Tasks,
 * it should have no knowledge about the other details of the meta-model
 * 
 * @author Gustavo Hidalgo
 *
 */
class Analyzer {
	

	/**
	 * Analyzes the tasks in an application in the context of a partition
	 * and returns a list of worst case response times. A response time
	 * of 0.0 means the task misses its deadline.
	 * 
	 * @param p partition to test on. Only used for its interval definition
	 * @param taskComparator used to sort the tasks by some definition of priority
	 * @return A list of response times
	 */
	static List<Double> responseTimeAnalysis(Partition p, Comparator<Task> taskComparator) {
		List<fr.ensma.realtimescheduling.Task> sortedTasks = p.getTasks()
				.stream()
				.sorted(taskComparator)
				.collect(Collectors.toList());
		return responseTimeAnalysis(p, sortedTasks);
	}
	
	/**
	 * Analysis the tasks in an application in the context of a partition
	 * and returns a list of worst case response times. A response time
	 * of 0.0 means the task misses its deadline. This version differs
	 * from the other in that it does not sort tasks before running the analysis.
	 * This is just to speed up the computation if this is going to
	 * be run over a large system.
	 * 
	 * @param p partition to test on. Only used for its interval definition
	 * @param sortedTasks a sorted list of tasks.
	 * @return A list of response times
	 */
	static List<Double> responseTimeAnalysis(Partition p, List<fr.ensma.realtimescheduling.Task> sortedTasks) {
		return IntStream.range(0, p.getTasks().size())
				.mapToObj(n -> RTA1(p,sortedTasks,n))
				.collect(Collectors.toList());
	}
	
	/**
	 * This tests the schedulability of one task among a list of tasks
	 * 
	 * The sorting order of the tasks corresponds to the priority.
	 * This is an exact test.
	 * 
	 * @param p
	 *            partition
	 * @param tasks a sorted lists of tasks. sorted by priority
	 * @param index
	 *            index of the task being analyzed
	 * @return 0 if the task misses its deadline, worst response time otherwise
	 */
	static double RTA1(Partition p, List<Task> tasks, int index) {
		double rmax = 0;
		List<Interval> intervals = PartitionUtils.sortedIntervals(p);
		for (int j = 0; j < intervals.size(); j++) {
			double sej = PartitionUtils.supply(p,intervals.get(j).getEnd());
			double r,rpp,rppp = tasks.get(index).getWorstCaseExecTime();
			do {
				r = rppp;
				final double r_final = r;
				rpp = tasks.get(index).getWorstCaseExecTime() +  IntStream.range(0, index)
						.mapToDouble(k -> 
							Math.ceil(r_final / tasks.get(k).getCharacteristicPeriod()) * tasks.get(k).getWorstCaseExecTime())
						.sum();
				rppp = PartitionUtils.inverseSupply(p, rpp + sej) - intervals.get(j).getEnd();
			} while (rppp <= tasks.get(index).getImplicitDeadline() && rppp > r);
			if (rppp > tasks.get(index).getImplicitDeadline()) {
				r = 0;
				break;
			} else {
				rmax = Math.max(rppp, rmax);
			}
		}
		return rmax;
	}

	/**
	 * This tests for schedulability of a list of tasks in the critical
	 * partition case. This isn't used, only a sufficient test.
	 * 
	 * @param p
	 *            partition
	 * @param index
	 *            index of the task being analyzed
	 * @return 0 if the task misses its deadline, worst response time otherwise
	 */
	@Deprecated
	static double RTA2(Partition p, int index) {
		double rmax = 0;
		List<fr.ensma.realtimescheduling.Task> tasks = p.getTasks();
		double r, rpp, rppp = tasks.get(index).getWorstCaseExecTime();
		do {
			r = rppp;
			final double r_final = r;
			rpp = tasks.get(index).getWorstCaseExecTime()
					+ IntStream
							.range(0, index)
							// this is constant in this method.
							.mapToDouble(
									k -> Math.ceil(r_final
											/ tasks.get(k).getCharacteristicPeriod())
											* tasks.get(k).getWorstCaseExecTime()).sum();
			rppp = PartitionUtils.inverseSupply(p, rpp);
		} while (r <= tasks.get(index).getImplicitDeadline() && rppp > r);
		if (rppp > tasks.get(index).getImplicitDeadline()) {
			rmax = 0;
		} else {
			rmax = Math.max(rppp, rmax);
		}
		return rmax;
	}
	
	/**
	 * Performs the first forward-analysis paper algorithm.
	 * This is not the improved version. This method
	 * assumes the network is valid under these criteria:
	 * 1. No cycles
	 * 2. All virtual links start at a 'start' node (node with no incoming links)
	 * 	  and end at 'end' nodes (nodes without outgoing links)
	 * 3. All nodes are part of some virtual link
	 * 
	 * @param net Network being analyzed
	 * @return Map from virtual link to worst case end-to-end delay as a double
	 */
	static Map<VirtualLink, Double> FA1(Network net) {
		Map<VirtualLink, Double> result = new HashMap<>();
		/* Set up auxiliary vectors */
		List<VLWrapper> vlwrappers = net.getVirtualLinks()
				.stream()
				.map(VLWrapper::new)
				.collect(Collectors.toList());
		List<NodeWrapper> nodewrappers = net.getNodes()
				.stream()
				.map(node -> new NodeWrapper(node, vlwrappers))
				.collect(Collectors.toList());
		/* First loop of algorithm */
		vlwrappers.stream().forEach(vlw -> {
			vlw.S_max.set(0, 0.0);
			vlw.S_min.set(0, 0.0);
		});
		/* Categorize nodes by order now */
		Map<Integer, List<NodeWrapper>> byOrder = new TreeMap<>();
		int maxOrder = nodewrappers.stream().mapToInt(nw -> nw.order).max().getAsInt();
		IntStream.rangeClosed(1, maxOrder)
			.forEach((order) -> {
				byOrder.put(order, nodewrappers.stream().filter(node -> node.order == order).collect(Collectors.toList()));
			});
		/* Begin massive loops */
		for(int order = 1; order <= maxOrder; order++) {
			for(NodeWrapper h : byOrder.get(order)) {
				final int current_order = order;
				/* Calculate current Jitter values */
				h.linksThroughMe.stream().forEach(vlw -> {
					vlw.calculateJitter(current_order);
				});
				/* Causes B and BP to be computed */
				//B^h calculation happens below.
				Function<Double, Double> W = t -> h.RBFallVLs(t);
				/* for each flow... */
				h.linksThroughMe.stream().forEach(v -> {
					double bklg = maximize(W, 0, h.B());
					if(h.node != v.nodes.get(v.nodes.size() - 1)) { //if not the last one
						v.setNextSMin(h.node, v.rankForNode(h.node)*(h.node.getTransmissionDelay() + net.getLatency()));
						v.setNextSMax(h.node, v.getSMax(h.node) + bklg + h.node.getTransmissionDelay() + net.getLatency());
					} else { //it is the last one
						result.put(v.link, v.getSMax(h.node) + bklg + h.node.getTransmissionDelay());
					}
				});
			}
		}
		return result;
	}
	
	/**
	 * TODO: Get this working
	 * @param f function
	 * @param start start interval
	 * @param end end interval
	 * @return maximum of function between the start and end point
	 */
	private static double maximize(Function<Double, Double> f, double start, double end) {
//		NelderMeadSimplex solver = new NelderMeadSimplex(1);
//		MultivariateFunction g = x -> f.apply(x[0]);
		return 0.0;
	}
	
}
