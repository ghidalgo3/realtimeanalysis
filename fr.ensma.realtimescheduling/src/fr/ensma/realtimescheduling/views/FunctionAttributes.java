package fr.ensma.realtimescheduling.views;

import java.util.function.BiFunction;
import fr.ensma.realtimescheduling.Partition;

/**
 * This enum holds some meta-data about a function that will be
 * graphed such as graph title, domain name, range name. It also
 * servers to dynamically bind the function used for graph generation
 * so we don't need to use a switch statement in the ChartView.
 * @author Gustavo
 *
 */
public enum FunctionAttributes {
	
	SUPPLY("Supply", "Time", "Supply", PartitionGraphingFunctions::getSupply),
	INVERSE_SUPPLY("Inverse Supply", "Supply", "Time", PartitionGraphingFunctions::getInverseSupply),
	LEAST_SUPPLY("Least Supply", "Time width", "Least supply", PartitionGraphingFunctions::getLeastSupply);
	
	private String title;
	private String domainName;
	private String rangeName;
	private BiFunction<Partition, Integer, double[][]> function;
	
	private FunctionAttributes(String title, String domainName, String rangeName, BiFunction<Partition, Integer, double[][]> f) {
		this.title = title;
		this.domainName = domainName;
		this.rangeName = rangeName;
		this.function = f;
	}

	/**
	 * Title for displaying on the graph
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * X axis domain name
	 * @return
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Y axis domain name
	 * @return
	 */
	public String getRangeName() {
		return rangeName;
	}
	
	/**
	 * Returns a 2D array of doubles to plot on a JFreeChart object
	 * given a partition and a number of periods. The function
	 * used depends on the identity of 'this' FunctionAttribute
	 * @param p partition
	 * @param periods number of periods to graph
	 * @return data
	 */
	public double[][] generateData(Partition p, int periods) {	
		return function.apply(p, periods);
	}
	
}
