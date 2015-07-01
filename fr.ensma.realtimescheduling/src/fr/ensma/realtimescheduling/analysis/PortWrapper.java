package fr.ensma.realtimescheduling.analysis;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import fr.ensma.realtimescheduling.Port;

/**
 * Contains meta-data about a node for the forward-analysis algorithm. A node is
 * any port that serves as an output port. We disregard input ports.
 * 
 * @author Gustavo
 */
public class PortWrapper {

	public Port port;

	/**
	 * Maximum rank of a node
	 */
	int order;
	/**
	 * Analytical value from algorithm
	 */
	private double B;
	private boolean B_calc;
	/**
	 * Analytical value from algorithm
	 */
	private double BP;
	private boolean BP_calc;

	public Collection<Flow> flowsThroughMe;
	Set<Port> inputsToMe = new HashSet<>();
	Map<Port, Set<Flow>> flowsForInput = new HashMap<>();

	/**
	 * Constructs a NodeWrapper with a Node object and a list of VLWrappers.
	 * This NodeWrapper will check the list passed in and retain all VLWrappers
	 * that have a VirtualLink that traverses this node.
	 * 
	 * @param node
	 * @param allLinks
	 */
	PortWrapper(Port port, List<Flow> allFlows) {
		this.port = port;
		flowsThroughMe = allFlows.stream()
				.filter(flow -> flow.P_i.contains(port))
				.collect(Collectors.toList());
		order = flowsThroughMe.stream().mapToInt(flow -> flow.getRankOf(port))
				.max().getAsInt(); // get the maximum rank
		if (order != 1) {
			flowsThroughMe.stream().map(flow -> flow.getInputTo(port))
					.forEach(p -> inputsToMe.add(p));
			for (Port input : inputsToMe) {
				Set<Flow> flowsThroughInput = flowsThroughMe.stream()
						.filter(flow -> flow.inputs.contains(input))
						.collect(Collectors.toSet());
				flowsForInput.put(input, flowsThroughInput);
			}

		}
		port.setOrder(order);
	}


	/**
	 * Calculates B from the paper, lazily evaluated
	 * 
	 * @return B
	 */
	double B() {
		if (B_calc) { return B; }
		double a = BP()
				+ flowsThroughMe
						.stream()
						.mapToDouble(
								flow -> (1 + Math.floor(flow.getJitterFor(port)
										/ flow.link.getBAG()))
										* flow.link.getBAG()
										- flow.getJitterFor(port)).max()
						.getAsDouble();
		B_calc = true;
		B = a;
		return a;
	}

	/**
	 * Longest busy period calculation. Fixed point computation. lazily
	 * evaluated
	 * 
	 * @return longest busy period
	 */
	double BP() {
		if (BP_calc) { return BP; }
		double a = flowsThroughMe
				.stream()
				.mapToDouble(
						flow -> flow.link.getMaxFrameSize()
								/ port.getBandwidth()) // sum of transmission
														// delay
				.sum();
		double b = -1;
		do { // an arbitrary epsilon
			b = a;
			final double b_ = b; // dumb java closure restrictions
			a = flowsThroughMe
					.stream()
					.mapToDouble(
							flow -> Math.ceil(b_
									/ flow.link.getBAG())
									* flow.link.getMaxFrameSize()
									/ port.getBandwidth()).sum();
		} while (a != b || Math.abs(a - b) > 0.0001);
		BP = a;
		BP_calc = true;
		return a;
	}

	@Override
	public String toString() {
		return String.format(
				"PortWrapper: {Port: %s, Order: %d, Flows Through Me: %s}",
				port.getId(),
				order,
				flowsThroughMe.stream().reduce("",
						(str, flow) -> str + ", " + flow.link.getId(),
						(a, b) -> a + ", " + b));
	}

}
