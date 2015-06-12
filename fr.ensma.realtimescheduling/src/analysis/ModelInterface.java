package analysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Task;

/**
 * This class houses methods to interface between the Ecore model and this package's
 * analysis algorithms. For now, until I figure out a better way to do this,
 * 'Validate' the model first in order to discover the 'System' being studied, 
 * then and only then can the analysis be run. Not java.lang.System!
 * 
 * This class's only job is to receive an instance of the model from
 * the validation class. When the user asks for analysis, the analysis
 * package gets the model from this class and performs analysis on it
 * which may involve modifying the state of the model.
 * @author Gustavo
 *
 */
public class ModelInterface {
	
	/**
	 * Instance to the System from the model being analyzed
	 * We will also parse the other entities out of the System
	 */
	public static fr.ensma.realtimescheduling.System system;
	
	/**
	 * Since we use the partitions directly so much, we extract the list of
	 * partitions from the model and make it publicly available.
	 */
	public static List<Partition> allPartitions;
	//don't know if this will ever be needed....
	static boolean validSystem;
	
	public static boolean validSystem() {return validSystem;}
	
	/**
	 * Very ugly way of receiving the System after the user clicks on 
	 * validate. I have made the Validator pass null to this method when
	 * the system doesn't validate. Thus, that is our signal to know that
	 * the System failed validation.
	 * @param s Entire System
	 */
	public static void setSystem(fr.ensma.realtimescheduling.System s) {
		if(s != null) {
			system = s;
			validSystem = true;
			allPartitions = system.getExecutesSoftware()
					.getContainedPartitions()
					.stream()
					.collect(Collectors.toList());
		} else {
			validSystem = false;
			system = null;
		}
	}

	/**
	 * Performs the rate monotonic response time analysis 
	 * on the System and modifies the instances to reflect the analysis
	 */
	public static List<String> allByRateMonotonic() {
		return fixedPriorityAlgorithm(allPartitions, ModelInterface::rateMonotonic);
	}
	
	/**
	 * Performs the fixed priority response time analysis 
	 * on the System and modifies the instances to reflect the analysis
	 */
	public static List<String> allByFixedPriority() {
		return fixedPriorityAlgorithm(allPartitions, ModelInterface::fixedPriority);
	}
	
	/**
	 * Performs the deadline monotonic response time analysis 
	 * on the System and modifies the instances to reflect the analysis
	 */
	public static List<String> allByDeadlineMonotonic() {
		return fixedPriorityAlgorithm(allPartitions, ModelInterface::deadlineMonotonic);
	}
	
	/**
	 * Looks at the user specified scheduling algorithm set for a partition and runs the
	 * analysis for all partitions with individual choices for algorithms.
	 * 
	 * @return List of strings indicating the results of the schedulability analysis
	 * 			or null if the System that ModelInterface knows about is invalid
	 */
	public static List<String> perPartitionScheduling() {
		if(!validSystem) return null;
		List<String> results = new LinkedList<String>();
		for(Partition partition : allPartitions) {
			results.add("Partition " + partition.getId() + " scheduled with " + partition.getSchedulingAlgorithm()+".\n");
			results.addAll(fixedPriorityAlgorithm(Arrays.asList(partition), PartitionUtils.getComparator(partition)));
		}
		return results;
	}
	
	/**
	 * Executes some fixed priority analysis by sorting tasks according to a comparator
	 * first then running RTA1 from the paper.
	 * @param comparator sorting comparator
	 * @return List of messages to the user.
	 */
	private static List<String> fixedPriorityAlgorithm(List<Partition> ps, Comparator<Task> comparator) {
		if (validSystem) {
			List<Task> sortedTasks = ps.stream()
					.flatMap(p -> p.getTasks().stream())
					.sorted(comparator)
					.collect(Collectors.toList());
			return ps
					.stream()
					.map(p -> setResponseTime(p, sortedTasks))
					.collect(Collectors.toList());
		} else {
			return null;
		}
	}
	
