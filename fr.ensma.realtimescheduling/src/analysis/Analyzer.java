package analysis;

import java.util.Arrays;
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
	 * This is not the improved version.
	 * 
	 * @param net Network being analyzed
	 * @return Map from virtual link to worst case end-to-end delay as a double
	 */
	static Map<Route, Double> FA1(fr.ensma.realtimescheduling.System system) {
		//all switches and all end systems will inherit the network bandwidth
		double networkBandwith = system.getUses().getCommunicatesOver().getNetworkBandwidth();
		system.getUses().getCommunicatesOver().getSwitches().stream().flatMap(s -> s.getSwitchPorts().stream()).forEach(port -> port.setBandwidth(networkBandwith));
		system.getUses().getScheduledOn().stream().flatMap(mod -> mod.getModulePorts().stream()).forEach(port -> port.setBandwidth(networkBandwith));
		
		System.out.println("FA1 Invoked");
		Map<Route, Double> results = new HashMap<>();
		List<Flow> gamma = system.getExecutesSoftware().getVirtualLInks()
				.stream()
				.flatMap(vl -> vl.getRoutes().stream())
				.map(route -> new Flow(system.getUses().getCommunicatesOver(), route))
				.collect(Collectors.toList());//now need to create PortWrapperss
		System.out.println("Flows established");
		Set<Port> allNodes = gamma //all nodes used. Some ports may only be input ports and are therefore not counted
				.stream()
				.flatMap(flow -> flow.P_i.stream())
				.collect(Collectors.toSet());
		List<PortWrapper> portWrappers = allNodes
				.stream()
				.map(p -> new PortWrapper(p, gamma)) //to PortWrappers
				.collect(Collectors.toList());
		System.out.println("Order assigned");
		//group them by order now.
		Map<Integer, List<PortWrapper>> byOrder = new HashMap<>();
		IntStream.rangeClosed(1, portWrappers.stream().mapToInt(pw -> pw.order).max().getAsInt()) // from 1 to max order
			.forEach(order -> {
				List<PortWrapper> thisOrder = portWrappers.stream().filter(pw -> pw.order == order).collect(Collectors.toList());
				byOrder.put(order, thisOrder);
			});
		System.out.println("Partitioned by order. Beginning algorithm.");
		//TODO we need to topologically sort nodes in an order but that will 
		//be dealt with later
		for(Flow v : gamma) {
			v.setSmin(v.first, 0.0);
			v.setSmax(v.first, 0.0);
		}
		for(Map.Entry<Integer, List<PortWrapper>> order : byOrder.entrySet()) {
			System.out.println("Calculating order " + order.getKey());
			for(PortWrapper h : order.getValue()) {
				for(Flow v : h.flowsThroughMe) {
					v.calculateJitterFor(h.port);
				}
				//h.B(); used in the Bklg calculation
				Function<Double, Double> W = t -> h.flowsThroughMe.stream().mapToDouble(v -> v.RBF(h.port, t)).sum();
				for(Flow v : h.flowsThroughMe) {
					v.calculateBklgFor(h, W);
					if (h.port != v.last) {
						v.setSmin(v.successor(h.port), v.rankOf(h.port)*(v.link.getMaxFrameSize() / h.port.getBandwidth()) + 16.0); //TODO move latency
						v.setSmax(v.successor(h.port), v.SmaxFor(h.port)+v.BklgFor(h.port)+(v.link.getMaxFrameSize() / h.port.getBandwidth()) + 16.0);
					} else {
						v.ETEDelay = v.SmaxFor(h.port) + v.BklgFor(h.port) + v.link.getMaxFrameSize() / h.port.getBandwidth();
						results.put(v.r, v.ETEDelay);
					}
				}
			}
		}
		Flow vl1 = gamma.stream().filter(v -> v.link.getId().equals("VL1")).findAny().get();
		System.out.println("VL1 Data:");
		System.out.println("Nodes:");
		System.out.println(vl1);
		System.out.println("S_Max:");
		System.out.println(Arrays.toString(vl1.S_max));
		System.out.println("S_min:");
		System.out.println(Arrays.toString(vl1.S_min));
		System.out.println("Bklg:");
		System.out.println(Arrays.toString(vl1.Bklg));
		PortWrapper micro = portWrappers.stream().filter(pw -> pw.port.getId() == 1).findAny().get();
		System.out.println("B^ES1:");
		System.out.println();
		System.out.println("B function: " + micro.B());
		System.out.println("BP function: " + micro.BP());
		return results;
	}
	
	
}
