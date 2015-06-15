package analysis;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Network;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Route;
import fr.ensma.realtimescheduling.Task;

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
	static List<Integer> responseTimeAnalysis(Partition p, Comparator<Task> taskComparator) {
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
	static List<Integer> responseTimeAnalysis(Partition p, List<fr.ensma.realtimescheduling.Task> sortedTasks) {
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
	static int RTA1(Partition p, List<Task> tasks, int index) {
		int rmax = 0;
		List<Interval> intervals = PartitionUtils.sortedIntervals(p);
		for (int j = 0; j < intervals.size(); j++) {
			int sej = (int) Math.round(PartitionUtils.supply(p,intervals.get(j).getEnd()));
			int r,rpp,rppp = tasks.get(index).getWorstCaseExecTime();
			do {
				r = rppp;
				final int r_final = r;
				rpp = tasks.get(index).getWorstCaseExecTime() +  IntStream.range(0, index)
						.map(k -> (int) Math.ceil(1.0*r_final / tasks.get(k).getCharacteristicPeriod()) * tasks.get(k).getWorstCaseExecTime())
						.sum();
				rppp = (int)Math.round((PartitionUtils.inverseSupply(p, rpp + sej) - intervals.get(j).getEnd()));
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
	static Map<Route, Double> FA1(Network net) {
		/* Build auxilary DSs */
		/* Perform algorithm */
		/* Return to user */
		return null;
	}
	
	
}
