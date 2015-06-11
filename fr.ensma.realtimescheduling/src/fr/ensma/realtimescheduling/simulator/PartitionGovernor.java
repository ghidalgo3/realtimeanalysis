package fr.ensma.realtimescheduling.simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import analysis.PartitionUtils;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Task;

/**
 * This class runs a DES for simulating
 * @author Gustavo
 *
 */
public class PartitionGovernor {
	
	private Partition p;
	private List<Interval> basisIntervals;
	private List<Task> allTasks;
	private Timeline timeline;
	private PriorityQueue<Task> taskQueue;
	
	public PartitionGovernor(Partition p) {
		this.p = p;
		basisIntervals = PartitionUtils.sortedIntervals(p);
		allTasks = new ArrayList<>(p.getTasks());
		taskQueue = new PriorityQueue<>(PartitionUtils.getComparator(p));
		timeline = new Timeline();
	}
	
	public void simulate(double until) {
		//deliver all tasks
		taskQueue.addAll(allTasks);
		while(timeline.getCurrentTime().time <= until) {
			timeline.dequeue().execute();
		}
	}
}
