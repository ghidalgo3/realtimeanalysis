package analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import fr.ensma.realtimescheduling.Node;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * Holds supplementary meta-data about virtual links that
 * is used during the end-to-end analysis
 * @author Gustavo
 *
 */
public class VLWrapper {
	
	public VirtualLink link;
	List<Double> S_min;
	List<Double> S_max;
	List<Double> J;
	
	//already sorted by rank
	List<Node> nodes;
	
	
	public VLWrapper(VirtualLink link){
		S_min = new ArrayList<>(Collections.nCopies(link.getNodes().size(), 0.0));
		S_max = new ArrayList<>(Collections.nCopies(link.getNodes().size(), 0.0));
		J =     new ArrayList<>(Collections.nCopies(link.getNodes().size(), 0.0));
//		nodes = (NetworkUtils.getVLNodes(link));
		this.link = link;
	}
	
	/**
	 * Calculates the jitter for a node of this virtual link
	 * and returns that value. J = S_max - S_min;
	 * 
	 * @param order 
	 * @return
	 */
	public double calculateJitter(int order) {
		double val = S_max.get(order-1) - S_min.get(order-1);
		J.set(order-1, val);
		return val;
	}
	
	/**
	 * Gets the jitter for a node
	 * @param node
	 * @return
	 */
	public double jitterForNode(Node node) {
		if(!nodes.contains(node)) {
			throw new IllegalArgumentException("Node not on this virtual link");
		}
		return J.get(nodes.indexOf(node));
	}
	
	public int rankForNode(Node node) {
		return 1 + nodes.indexOf(node);
	}
	
	public double getSMin(Node n) {
		return S_min.get(nodes.indexOf(n));
	}
	
	public double getSMax(Node n) {
		return S_max.get(nodes.indexOf(n));
	}
	
	public void setNextSMin(Node n, double value) {
		S_min.set(nodes.indexOf(n) + 1, value);
	}
	
	public void setNextSMax(Node n, double value) {
		S_max.set(nodes.indexOf(n) + 1, value);
	}
	
	
	
	
}
