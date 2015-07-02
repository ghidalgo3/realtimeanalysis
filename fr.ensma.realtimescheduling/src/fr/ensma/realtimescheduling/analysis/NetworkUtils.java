package fr.ensma.realtimescheduling.analysis;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import fr.ensma.realtimescheduling.Connection;
import fr.ensma.realtimescheduling.Module;
import fr.ensma.realtimescheduling.Port;
import fr.ensma.realtimescheduling.Route;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * Utility method for traversing or interpreting a network definition from a
 * model instance
 * 
 * @author Gustavo
 */
public class NetworkUtils {

	/**
	 * Extracts all of the output ports out of the flows in a system
	 * 
	 * @param gamma
	 * @return
	 */
	public static Set<Port> extractOutputPorts(List<Flow> gamma) {
		Set<Port> allOutputPorts = gamma.stream()
				.flatMap(flow -> flow.P_i.stream()).collect(Collectors.toSet());
		return allOutputPorts;
	}

	/**
	 * Creates a flow for each route in the system
	 * 
	 * @param system
	 *            with hardware defined
	 * @return All of the flows
	 */
	public static List<Flow> extractFlows(
			fr.ensma.realtimescheduling.System system) {
		List<Flow> gamma = system.getSoftware().getVirtualLinks()
				.stream().flatMap(vl -> vl.getRoutes().stream())
				.map(route -> new Flow(route)).collect(Collectors.toList());// now
																			// need
																			// to
																			// create
																			// PortWrapperss
		return gamma;
	}

	/**
	 * This function needs to be visible by the validator because there is an
	 * algorithmic constraint on ports that says that the sum of C_j / T_j for
	 * every flow V_j through a port h should sum to be less than or equals to
	 * 1;
	 * 
	 * @param ports
	 *            All output ports
	 * @param flows
	 *            All flows in the network
	 * @return A collection of port wrappers which know which flows flow through
	 *         them
	 */
	public static Collection<PortWrapper> outputPortsToPortWrappers(
			Collection<Port> ports, List<Flow> flows) {
		return ports.stream().map(p -> new PortWrapper(p, flows))
				.collect(Collectors.toSet());
	}

	public static Module destinationForRoute(Route route) {
		VirtualLink virtualLink = (VirtualLink) route.eContainer();
		List<Connection> allConnections = route.getConnections();
		Stream<Port> destinationPortStream = virtualLink.getDestinations()
				.stream().flatMap(mod -> mod.getModulePorts().stream());
		return (Module) destinationPortStream
				.filter(port -> allConnections.stream().anyMatch(
						conn -> conn.getA() == port || conn.getB() == port))
				.findAny().get().eContainer();
	}

	/**
	 * Partitions port wrappers by order where order is defined as the maximum
	 * rank of a port by any flow running through it
	 * 
	 * @param portWrappers
	 * @return
	 */
	static Map<Integer, List<PortWrapper>> partitionByOrder(
			Collection<PortWrapper> portWrappers) {
		Map<Integer, List<PortWrapper>> byOrder = new TreeMap<>();
		IntStream
				.rangeClosed(
						1,
						portWrappers.stream().mapToInt(pw -> pw.order).max()
								.getAsInt()) // from 1 to max order
				.forEach(
						order -> {
							List<PortWrapper> thisOrder = portWrappers.stream()
									.filter(pw -> pw.order == order)
									.collect(Collectors.toList());
							byOrder.put(order, thisOrder);
						});
		return byOrder;
	}

	/**
	 * Forces all switch ports and module ports to have the same bandwidth
	 * 
	 * @param system
	 * @return The global network latency
	 */
	static int normalizeNetwork(fr.ensma.realtimescheduling.System system) {
		int networkLatency = system.getHardware().getNetwork()
				.getLatency();
		// all switches and all end systems will inherit the network bandwidth
		double networkBandwith = system.getHardware().getNetwork()
				.getNetworkBandwidth();
		system.getHardware().getNetwork().getSwitches().stream()
				.flatMap(s -> s.getSwitchPorts().stream())
				.forEach(port -> port.setBandwidth(networkBandwith));
		system.getHardware().getModules().stream()
				.flatMap(mod -> mod.getModulePorts().stream())
				.forEach(port -> port.setBandwidth(networkBandwith));
		return networkLatency;
	}

}
