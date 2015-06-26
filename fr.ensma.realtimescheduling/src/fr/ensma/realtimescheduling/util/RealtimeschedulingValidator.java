/**
 */
package fr.ensma.realtimescheduling.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.alg.ConnectivityInspector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import analysis.Flow;
import analysis.ModelInterface;
import analysis.NetworkUtils;
import analysis.PortWrapper;
import fr.ensma.realtimescheduling.Connection;
import fr.ensma.realtimescheduling.EndSystemPort;
import fr.ensma.realtimescheduling.HardwareResource;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Module;
import fr.ensma.realtimescheduling.Network;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Periodicity;
import fr.ensma.realtimescheduling.Port;
import fr.ensma.realtimescheduling.Processor;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.Route;
import fr.ensma.realtimescheduling.SchedulingAlgorithm;
import fr.ensma.realtimescheduling.SoftwareResource;
import fr.ensma.realtimescheduling.Switch;
import fr.ensma.realtimescheduling.SwitchPort;
import fr.ensma.realtimescheduling.Task;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage
 * @generated
 */
public class RealtimeschedulingValidator extends EObjectValidator {

	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final RealtimeschedulingValidator INSTANCE = new RealtimeschedulingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.ensma.realtimescheduling";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public RealtimeschedulingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RealtimeschedulingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RealtimeschedulingPackage.HARDWARE_RESOURCE:
				return validateHardwareResource((HardwareResource)value, diagnostics, context);
			case RealtimeschedulingPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case RealtimeschedulingPackage.MODULE:
				return validateModule((Module)value, diagnostics, context);
			case RealtimeschedulingPackage.PARTITION:
				return validatePartition((Partition)value, diagnostics, context);
			case RealtimeschedulingPackage.INTERVAL:
				return validateInterval((Interval)value, diagnostics, context);
			case RealtimeschedulingPackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case RealtimeschedulingPackage.SYSTEM:
				return validateSystem((fr.ensma.realtimescheduling.System)value, diagnostics, context);
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE:
				return validateSoftwareResource((SoftwareResource)value, diagnostics, context);
			case RealtimeschedulingPackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case RealtimeschedulingPackage.SWITCH:
				return validateSwitch((Switch)value, diagnostics, context);
			case RealtimeschedulingPackage.VIRTUAL_LINK:
				return validateVirtualLink((VirtualLink)value, diagnostics, context);
			case RealtimeschedulingPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case RealtimeschedulingPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case RealtimeschedulingPackage.ROUTE:
				return validateRoute((Route)value, diagnostics, context);
			case RealtimeschedulingPackage.SWITCH_PORT:
				return validateSwitchPort((SwitchPort)value, diagnostics, context);
			case RealtimeschedulingPackage.END_SYSTEM_PORT:
				return validateEndSystemPort((EndSystemPort)value, diagnostics, context);
			case RealtimeschedulingPackage.PERIODICITY:
				return validatePeriodicity((Periodicity)value, diagnostics, context);
			case RealtimeschedulingPackage.SCHEDULING_ALGORITHM:
				return validateSchedulingAlgorithm((SchedulingAlgorithm)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareResource(HardwareResource hardwareResource,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_PositiveWCET(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ExecutionAndDeadlineAllowsCompletion(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ExecutionAndPeriodAllowsCompletion(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DeadlineLessThanPeriod(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_PositivePeriod(task, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositiveWCET constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__POSITIVE_WCET__EEXPRESSION = "worstCaseExecTime > 0";

	/**
	 * Validates the PositiveWCET constraint of '<em>Task</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTask_PositiveWCET(Task task,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveWCET",
				 TASK__POSITIVE_WCET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the
	 * ExecutionAndDeadlineAllowsCompletion constraint of '<em>Task</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final String TASK__EXECUTION_AND_DEADLINE_ALLOWS_COMPLETION__EEXPRESSION = "worstCaseExecTime <= implicitDeadline";

	/**
	 * Validates the ExecutionAndDeadlineAllowsCompletion constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_ExecutionAndDeadlineAllowsCompletion(Task task,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExecutionAndDeadlineAllowsCompletion",
				 TASK__EXECUTION_AND_DEADLINE_ALLOWS_COMPLETION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the
	 * ExecutionAndPeriodAllowsCompletion constraint of '<em>Task</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final String TASK__EXECUTION_AND_PERIOD_ALLOWS_COMPLETION__EEXPRESSION = "\n" +
		"\t\tif (periodicity <> Periodicity::Aperiodic)\n" +
		"\t\t\tthen worstCaseExecTime <= characteristicPeriod\n" +
		"\t\t\telse true\n" +
		"\t\t\tendif";

	/**
	 * Validates the ExecutionAndPeriodAllowsCompletion constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_ExecutionAndPeriodAllowsCompletion(Task task,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExecutionAndPeriodAllowsCompletion",
				 TASK__EXECUTION_AND_PERIOD_ALLOWS_COMPLETION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DeadlineLessThanPeriod
	 * constraint of '<em>Task</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TASK__DEADLINE_LESS_THAN_PERIOD__EEXPRESSION = "implicitDeadline <= characteristicPeriod";

	/**
	 * Validates the DeadlineLessThanPeriod constraint of '<em>Task</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTask_DeadlineLessThanPeriod(Task task,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DeadlineLessThanPeriod",
				 TASK__DEADLINE_LESS_THAN_PERIOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PositivePeriod constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__POSITIVE_PERIOD__EEXPRESSION = "characteristicPeriod > 0";

	/**
	 * Validates the PositivePeriod constraint of '<em>Task</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTask_PositivePeriod(Task task,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositivePeriod",
				 TASK__POSITIVE_PERIOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(Module module, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(module, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validateModule_NonZeroPeriod(module, diagnostics, context);
		if (result || diagnostics != null) result &= validateModule_NonOverlappingPartitions(module, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NonZeroPeriod constraint of '<em>Module</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODULE__NON_ZERO_PERIOD__EEXPRESSION = "period > 0";

	/**
	 * Validates the NonZeroPeriod constraint of '<em>Module</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateModule_NonZeroPeriod(Module module,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.MODULE,
				 module,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonZeroPeriod",
				 MODULE__NON_ZERO_PERIOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NonOverlappingPartitions constraint of '<em>Module</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String MODULE__NON_OVERLAPPING_PARTITIONS__EEXPRESSION = "let allIntervals : Sequence(Interval) = partition.executionIntervals\n" +
		"\t\t->flatten()\n" +
		"\t\t->sortedBy(i : Interval | i.start)\n" +
		"\tin if (allIntervals\n" +
		"\t\t\t->size() <= 1)\n" +
		"\t\tthen true\n" +
		"\t\telse allIntervals\n" +
		"\t\t\t->subSequence(1, allIntervals\n" +
		"\t\t\t\t->size() - 1)\n" +
		"\t\t\t->forAll(i : Interval | i.end <= allIntervals\n" +
		"\t\t\t\t->at(1 + allIntervals\n" +
		"\t\t\t\t\t->indexOf(i)).start)\n" +
		"\t\tendif";

	/**
	 * Validates the NonOverlappingPartitions constraint of '<em>Module</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule_NonOverlappingPartitions(Module module,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.MODULE,
				 module,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonOverlappingPartitions",
				 MODULE__NON_OVERLAPPING_PARTITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareResource(SoftwareResource softwareResource,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitch(Switch switch_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(switch_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validateSwitch_AtleastTwoSwitchPorts(switch_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtleastTwoSwitchPorts constraint of '<em>Switch</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SWITCH__ATLEAST_TWO_SWITCH_PORTS__EEXPRESSION = "switchPorts->size() > 1";

	/**
	 * Validates the AtleastTwoSwitchPorts constraint of '<em>Switch</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSwitch_AtleastTwoSwitchPorts(Switch switch_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.SWITCH,
				 switch_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtleastTwoSwitchPorts",
				 SWITCH__ATLEAST_TWO_SWITCH_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVirtualLink(VirtualLink virtualLink,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(virtualLink, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(virtualLink,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(virtualLink, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(virtualLink,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(virtualLink,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(virtualLink, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(virtualLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(virtualLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(virtualLink, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateVirtualLink_DestinationsCannotIncludeSource(
					virtualLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVirtualLink_PositiveMinInterFrameTime(
					virtualLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVirtualLink_PositiveMaxFrameSize(virtualLink,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVirtualLink_PathExists(virtualLink, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateVirtualLink_RoutesConnectSourceToDestinations(
					virtualLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVirtualLink_NoCycles(virtualLink, diagnostics,
					context);
		return result;
	}

	/**
	 * The cached validation expression for the DestinationsCannotIncludeSource constraint of '<em>Virtual Link</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String VIRTUAL_LINK__DESTINATIONS_CANNOT_INCLUDE_SOURCE__EEXPRESSION = "\n" +
		"\t\t\t\tdestinations->forAll(dest : Module | dest <> source)";

	/**
	 * Validates the DestinationsCannotIncludeSource constraint of '<em>Virtual Link</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualLink_DestinationsCannotIncludeSource(
			VirtualLink virtualLink, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.VIRTUAL_LINK,
				 virtualLink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DestinationsCannotIncludeSource",
				 VIRTUAL_LINK__DESTINATIONS_CANNOT_INCLUDE_SOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PositiveMinInterFrameTime constraint of '<em>Virtual Link</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String VIRTUAL_LINK__POSITIVE_MIN_INTER_FRAME_TIME__EEXPRESSION = "minInterFrameTime > 0";

	/**
	 * Validates the PositiveMinInterFrameTime constraint of '<em>Virtual Link</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualLink_PositiveMinInterFrameTime(
			VirtualLink virtualLink, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.VIRTUAL_LINK,
				 virtualLink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveMinInterFrameTime",
				 VIRTUAL_LINK__POSITIVE_MIN_INTER_FRAME_TIME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PositiveMaxFrameSize constraint of '<em>Virtual Link</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIRTUAL_LINK__POSITIVE_MAX_FRAME_SIZE__EEXPRESSION = "maxFrameSize > 0";

	/**
	 * Validates the PositiveMaxFrameSize constraint of '<em>Virtual Link</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualLink_PositiveMaxFrameSize(
			VirtualLink virtualLink, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.VIRTUAL_LINK,
				 virtualLink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveMaxFrameSize",
				 VIRTUAL_LINK__POSITIVE_MAX_FRAME_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	private UndirectedGraph<Port, DefaultEdge> networkGraph;

	/**
	 * Builds a JGraphT graph from the network definition where Ports are nodes
	 * in the graph and connections are the edges.
	 * 
	 * @param system
	 */
	private void buildGraph(fr.ensma.realtimescheduling.System system) {
		networkGraph = new SimpleGraph<>(DefaultEdge.class); // Parameter is
																// class of edge
		for (Switch switch_ : system.getHardware().getNetwork()
				.getSwitches()) {
			for (Port port : switch_.getSwitchPorts()) {
				networkGraph.addVertex(port);
			}
			for (Port port : switch_.getSwitchPorts()) {
				for (Port port2 : switch_.getSwitchPorts()) {
					// within a switch, all ports are "connected" to each other.
					if (port2 != port) {
						networkGraph.addEdge(port, port2);
					}
				}
			}
		}
		for (Module module : system.getHardware().getModules()) {
			for (Port port : module.getModulePorts()) {
				networkGraph.addVertex(port);
			}
		}
		for (Connection connection : system.getHardware().getNetwork()
				.getConnections()) {
			if (connection.getA() != null && connection.getB() != null) {
				networkGraph.addEdge(connection.getA(), connection.getB());
			}
		}
	}

	/**
	 * Validates the PathExists constraint of '<em>Virtual Link</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVirtualLink_PathExists(VirtualLink virtualLink,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		ConnectivityInspector<Port, DefaultEdge> inspector = new ConnectivityInspector<>(
				networkGraph);
		boolean pathExists = false;
		try {
			all: for (Port sourcePort : virtualLink.getSource()
					.getModulePorts()) {
				for (Module destination : virtualLink.getDestinations()) {
					for (Port destinationPort : destination.getModulePorts()) {
						pathExists = inspector.pathExists(sourcePort,
								destinationPort);
						if (!pathExists) {
							break all;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!pathExists) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "PathExists",
								getObjectLabel(virtualLink, context) },
						new Object[] { virtualLink }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the RoutesConnectSourceToDestinations constraint of '
	 * <em>Virtual Link</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVirtualLink_RoutesConnectSourceToDestinations(
			VirtualLink virtualLink, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean success = false;
		List<Module> destinationsHit = new ArrayList<>();
		destinationsHit.addAll(virtualLink.getDestinations());
		try {
			for (Route r : virtualLink.getRoutes()) {
				Port first = virtualLink
						.getSource()
						.getModulePorts()
						.stream()
						.filter(esp -> r.getConnections().contains(
								esp.getConnection())).findFirst().get();
				Port current = first;
				List<Connection> allConnections = new ArrayList<>();
				allConnections.addAll(r.getConnections());
				while (allConnections.size() != 1) {
					allConnections.remove(current.getConnection());
					current = Flow.getOpposite(current);
					current = ((Switch) (current.eContainer()))
							.getSwitchPorts()
							.stream()
							.filter(sp -> allConnections.contains(sp
									.getConnection())).findFirst()
							.orElseThrow(() -> new Exception());
				}
				// success if any of the destination ports are one of the two
				// ports
				// of the remaining connection of routes
				success = virtualLink
						.getDestinations()
						.stream()
						.anyMatch(
								module -> {
									boolean matches = module.getModulePorts()
											.contains(
													allConnections.get(0)
															.getB());
									destinationsHit.remove(module);
									return matches;
								})
						|| /* OR */
						virtualLink
								.getDestinations()
								.stream()
								.anyMatch(
										module -> {
											boolean matches = module
													.getModulePorts().contains(
															allConnections.get(
																	0).getA());
											destinationsHit.remove(module);
											return matches;
										});
			}

		} catch (Exception e) {
			e.printStackTrace();
			success = false;
		}
		if (!success || destinationsHit.size() != 0) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"RoutesConnectSourceToDestinations",
								getObjectLabel(virtualLink, context) },
						new Object[] { virtualLink }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoCycles constraint of '<em>Virtual Link</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVirtualLink_NoCycles(VirtualLink virtualLink,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"NoCycles",
								getObjectLabel(virtualLink, context) },
						new Object[] { virtualLink }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_PositiveBandwidth(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_UtilizationSumLessThanOne(port, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositiveBandwidth constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT__POSITIVE_BANDWIDTH__EEXPRESSION = "Bandwidth > 0";

	/**
	 * Validates the PositiveBandwidth constraint of '<em>Port</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePort_PositiveBandwidth(Port port,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.PORT,
				 port,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveBandwidth",
				 PORT__POSITIVE_BANDWIDTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the UtilizationSumLessThanOne constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePort_UtilizationSumLessThanOne(Port port,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean fail;
		try {
			fr.ensma.realtimescheduling.System system = null;
			if (port instanceof SwitchPort) {
				system = (fr.ensma.realtimescheduling.System) port.eContainer()
						.eContainer().eContainer().eContainer();
			} else if (port instanceof EndSystemPort) {
				system = (fr.ensma.realtimescheduling.System) port.eContainer()
						.eContainer().eContainer();
			}
			List<Flow> gamma = NetworkUtils.extractFlows(system);
			Set<Port> allOutputPorts = NetworkUtils.extractOutputPorts(gamma);
			Collection<PortWrapper> portWrappers = NetworkUtils
					.outputPortsToPortWrappers(allOutputPorts, gamma);
			fail = portWrappers
					.stream()
					.mapToDouble(
							portw -> portw.flowsThroughMe.stream()
									// for every port
									.mapToDouble(
											flow -> flow.link.getMaxFrameSize()
													/ portw.port.getBandwidth()
													/ flow.link
															.getBAG()) // every
																						// flow
									.sum()) // sum utilization
					.anyMatch(util -> util > 1.0);
		} catch (Exception e) {
			fail = false;
		}
		if (fail) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "UtilizationSumLessThanOne",
								getObjectLabel(port, context) },
						new Object[] { port }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute(Route route, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(route, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitchPort(SwitchPort switchPort,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(switchPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_PositiveBandwidth(switchPort, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_UtilizationSumLessThanOne(switchPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndSystemPort(EndSystemPort endSystemPort,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endSystemPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_PositiveBandwidth(endSystemPort, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_UtilizationSumLessThanOne(endSystemPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition(Partition partition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartition_PositivePeriod(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartition_AvailibilityFactorLessThanOrEqualToOne(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartition_PeriodSpansIntervals(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartition_NonOverlappingIntervals(partition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositivePeriod constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__POSITIVE_PERIOD__EEXPRESSION = "period > 0";

	/**
	 * Validates the PositivePeriod constraint of '<em>Partition</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePartition_PositivePeriod(Partition partition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.PARTITION,
				 partition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositivePeriod",
				 PARTITION__POSITIVE_PERIOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AvailibilityFactorLessThanOrEqualToOne constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__AVAILIBILITY_FACTOR_LESS_THAN_OR_EQUAL_TO_ONE__EEXPRESSION = "availabilityFactor <= 1";

	/**
	 * Validates the AvailibilityFactorLessThanOrEqualToOne constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_AvailibilityFactorLessThanOrEqualToOne(
			Partition partition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.PARTITION,
				 partition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AvailibilityFactorLessThanOrEqualToOne",
				 PARTITION__AVAILIBILITY_FACTOR_LESS_THAN_OR_EQUAL_TO_ONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PeriodSpansIntervals constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__PERIOD_SPANS_INTERVALS__EEXPRESSION = "let sortedIntervals : Sequence(Interval) = executionIntervals\n" +
		"\t\t->sortedBy(start)\n" +
		"\tin if (sortedIntervals\n" +
		"\t\t->size() > 1)\n" +
		"\tthen sortedIntervals\n" +
		"\t\t->last().end <= period\n" +
		"\telse true\n" +
		"\tendif";

	/**
	 * Validates the PeriodSpansIntervals constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_PeriodSpansIntervals(Partition partition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.PARTITION,
				 partition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PeriodSpansIntervals",
				 PARTITION__PERIOD_SPANS_INTERVALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NonOverlappingIntervals constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__NON_OVERLAPPING_INTERVALS__EEXPRESSION = "if (executionIntervals\n" +
		"\t\t->size() <= 1)\n" +
		"\tthen true -- Nothing can overlap if there is only one or none!\n" +
		"\telse\n" +
		"\tlet sortedIntervals : Sequence(Interval) = executionIntervals\n" +
		"\t\t->sortedBy(i : Interval | i.start)\n" +
		"\tin sortedIntervals\n" +
		"\t\t->subSequence(1, sortedIntervals\n" +
		"\t\t\t->size() - 1)\n" +
		"\t\t->forAll(i : Interval | i.end <= sortedIntervals\n" +
		"\t\t\t->at(1 + sortedIntervals\n" +
		"\t\t\t\t->indexOf(i)).start)\n" +
		"\tendif";

	/**
	 * Validates the NonOverlappingIntervals constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_NonOverlappingIntervals(
			Partition partition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.PARTITION,
				 partition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonOverlappingIntervals",
				 PARTITION__NON_OVERLAPPING_INTERVALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval(Interval interval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterval_EndAfterStart(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterval_NonZeroLength(interval, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EndAfterStart constraint of '<em>Interval</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERVAL__END_AFTER_START__EEXPRESSION = "end >= start";

	/**
	 * Validates the EndAfterStart constraint of '<em>Interval</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInterval_EndAfterStart(Interval interval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.INTERVAL,
				 interval,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EndAfterStart",
				 INTERVAL__END_AFTER_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NonZeroLength constraint of '<em>Interval</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERVAL__NON_ZERO_LENGTH__EEXPRESSION = "end <> start";

	/**
	 * Validates the NonZeroLength constraint of '<em>Interval</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInterval_NonZeroLength(Interval interval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.INTERVAL,
				 interval,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonZeroLength",
				 INTERVAL__NON_ZERO_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateNetwork(Network network,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		buildGraph((fr.ensma.realtimescheduling.System) network.eContainer().eContainer());
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_PositiveNetworkLatency(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_PositiveNetworkBandwith(network, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositiveNetworkLatency constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String NETWORK__POSITIVE_NETWORK_LATENCY__EEXPRESSION = "latency > 0";

	/**
	 * Validates the PositiveNetworkLatency constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_PositiveNetworkLatency(Network network,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.NETWORK,
				 network,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveNetworkLatency",
				 NETWORK__POSITIVE_NETWORK_LATENCY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PositiveNetworkBandwith constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String NETWORK__POSITIVE_NETWORK_BANDWITH__EEXPRESSION = "networkBandwidth > 0";

	/**
	 * Validates the PositiveNetworkBandwith constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_PositiveNetworkBandwith(Network network,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimeschedulingPackage.Literals.NETWORK,
				 network,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveNetworkBandwith",
				 NETWORK__POSITIVE_NETWORK_BANDWITH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateSystem(fr.ensma.realtimescheduling.System system,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = validate_EveryDefaultConstraint(system, diagnostics,
				context);
		ModelInterface.setSystem(valid ? system : null);
		return valid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicity(Periodicity periodicity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingAlgorithm(
			SchedulingAlgorithm schedulingAlgorithm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // RealtimeschedulingValidator
