package analysis;

import java.util.List;
import java.util.stream.Collectors;
import fr.ensma.realtimescheduling.Port;

/**
 * Contains meta-data about a node for the forward-analysis
 * algorithm. A node is any port that serves as an output port.
 * We disregard input ports.
 * @author Gustavo
 *
 */
class PortWrapper {
	
	Port port;
	
	/**
	 * Maximum rank of a node
	 */
	int order;
	/**
	 * Analytical value from algorithm
	 */
	private double B; private boolean B_calc;
	/**
	 * Analytical value from algorithm
	 */
	private double BP; private boolean BP_calc;
	List<Flow> flowsThroughMe;
	

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
		flowsThroughMe = allFlows.stream().filter(flow -> flow.P_i.contains(port)).collect(Collectors.toList());
		order = flowsThroughMe.stream().mapToInt(flow -> {
			return flow.P_i.indexOf(port) + 1; //get rank from each flow
		}).max().getAsInt(); //get the maximum rank
		port.setOrder(order);
	}
	
	
	/**
	 * Calculates B from the paper, lazily evaluated
	 * @return B 
	 */
	double B() {
		if(B_calc) {return B;}
		double a = BP() + flowsThroughMe.stream()
				.mapToDouble(flow -> {
					double alpha = (1 + Math.floor(flow.jitterFor(port)/flow.link.getMinInterFrameTime())) * flow.link.getMinInterFrameTime() - flow.jitterFor(port);
					System.out.println("Alpha calculation for port "+port.getId()+" by flow "+flow.link.getId()+" is "+alpha+".");
					return alpha;
				})
				.max()
				.getAsDouble();
		B_calc = true;
		B = a;
		System.out.println("BP for "+port.getId()+" is "+BP);
		System.out.println("B for "+port.getId()+" is "+B);
		return a;
	}
	
	/**
	 * Longest busy period calculation. Fixed point computation.
	 * lazily evaluated
	 * @return longest busy period
	 */
	double BP() {
		if(BP_calc) {return BP;}
		double a = flowsThroughMe
				.stream()
				.mapToDouble(flow -> flow.link.getMaxFrameSize() / port.getBandwidth()) //sum of transmission delay
				.sum();
		double b = -1;
		do { //an arbitrary epsilon
			System.out.println("Difference between a and b: " + Math.abs(a - b));
			b = a;
			final double b_ = b; //dumb java closure restrictions
			a = flowsThroughMe
					.stream()
					.mapToDouble(flow ->
						Math.ceil(b_ / flow.link.getMinInterFrameTime()) * flow.link.getMaxFrameSize()/port.getBandwidth())
					.sum();
		} while(a != b || Math.abs(a - b) > 0.0001);
		System.out.println("Difference between a and b at fixed point: " + Math.abs(a - b));
		BP = a;
		BP_calc = true;
		return a;
	}
	
	@Override
	public String toString() {
		return String.format("PortWrapper: {Port: %s, Order: %d, Flows Through Me: %s}",
				port.getId(),
				order,
				flowsThroughMe.stream().reduce("", (str,  flow) -> str +", "+flow.link.getId(), (a,b) -> a+", "+b));
	}
	
}
