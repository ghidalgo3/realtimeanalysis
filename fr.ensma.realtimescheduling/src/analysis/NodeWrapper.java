package analysis;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import fr.ensma.realtimescheduling.Node;

/**
 * Contains meta-data about a node for the forward-analysis
 * algorithm
 * @author Gustavo
 *
 */
public class NodeWrapper {
	
	Node node;
	private Function<VLWrapper, Double> B_function = (VLWrapper vlw) -> {
		return (1 + Math.floor(vlw.jitterForNode(node) / vlw.link.getMinInterFrameTime())) * vlw.link.getMinInterFrameTime() - vlw.jitterForNode(node);
	};
	
	/**
	 * Maximum rank of a node
	 */
	public final int order;
	private double B; boolean B_calc;
	private double BP; boolean BP_calc;
	List<VLWrapper> linksThroughMe;
	

	/**
	 * Constructs a NodeWrapper with a Node object and a list of VLWrappers.
	 * This NodeWrapper will check the list passed in and retain all VLWrappers
	 * that have a VirtualLink that traverses this node.
	 * 
	 * @param node
	 * @param allLinks
	 */
	public NodeWrapper(Node node, List<VLWrapper> allLinks) {
		this.node = node;
		linksThroughMe = allLinks.stream().filter(vlw -> vlw.rankForNode(node) > 0).collect(Collectors.toList());
		order = linksThroughMe.stream().mapToInt(vlw -> vlw.rankForNode(node)).max().getAsInt();
	}
	
	
	/**
	 * Calculates B from the paper, lazily evaluated
	 * @return B 
	 */
	public double B() {
		if(B_calc) {return B;}
		double a = BP() + B_function.apply(
				linksThroughMe.stream()
				.max(Comparator.comparing(B_function))
				.get());
		B_calc = true;
		B = a;
		return a;
	}
	
	/**
	 * Longest busy period calculation. Fixed point algorithm.
	 * lazily evaluated
	 * @return longest busy period
	 */
	public double BP() {
		if(BP_calc) {return BP;}
		double a = node.getVirtualLinks().stream().mapToDouble(vl -> node.getTransmissionDelay()).sum();
		double b = -1;
		while(a != b) {
			b = a;
			double b_ = b; //dumb java final restrictions
			a = node.getVirtualLinks()
					.stream()
					.mapToDouble(vl ->
						Math.ceil(b_ / vl.getMinInterFrameTime()) * node.getTransmissionDelay())
					.sum();
		}
		BP = a;
		BP_calc = true;
		return a;
	}
	
	/**
	 * Sums the RBF function for all VLs running through this node.
	 * @param t
	 * @return
	 */
	public double RBFallVLs(double t) {
		return linksThroughMe
			.stream()
			.mapToDouble(vlw -> {
				return (1 + Math.floor((t + vlw.jitterForNode(this.node)) / vlw.link.getMinInterFrameTime())) * node.getTransmissionDelay();
			}).sum();
	}
	
}
