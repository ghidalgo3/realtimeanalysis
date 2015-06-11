package analysis;


/**
 * Utility methods for networks
 * 
 * @author Gustavo
 *
 */
public class NetworkUtils {
	
	
	/**
	 * Identifies the list of nodes associated with a virtual link
	 * and sorts them topologically.
	 * 
	 * @param link virtual link
//	 */
//	public static List<Node> getVLNodes(VirtualLink link) {
//		Set<Node> startCandidates = new HashSet<Node>(link.getNodes());
//		Node start;
//		for(Iterator<Node> iter = startCandidates.iterator(); startCandidates.size() != 1;) {
//			start = iter.next();
//			final Node s = start;
//			if(startCandidates.stream().anyMatch(node -> node.getRealLinks().contains(s))) {
//				iter.remove();
//			}
//		}
//		//first find the node that is not the successor of any other node
//		Node start_node = startCandidates.iterator().next();
//		List<Node> accum = new ArrayList<Node>(link.getNodes().size());
//		accum.add(start_node);
//		Node current = start_node;
//		//then add the rest of the nodes in order starting with the start node
//		while(current.getRealLinks().size() != 0) {
//			current = current.getRealLinks().stream().filter(n -> link.getNodes().contains(n)).findAny().get();
//			accum.add(current);
//		}
//		return accum;
//	}
	
	
}
