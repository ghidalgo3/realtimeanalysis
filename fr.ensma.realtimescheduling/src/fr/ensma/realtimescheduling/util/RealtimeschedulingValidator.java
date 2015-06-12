/**
 */
package fr.ensma.realtimescheduling.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import analysis.ModelInterface;
import fr.ensma.realtimescheduling.Connection;
import fr.ensma.realtimescheduling.HardwareResource;
import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Module;
import fr.ensma.realtimescheduling.Network;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Periodicity;
import fr.ensma.realtimescheduling.Port;
import fr.ensma.realtimescheduling.PortType;
import fr.ensma.realtimescheduling.Processor;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.SchedulingAlgorithm;
import fr.ensma.realtimescheduling.SoftwareResource;
import fr.ensma.realtimescheduling.Switch;
import fr.ensma.realtimescheduling.Task;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage
 * @generated
 */
public class RealtimeschedulingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RealtimeschedulingValidator INSTANCE = new RealtimeschedulingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.ensma.realtimescheduling";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			case RealtimeschedulingPackage.PERIODICITY:
				return validatePeriodicity((Periodicity)value, diagnostics, context);
			case RealtimeschedulingPackage.SCHEDULING_ALGORITHM:
				return validateSchedulingAlgorithm((SchedulingAlgorithm)value, diagnostics, context);
			case RealtimeschedulingPackage.PORT_TYPE:
				return validatePortType((PortType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareResource(HardwareResource hardwareResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__POSITIVE_WCET__EEXPRESSION = "\n" +
		"\t\t\tworstCaseExecTime > 0";

	/**
	 * Validates the PositiveWCET constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_PositiveWCET(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * The cached validation expression for the ExecutionAndDeadlineAllowsCompletion constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__EXECUTION_AND_DEADLINE_ALLOWS_COMPLETION__EEXPRESSION = "\n" +
		"\t\t\tworstCaseExecTime <= implicitDeadline";

	/**
	 * Validates the ExecutionAndDeadlineAllowsCompletion constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_ExecutionAndDeadlineAllowsCompletion(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * The cached validation expression for the ExecutionAndPeriodAllowsCompletion constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__EXECUTION_AND_PERIOD_ALLOWS_COMPLETION__EEXPRESSION = "\n" +
		"\t\t\tif (periodicity <> Periodicity::Aperiodic)\n" +
		"\t\t\tthen worstCaseExecTime <= characteristicPeriod\n" +
		"\t\t\telse true\n" +
		"\t\t\tendif";

	/**
	 * Validates the ExecutionAndPeriodAllowsCompletion constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_ExecutionAndPeriodAllowsCompletion(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * The cached validation expression for the DeadlineLessThanPeriod constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__DEADLINE_LESS_THAN_PERIOD__EEXPRESSION = "\n" +
		"\t\t\timplicitDeadline <= characteristicPeriod";

	/**
	 * Validates the DeadlineLessThanPeriod constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_DeadlineLessThanPeriod(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__POSITIVE_PERIOD__EEXPRESSION = "\n" +
		"\t\t\tcharacteristicPeriod > 0";

	/**
	 * Validates the PositivePeriod constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_PositivePeriod(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODULE__NON_ZERO_PERIOD__EEXPRESSION = "\n" +
		"\t\t\tperiod > 0";

	/**
	 * Validates the NonZeroPeriod constraint of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule_NonZeroPeriod(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODULE__NON_OVERLAPPING_PARTITIONS__EEXPRESSION = "\n" +
		"\t\t\tlet allIntervals : Sequence(Interval) = partition.executionIntervals->flatten()->sortedBy(i : Interval | i.start) in\n" +
		"\t\t\tif (allIntervals->size() <= 1) then true\n" +
		"\t\t\telse \n" +
		"\t\t\t\tallIntervals->subSequence(1, allIntervals->size() - 1)->forAll(i : Interval | i.end <= allIntervals->at(1 + allIntervals->indexOf(i)).start)\n" +
		"\t\t\tendif";

	/**
	 * Validates the NonOverlappingPartitions constraint of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule_NonOverlappingPartitions(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareResource(SoftwareResource softwareResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitch(Switch switch_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(switch_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualLink(VirtualLink virtualLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__POSITIVE_PERIOD__EEXPRESSION = "\n" +
		"\t\t\tperiod > 0";

	/**
	 * Validates the PositivePeriod constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_PositivePeriod(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__AVAILIBILITY_FACTOR_LESS_THAN_OR_EQUAL_TO_ONE__EEXPRESSION = "\n" +
		"\t\t\tavailabilityFactor <= 1";

	/**
	 * Validates the AvailibilityFactorLessThanOrEqualToOne constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_AvailibilityFactorLessThanOrEqualToOne(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__PERIOD_SPANS_INTERVALS__EEXPRESSION = "\n" +
		"\t\t\t\tlet sortedIntervals : Sequence(Interval) = executionIntervals->sortedBy(start) in\n" +
		"\t\t\t\t\tif(sortedIntervals->size() > 1) then sortedIntervals->last().end <= period else true endif";

	/**
	 * Validates the PeriodSpansIntervals constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_PeriodSpansIntervals(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARTITION__NON_OVERLAPPING_INTERVALS__EEXPRESSION = "\n" +
		"\t\t\tif (executionIntervals->size() <= 1)\n" +
		"\t\t\t\tthen true -- Nothing can overlap if there is only one or none!\n" +
		"\t\t\telse\n" +
		"\t\t\t\tlet sortedIntervals : Sequence(Interval) = executionIntervals->sortedBy(i : Interval | i.start)\n" +
		"\t\t\t\tin sortedIntervals->subSequence(1, sortedIntervals->size() - 1)->forAll(i : Interval | i.end <= sortedIntervals->at(1 + sortedIntervals->indexOf(i)).start)\n" +
		"\t\t\tendif";

	/**
	 * Validates the NonOverlappingIntervals constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_NonOverlappingIntervals(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERVAL__END_AFTER_START__EEXPRESSION = "\n" +
		"\t\t\tend >= start";

	/**
	 * Validates the EndAfterStart constraint of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval_EndAfterStart(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERVAL__NON_ZERO_LENGTH__EEXPRESSION = "\n" +
		"\t\t\tend <> start";

	/**
	 * Validates the NonZeroLength constraint of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval_NonZeroLength(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(network, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSystem(fr.ensma.realtimescheduling.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = validate_EveryDefaultConstraint(system, diagnostics, context);
		ModelInterface.setSystem(valid ? system : null);
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicity(Periodicity periodicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingAlgorithm(SchedulingAlgorithm schedulingAlgorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RealtimeschedulingValidator
