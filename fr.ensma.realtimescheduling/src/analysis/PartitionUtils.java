package analysis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.SchedulingAlgorithm;
import fr.ensma.realtimescheduling.Task;


/**
 * Utility methods for partitions
 * 
 * @author Gustavo Hidalgo
 * @version 1.0
 */
public class PartitionUtils {

	
	/**
	 * Gets the start time of the earliest interval
	 * @return earlist start time
	 */
	public static double getMinimumStart(Partition p) {
		return p.getExecutionIntervals().stream().min(ModelInterface::intervalByStart).get().getStart();
	}
	
	/**
	 * Gets the end time of the last interval for the first cycle
	 * of the partition
	 * @return latest end time for one cycle
	 */
	public static double getLastIntervalEnd(Partition p) {
		return p.getExecutionIntervals().stream().max(ModelInterface::intervalByStart).get().getEnd();
	}
	

	/**
	 * Calculate the supply function at some time for this partition
	 * 
	 * @param t
	 *            argument to the function
	 * @return supply at that point
	 */
	public static double supply(Partition p, double t) {
		int n = p.getExecutionIntervals().size();
		double accum = 0.0;
		double period = p.getPeriod();
		List<Interval> intervals = sortedIntervals(p); //REMEMBER TO DO THIS OR ALL HELL BREAKS LOSE
		
		double supplyPerPeriod = intervals.stream().mapToDouble(i -> i.getEnd() - i.getStart()).sum();
		double periodsCompleted = Math.floor(t / period);
		t -= periodsCompleted * period;
		for(int i = 0; i < n && t >= intervals.get(i).getStart(); i++) {
			accum += Math.min(t - intervals.get(i).getStart(),
					intervals.get(i).getEnd() - intervals.get(i).getStart());
		}
		return accum + supplyPerPeriod * periodsCompleted;
	}

	/**
	 * Calculate the inverse supply function for some supply value
	 * 
	 * @param sf
	 *            argument to function
	 * @return inverse suppy
	 */
	public static double inverseSupply(fr.ensma.realtimescheduling.Partition p, double sf) {
		int n = p.getExecutionIntervals().size();
		List<Interval> intervals = sortedIntervals(p);
		double period = p.getPeriod();
		double sp = 0;
		for (int i = 0; i < intervals.size(); i++) {
			sp += intervals.get(i).getEnd() - intervals.get(i).getStart();
		}
		double k = Math.floor(sf / sp);
		double st = sf - sp * k;
		double t;
		if (st == 0) { // this might never happen
			t = period * (k - 1) + intervals.get(n - 1).getEnd();
		} else {
			t = period * k;
			int i = 0;
			double tl = 0.0;
			for (i = 0; i < n && st > 0; i++) {
				tl = Math.min(st, intervals.get(i).getEnd() - intervals.get(i).getStart());
				st = st - tl;
			}
			if (i > 0) {
				i--;
			}
			t += intervals.get(i).getStart() + tl;
		}
		return t;
	}
	
	/**
	 * The user may create intervals in a partition that are unsorted and for the analysis
	 * and graphing we need the intervals to be sorted. Unfortunately direct manipulation
	 * of the EList results in exceptions thus we need to extract the list and create a sorted
	 * copy. This method does that.
	 * @param p partition
	 * @return sorted intervals in a partition
	 */
	public static List<Interval> sortedIntervals(Partition p) {
		return p.getExecutionIntervals()
				.stream()
				.sorted(ModelInterface::intervalByStart)
				.collect(Collectors.toList());
	}

	/**
	 * Calculates the least supply function for this partition
	 * at some time.
	 * 
	 * @param t
	 *            argument to function
	 * @return least supply
	 */
	public static double leastSupply(Partition p, double t) {
		List<Interval> intervals = sortedIntervals(p);
		double sf = supply(p, t + intervals.get(0).getEnd())
				- supply(p, intervals.get(0).getEnd());
		for (int i = 1; i < intervals.size(); i++) {
			sf = Math.min(sf,
					  supply(p, t+intervals.get(i).getEnd())
					- supply(p,   intervals.get(i).getEnd())
					);
		}
		return sf;
	}
	
	/**
	 * Gives a comparator from the selected scheduling algorithm in a partition
	 * @param p partition
	 * @return comparator
	 */
	public static Comparator<Task> getComparator(Partition p) {
		switch (p.getSchedulingAlgorithm().getValue()) {
		case SchedulingAlgorithm.DEADLINE_MONOTONIC_VALUE:
			return ModelInterface::deadlineMonotonic;
		case SchedulingAlgorithm.FIXED_PRIORITY_VALUE:
			return ModelInterface::fixedPriority;
		case SchedulingAlgorithm.RATE_MONOTONIC_VALUE:
			return ModelInterface::rateMonotonic;
		default:
			return null;
		}
	}
}