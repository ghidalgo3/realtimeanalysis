package fr.ensma.realtimescheduling.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Port;
import fr.ensma.realtimescheduling.Route;
import fr.ensma.realtimescheduling.Task;

/**
 * Performs schedulability analysis for classes in this package. This class only
 * knows about Partitions and Tasks, it should have no knowledge about the other
 * details of the meta-model
 * 
 * @author Gustavo Hidalgo
 */
public class Analyzer {


	/**
	 * Analyzes the tasks in an application in the context of a partition and
	 * returns a list of worst case response times. A response time of 0.0 means
	 * the task misses its deadline.
	 * 
	 * @param p
	 *            partition to test on. Only used for its interval definition
	 * @param taskComparator
	 *            used to sort the tasks by some definition of priority
	 * @return A list of response times
	 */
	static List<Integer> responseTimeAnalysis(Partition p,
			Comparator<Task> taskComparator) {
		List<fr.ensma.realtimescheduling.Task> sortedTasks = p.getTasks()
				.stream().sorted(taskComparator).collect(Collectors.toList());
		return responseTimeAnalysis(p, sortedTasks);
	}

	/**
	 * Analysis the tasks in an application in the context of a partition and
	 * returns a list of worst case response times. A response time of 0.0 means
	 * the task misses its deadline. This version differs from the other in that
	 * it does not sort tasks before running the analysis. This is just to speed
	 * up the computation if this is going to be run over a large system.
	 * 
	 * @param p
	 *            partition to test on. Only used for its interval definition
	 * @param sortedTasks
	 *            a sorted list of tasks.
	 * @return A list of response times
	 */
	static List<Integer> responseTimeAnalysis(Partition p,
			List<fr.ensma.realtimescheduling.Task> sortedTasks) {
		return IntStream.range(0, p.getTasks().size())
				.mapToObj(n -> RTA1(p, sortedTasks, n))
				.collect(Collectors.toList());
	}