	/**
	 * Sets the virtual processor utilization on all partitions
	 * with all tasks schedulable. Does not return null
	 * @return
	 */
	public static List<String> virtualProcessorUtilizationAnalysis() {
		List<String> l = new ArrayList<String>();
		if(!validSystem) {
			l.add("System is invalid. Please validate the system successfully.");
			return null;
		}
		allPartitions
			.stream()
			.forEach(p -> {
				if(p.getTasks().stream().allMatch(t -> t.isScheduleable())) {
					double vpu = 1 / p.getAvailabilityFactor() * p.getTasks()
							.stream()
							.mapToDouble(t -> (1.0*t.getWorstCaseExecTime())/t.getCharacteristicPeriod())
							.sum();
					p.setVirtualProcessorUtilization(vpu);
					l.add("Partition " + p.getId() + " has determinate VPU: " + vpu + ".");
				} else {
					l.add("Partition " + p.getId() + " has unschedulable tasks. Could not determine VPU.");
					p.setVirtualProcessorUtilization(0.0);
				}
			});
		return l;
	}
	
	/**
	 * Performs the end to end analysis on the network component
	 * and returns a list of messages to display to the user.
	 * @return
	 */
	public static List<String> endToEndAnalysis() {
		List<String> l = new ArrayList<String>();
		if(!validSystem) {
			l.add("System is invalid. Please validate the system successfully.");
			return null;
		}
//		Map<VirtualLink, Double> results = Analyzer.FA1(system.getUses().getCommunicatesOver());
//		for(Map.Entry<VirtualLink, Double> delay : results.entrySet()) {
//			l.add(String.format("Virtual Link %s experiences ETE delay of %.2f", delay.getKey(), delay.getValue()));
//		}
//		system.getUses().getCommunicatesOver().getVirtualLinks().stream().forEachOrdered(vl -> l.add(vl.getNodes().toString() + "\n"));
		return l;
	}
	
	/**
	 * This applies the scheduling analysis to all tasks in one partition
	 * and determines their Worst Case Response Time. It then sets
	 * the attribute of the Task instances to the calculated response time
	 * along with a boolean flag of schedulable or not.
	 * @param partition The partition of tasks and intervals being analyzed
	 * @param diagnostics Used by Eclipse to accumulate errors or warnings for the user
	 * @return Error message string for any tasks that miss their deadlines
	 */
	private static String setResponseTime(Partition partition, List<Task> sortedTasks) {
		List<Integer> responseTimes = Analyzer.responseTimeAnalysis(partition, sortedTasks);
		StringBuilder sb = new StringBuilder();
		IntStream.range(0, partition.getTasks().size()).forEach(n -> {
				partition.getTasks().get(n).setResponseTime(responseTimes.get(n));
				if (responseTimes.get(n) == 0.0) {
					partition.getTasks().get(n).setScheduleable(false);
					sb.append(partition.getTasks().get(n).getName()+" will MISS its deadline.\n");
				} else {
					sb.append(partition.getTasks().get(n).getName()+" is schedulable.\n");
					partition.getTasks().get(n).setScheduleable(true);
				}
			});
		return sb.toString();
	}

	/**
	 * Compares Intervals by start time
	 * @author Gustavo
	 */
	public static int intervalByStart(Interval a, Interval b) {
		return Double.compare(a.getStart(), b.getStart());
	}
	
	/**
	 * Compares Tasks by periods such that higher frequency tasks have a higher priority
	 * @author Gustavo
	 *
	 */
	public static int rateMonotonic(Task o1, Task o2) {
		return Double.compare(o1.getCharacteristicPeriod(), o2.getCharacteristicPeriod());
	}
	
	/**
	 * Sorts task into ascending order based on user defined-priority
	 * @author Gustavo
	 */
	public static int fixedPriority(Task o1, Task o2) {
		return Integer.compare(o2.getPriority(), o1.getPriority());
	}
	
	/**
	 * Sorts task into ascending order based on implicit deadline
	 * @author Gustavo
	 *
	 */
	public static int deadlineMonotonic(Task o1, Task o2) {
		return Double.compare(o1.getImplicitDeadline(), o2.getImplicitDeadline());
	}
	
	
	
}
