package analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import fr.ensma.realtimescheduling.Connection;
import fr.ensma.realtimescheduling.Network;
import fr.ensma.realtimescheduling.Port;
import fr.ensma.realtimescheduling.Route;
import fr.ensma.realtimescheduling.Switch;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * Holds supplementary meta-data about flows used during the
 * end to end delay analysis. The following data is maintained:
 * 
 * ETE response time
 * Response bound function for a node in this flow
 * Static list of nodes traversed by this route
 * first node
 * last node (last output port before destination)
 * List of minimum cumulative delays to a node on this route
 * List of maximal cumulative delays to a node on this route
 * List of jitter values for all nodes on this route
 * List of Bklg values for all nodes on this route
 * @author Gustavo
 *
 */
public class Flow {
	
	double ETEDelay;
	List<Port> P_i = new ArrayList<>();
	Port first;
	Port last;
	
	double[] S_min;
	double[] S_max;
	double[] J;
	double[] Bklg;
	
	VirtualLink link;
	Route r;
	
	//already sorted by rank
	
	/**
	 * Given a physical description of a network, 
	 * a logical virtual link between 1 -> n modules
	 * and a route, constructs a flow.
	 * @param net Physical network
	 * @param l logical virtual link
	 * @param r 
	 */
	public Flow(Network net, Route r){
		System.out.println("Flow constructor invoked.");
		this.link = ((VirtualLink)r.eContainer());
		this.r = r;
		Collection<Connection> allConnections = new ArrayList<>(r.getConnections());
		//only one port in the source is part of this flow
		first = link.getSource().getModulePorts().stream().filter(esp -> r.getConnections().contains(esp.getConnection())).findFirst().get();
		P_i.add(first);
		Port current = first;
		//walk the connections, gathering output ports along the way
		while(allConnections.size() != 1) { //stop at one because we don't care about last link
			allConnections.remove(current.getConnection()); //done with link
			current = getOpposite(current, current.getConnection()); //move to the next port
			//find port on switch that is output port on this route
			//eContainer is, in fact, the containing object. Possible to cast as you see.
			current = ((Switch)(current.eContainer())).getSwitchPorts().stream().filter(sp -> allConnections.contains(sp.getConnection())).findFirst().get();
			P_i.add(current);
		}
		last = current;
		S_min = new double[P_i.size()];
		S_max = new double[P_i.size()];
		J = new double[P_i.size()];
		Bklg = new double[P_i.size()];
	}
	
	/**
	 * Gets the rank of a node from this flow, where rank
	 * is the position along the route, 1 indexed
	 * @param p
	 * @return
	 */
	public int rankOf(Port p) {
		return P_i.indexOf(p) + 1;
	}
	
	public void setSmin(Port p, double newValue) {
		S_min[P_i.indexOf(p)] = newValue;
	}
	
	public Port successor(Port p) {
		return P_i.get(P_i.indexOf(p) + 1);
	}
	
	public void setSmax(Port p, double newValue) {
		S_max[P_i.indexOf(p)] = newValue;
	}
	
	public void calculateJitterFor(Port p) {
		J[P_i.indexOf(p)] = S_max[P_i.indexOf(p)] - S_min[P_i.indexOf(p)];
	}
	
	//magic maximization function here
	//i'm thinking the problem is here
	public void calculateBklgFor(PortWrapper p, Function<Double, Double> W) {
		double B_h = p.B();
		double max = 0.0;
		double C = link.getMaxFrameSize() / p.port.getBandwidth();
		for (double t = 0.0; t <= B_h; t += B_h / 1000.0) {
			double c = W.apply(t) - C - t;
			if(c > max) {
				max = c;
			}
		}
		Bklg[P_i.indexOf(p.port)] = max;
	}
	
	public double BklgFor(Port p) {
		return Bklg[P_i.indexOf(p)];
	}
	
	public double SmaxFor(Port p) {
		return S_max[ P_i.indexOf(p) ];
	}
	
	public double jitterFor(Port p) {
		return J[P_i.indexOf(p)];
	}
	
	
	@Override
	public String toString() {
		String s = "{";
		for (Port p : P_i) {
			s += p.toString();
		}
		s+="}";
		return s;
	}
	
	private Port getOpposite(Port p , Connection c) {
		return p.getConnection().getPorts().stream().filter(port -> port != p).findFirst().get();
	}
	
	public double RBF(Port port, double t) {
		return (1 + Math.floor((t + jitterFor(port)) / link.getMinInterFrameTime())) * link.getMaxFrameSize()/port.getBandwidth();
	}
	
	
	
	
}
