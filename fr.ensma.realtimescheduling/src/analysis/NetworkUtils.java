package analysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import fr.ensma.realtimescheduling.Node;
import fr.ensma.realtimescheduling.VirtualLink;

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
	 */
	public static List<Node> getVLNodes(VirtualLink link) {
		Set<Node> startCandidates = new HashSet<Node>(link.getNodes());
		Node start;
		for(Iterator<Node> iter = startCandidates.iterator(); startCandidates.size() != 1;) {
			start = iter.next();
			final Node s = start;
			if(startCandidates.stream().anyMatch(node -> node.getRealLinks().stream().anyMatch(next -> next.equals(s)))) {
				iter.remove();
			}
		}
		//first find the node that is not the successor of any other node
		Node start2 = startCandidates.iterator().next();
		List<Node> accum = new ArrayList<Node>(link.getNodes().size());
		accum.add(start2);
		//then add the rest of the nodes in order starting with the start node
		while(start2.getVirtualLinks().size() != 0) {
			start = start2.getRealLinks().stream().filter(n -> link.getNodes().contains(n)).findAny().get();
			accum.add(start2);
		}
		return accum;
	}
}