	/**
	 * This tests the schedulability of one task among a list of tasks The
	 * sorting order of the tasks corresponds to the priority. This is an exact
	 * test.
	 * 
	 * @param p
	 *            partition
	 * @param tasks
	 *            a sorted lists of tasks. sorted by priority
	 * @param index
	 *            index of the task being analyzed
	 * @return 0 if the task misses its deadline, worst response time otherwise
	 */
	static private int RTA1(Partition p, List<Task> tasks, int index) {
		int rmax = 0;
		List<Interval> intervals = PartitionUtils.sortedIntervals(p);
		for (int j = 0; j < intervals.size(); j++) {
			int sej = (int) Math.round(PartitionUtils.supply(p, intervals
					.get(j).getEnd()));
			int r, rpp, rppp = tasks.get(index).getWorstCaseExecTime();
			do {
				r = rppp;
				final int r_final = r;
				rpp = tasks.get(index).getWorstCaseExecTime()
						+ IntStream
								.range(0, index)
								.map(k -> (int) Math.ceil(1.0
										* r_final
										/ tasks.get(k)
												.getCharacteristicPeriod())
										* tasks.get(k).getWorstCaseExecTime())
								.sum();
				rppp = (int) Math.round((PartitionUtils.inverseSupply(p, rpp
						+ sej) - intervals.get(j).getEnd()));
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

	// /**
	// * This tests for schedulability of a list of tasks in the critical
	// * partition case. This isn't used, only a sufficient test.
	// *
	// * @param p
	// * partition
	// * @param index
	// * index of the task being analyzed
	// * @return 0 if the task misses its deadline, worst response time
	// otherwise
	// */
	// @Deprecated
	// static private double RTA2(Partition p, int index) {
	// double rmax = 0;
	// List<fr.ensma.realtimescheduling.Task> tasks = p.getTasks();
	// double r, rpp, rppp = tasks.get(index).getWorstCaseExecTime();
	// do {
	// r = rppp;
	// final double r_final = r;
	// rpp = tasks.get(index).getWorstCaseExecTime()
	// + IntStream
	// .range(0, index)
	// // this is constant in this method.
	// .mapToDouble(
	// k -> Math.ceil(r_final
	// / tasks.get(k).getCharacteristicPeriod())
	// * tasks.get(k).getWorstCaseExecTime()).sum();
	// rppp = PartitionUtils.inverseSupply(p, rpp);
	// } while (r <= tasks.get(index).getImplicitDeadline() && rppp > r);
	// if (rppp > tasks.get(index).getImplicitDeadline()) {
	// rmax = 0;
	// } else {
	// rmax = Math.max(rppp, rmax);
	// }
	// return rmax;
	// }

	/**
	 * Performs the first forward-analysis paper algorithm. This is not the
	 * improved version.
	 * 
	 * @param net
	 *            Network being analyzed
	 * @return Map from virtual link to worst case end-to-end delay as a double
	 */
	static Map<Route, Double> FA1(fr.ensma.realtimescheduling.System system) {
		return endToEndAnalysis(system, Analyzer::wFunctionPlain);
	}

	/**
	 * Performs the second, improved forward-analysis paper algorithm. This
	 * takes the serialization effect into account.
	 * 
	 * @param net
	 *            Network being analyzed
	 * @return Map from virtual link to worst case end-to-end delay as a double
	 */
	static Map<Route, Double> FA2(fr.ensma.realtimescheduling.System system) {
		return endToEndAnalysis(system, Analyzer::wFunctionImproved);
	}

	/**
	 * The two FA algorithms differ essentially by their implementation of a W
	 * function which changes based on the port being studied. To reduce the
	 * chance of an error, this behavior has been abstracted to a function:
	 * PortWrapper -> Double -> Double.
	 * 
	 * @param system
	 *            System being studied for end to end delays
	 * @param w
	 *            W function for a port/portwrapper
	 * @return Map from Flow to ETE delay
	 */
	private static Map<Route, Double> endToEndAnalysis(
			fr.ensma.realtimescheduling.System system,
			Function<PortWrapper, Function<Double, Double>> w) {
		int networkLatency = NetworkUtils.normalizeNetwork(system);
		List<Flow> gamma = NetworkUtils.extractFlows(system);
		Set<Port> allOutputPorts = NetworkUtils.extractOutputPorts(gamma);
		Collection<PortWrapper> portWrappers = NetworkUtils
				.outputPortsToPortWrappers(allOutputPorts, gamma);
		// group them by order now.
		Map<Integer, List<PortWrapper>> byOrder = NetworkUtils
				.partitionByOrder(portWrappers);
		Map<Route, Double> results = new HashMap<>();
		// TODO we need to topologically sort nodes in an order
		for (Flow v : gamma) {
			v.setSmin(v.first, 0.0);
			v.setSmax(v.first, 0.0);
		}
		for (Map.Entry<Integer, List<PortWrapper>> order : byOrder.entrySet()) {
			for (PortWrapper h : order.getValue()) {
				for (Flow v : h.flowsThroughMe) {
					v.calculateJitterFor(h.port);
				}
				Function<Double, Double> W = w.apply(h);
				for (Flow v : h.flowsThroughMe) {
					v.calculateBklgFor(h, W);
					if (h.port != v.last) {
						v.setSmin(
								v.successor(h.port),
								v.rankOf(h.port)
										* (v.link.getMaxFrameSize()
												/ h.port.getBandwidth() + networkLatency));
						v.setSmax(
								v.successor(h.port),
								v.SmaxFor(h.port) + v.BklgFor(h.port)
										+ v.link.getMaxFrameSize()
										/ h.port.getBandwidth()
										+ networkLatency);
					} else {
						v.ETEDelay = v.SmaxFor(h.port) + v.BklgFor(h.port)
								+ v.link.getMaxFrameSize()
								/ h.port.getBandwidth();
						results.put(v.r, v.ETEDelay);
					}
				}
			}
		}
		System.out.println("Size of results " + results.size());
		return results;
	}

	/**
	 * W function from the first ETE paper
	 * 
	 * @param h
	 *            port
	 * @return W function
	 */
	private static Function<Double, Double> wFunctionPlain(PortWrapper h) {
		return t -> h.flowsThroughMe.stream().distinct()
				.mapToDouble(v -> v.RBF(h.port, t)).sum();
	}

	/**
	 * Improved W function from the second ETE paper
	 * 
	 * @param h
	 *            port
	 * @return Improved W function
	 */
	private static Function<Double, Double> wFunctionImproved(PortWrapper h) {
		List<Function<Double, Double>> W_accum = new ArrayList<>();
		if (h.order == 1) {
			return wFunctionPlain(h);
		} else {
			for (Port IP : h.inputsToMe) {
				Function<Double, Double> a = t -> {
					return t
							+ h.flowsForInput
									.get(IP)
									.stream()
									.mapToDouble(
											flow -> flow.link.getMaxFrameSize()
													/ h.port.getBandwidth())
									.max().getAsDouble();
				};
				Function<Double, Double> b = t -> {
					return h.flowsForInput.get(IP).stream()
							.mapToDouble(flow -> flow.RBF(h.port, t)).sum();
				};
				Function<Double, Double> F = t -> Math.min(a.apply(t),
						b.apply(t));
				W_accum.add(F);
			}
			return t -> W_accum.stream().mapToDouble(f -> f.apply(t)).sum();
		}
	}
}
