package fr.ensma.realtimescheduling.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import fr.ensma.realtimescheduling.Connection;
import fr.ensma.realtimescheduling.Port;
import fr.ensma.realtimescheduling.Route;
import fr.ensma.realtimescheduling.Switch;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * Holds supplementary meta-data about flows used during the end to end delay
 * analysis. The following data is maintained: ETE response time Response bound
 * function for a node in this flow Static list of output nodes traversed by
 * this route Static list of input nodes traversed by this route first node last
 * node (last output port before destination) List of minimum cumulative delays
 * to a node on this route List of maximal cumulative delays to a node on this
 * route List of jitter values for all nodes on this route List of Bklg values
 * for all nodes on this route
 * 
 * @author Gustavo
 * 
 */
public class Flow {

	double ETEDelay;
	List<Port> P_i = new ArrayList<>();
	List<Port> inputs = new ArrayList<>();
	Port first;
	Port last;

	double[] S_min;
	double[] S_max;
	double[] J;
	double[] Bklg;

	public VirtualLink link;
	Route r;

	// already sorted by rank

	/**
	 * Given a physical description of a network, a logical virtual link between
	 * 1 -> n modules and a route, constructs a flow.
	 * 
	 * @param net
	 *            Physical network
	 * @param l
	 *            logical virtual link
	 * @param r
	 */
	Flow(Route r) {
		this.link = ((VirtualLink) r.eContainer());
		this.r = r;
		Collection<Connection> allConnections = new ArrayList<>(
				r.getConnections());
		// only one port in the source is part of this flow
		first = link
				.getSource()
				.getModulePorts()
				.stream()
				.filter(esp -> r.getConnections().contains(esp.getConnection()))
				.findFirst().get();
		P_i.add(first);
		Port current = first;
		// walk the connections, gathering output ports along the way
		System.out.println("Traversing "
				+ ((VirtualLink) r.eContainer()).getId());
		while (allConnections.size() != 1) { // stop at one because we don't
												// care about last link
			System.out.println("Current belongs to a "
					+ (current.eContainer() instanceof Switch ? "Switch"
							: "EndSystem"));
			allConnections.remove(current.getConnection()); // done with link
			current = getOpposite(current); // move to the next port
			inputs.add(current); // current in an input port
			// find port on switch that is output port on this route
			// eContainer is, in fact, the containing object. Possible to cast
			// as you see.
			current = ((Switch) (current.eContainer())).getSwitchPorts()
					.stream()
					.filter(sp -> allConnections.contains(sp.getConnection()))
					.findFirst().get();
			P_i.add(current);
		}
		last = current;
		S_min = new double[P_i.size()];
		S_max = new double[P_i.size()];
		J = new double[P_i.size()];
		Bklg = new double[P_i.size()];
	}

	Port getInputTo(Port p) {
		return inputs.get(P_i.indexOf(p) - 1);
	}

	/**
	 * Gets the rank of a node from this flow, where rank is the position along
	 * the route, 1 indexed
	 * 
	 * @param p
	 * @return
	 */
	int getRankOf(Port p) {
		return P_i.indexOf(p) + 1;
	}

	void setSmin(Port p, double newValue) {
		S_min[P_i.indexOf(p)] = newValue;
	}

	Port getSuccessor(Port p) {
		return P_i.get(P_i.indexOf(p) + 1);
	}

	void setSmax(Port p, double newValue) {
		S_max[P_i.indexOf(p)] = newValue;
	}

	void setJitterFor(Port p) {
		J[P_i.indexOf(p)] = S_max[P_i.indexOf(p)] - S_min[P_i.indexOf(p)];
	}

	/**
	 * Calculates the maximum of the Bklg function between 0 and B^h Really just
	 * samples the function at 1000 points between 0 and B and takes the maximum
	 * value
	 * 
	 * @param p
	 * @param W
	 */
	void calculateBklgFor(PortWrapper p, Function<Double, Double> W) {
		double B_h = p.B();
		double max = 0.0;
		double C = link.getMaxFrameSize() / p.port.getBandwidth();
		for (double t = 0.0; t <= B_h; t += B_h / 2000.0) {
			double w = W.apply(t);
			double c = w - C - t;
			if (c > max) {
				max = c;
			}
		}
		Bklg[P_i.indexOf(p.port)] = max;
	}

	double getBklgFor(Port p) {
		return Bklg[P_i.indexOf(p)];
	}

	double getSmaxFor(Port p) {
		return S_max[P_i.indexOf(p)];
	}

	double getJitterFor(Port p) {
		return J[P_i.indexOf(p)];
	}


	@Override
	public String toString() {
		String s = "VL : " + link.getId() + " {";
		for (Port p : P_i) {
			s += p.getId() + " -> ";
		}
		s += "}";
		return s;
	}

	public static Port getOpposite(Port p) {
		return p.getConnection().getA() == p ? p.getConnection().getB() : p
				.getConnection().getA();
	}

	double RBF(Port port, double t) {
		return (1 + Math.floor((t + getJitterFor(port))
				/ link.getBAG()))
				* link.getMaxFrameSize() / port.getBandwidth();
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return 1;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (obj == null) { return false; }
		if (!(obj instanceof Flow)) { return false; }
		Flow other = (Flow) obj;
		return this.link == other.link;
	}


}
