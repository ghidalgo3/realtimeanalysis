package fr.ensma.realtimescheduling.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import analysis.PartitionUtils;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Partition;

/**
 * This class holds the functions to generate data for graphing.
 * These functions have to handle special cases for the graphs to look good.
 * @author Gustavo
 */
public class PartitionGraphingFunctions {
	
	/**
	 * Calculates the inverse supply function for an partition
	 * by sampling with 200 data points.
	 * @param p
	 * @return
	 */
	public static double[][] getInverseSupply(Partition p, int n) {
		return makeFunction((x) -> PartitionUtils.inverseSupply(p,x), 0, p.getPeriod()*n, 200);
	}
	
	/**
	 * Helper method to create a data array from an arbitrary function of double -> double.
	 * @param f function
	 * @param start interval start
	 * @param end interval end
	 * @param samples number of equally spaced samples to take
	 * @return data such that it can be used by an XYDataset
	 */
	public static double[][] makeFunction(Function<Double, Double> f, double start, double end, int samples) {
		double step = (end-start)/samples;
		double[][] results = new double[2][samples];
		for(int i = 0; i < samples; i++) {
			results[0][i] = i*step;
			results[1][i] = f.apply(i*step);
		}
		return results;
	}

	/**
	 * Calculates the supply function for one period of this partition
	 * @param result
	 */
	public static double[][] getSupply(Partition p, int n) {
//		return makeFunction((x) -> PartitionUtil.supply(p, x), 0, p.getPeriod()*2, 100);
		return makeFunction(x -> PartitionUtils.supply(p, x), 0, p.getPeriod()*n, 200);
	}
	
	/**
	 * Some of the graphs for the functions can be generated CORRECTLY by applying the functions
	 * at the extremes of intervals and connecting the lines. This method abstracts
	 * that procedure over one period
	 * 
	 * On hold for now, this one is tricky to get right
	 * @param p partition to graph
	 * @param f function used for graphing at the extremes of intervals
	 * @return data sent to the graph (JFreeChart)
	 */
	private static double[][] applyAtIntervalExtremes(Partition p, BiFunction<Partition, Double, Double> f, int n) {
		List<Interval> intervals = PartitionUtils.sortedIntervals(p);
		
		List<Double> xs = new ArrayList<>(intervals.size()*2*n);
		xs.addAll(Collections.nCopies(p.getExecutionIntervals().size()*2*n, 0.0));
		
		List<Double> ys = new ArrayList<>(intervals.size()*2*n);
		ys.addAll(Collections.nCopies(p.getExecutionIntervals().size()*2*n, 0.0));
		for(int period = 0; period < n; period++) {
			for (int i = 0; i < p.getExecutionIntervals().size(); i++) {
				xs.set(i*2+period*intervals.size(),
						intervals.get(i).getStart()+period*p.getPeriod());
				ys.set(i*2+period*intervals.size(),
						f.apply(p, intervals.get(i).getStart()+period*p.getPeriod()));
				
				xs.set(i*2+1+period*intervals.size(),
						intervals.get(i).getEnd()+period*p.getPeriod());
				ys.set(i*2+1+period*intervals.size(),
						f.apply(p, intervals.get(i).getEnd()+period*p.getPeriod()));
			}
		}
		
		if(PartitionUtils.getMinimumStart(p) != 0.0) {
			xs.add(0, 0.0);
			ys.add(0, 0.0);
		}
		if(PartitionUtils.getLastIntervalEnd(p) != p.getPeriod()) {
			xs.add(p.getPeriod()*n);
			ys.add(f.apply(p, p.getPeriod()*n));
		}
		double[][] data = new double[2][xs.size()];
		for(int i = 0; i < xs.size(); i++) {
			data[0][i] = xs.get(i);
			data[1][i] = ys.get(i);
		}
		return data;
	}
	
	/**
	 * Calculates the least supply data array over 2 periods for a partition
	 * @param p
	 * @return
	 */
	public static double[][] getLeastSupply(Partition p, int n) {
		return makeFunction((x) -> PartitionUtils.leastSupply(p, x), 0, p.getPeriod() * n, 200);
	}
}
