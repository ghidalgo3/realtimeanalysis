/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getExecutionIntervals <em>Execution Intervals</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getVirtualProcessorUtilization <em>Virtual Processor Utilization</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getAvailabilityFactor <em>Availability Factor</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Partition#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositivePeriod AvailibilityFactorLessThanOrEqualToOne PeriodSpansIntervals NonOverlappingIntervals'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositivePeriod='\n\t\t\tperiod > 0' AvailibilityFactorLessThanOrEqualToOne='\n\t\t\tavailabilityFactor <= 1' PeriodSpansIntervals='\n\t\t\t\tlet sortedIntervals : Sequence(Interval) = executionIntervals->sortedBy(start) in\n\t\t\t\t\tif(sortedIntervals->size() > 1) then sortedIntervals->last().end <= period else true endif' NonOverlappingIntervals='\n\t\t\tif (executionIntervals->size() <= 1)\n\t\t\t\tthen true -- Nothing can overlap if there is only one or none!\n\t\t\telse\n\t\t\t\tlet sortedIntervals : Sequence(Interval) = executionIntervals->sortedBy(i : Interval | i.start)\n\t\t\t\tin sortedIntervals->subSequence(1, sortedIntervals->size() - 1)->forAll(i : Interval | i.end <= sortedIntervals->at(1 + sortedIntervals->indexOf(i)).start)\n\t\t\tendif'"
 * @generated
 */
public interface Partition extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_Id()
	 * @model default="0" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Partition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_Period()
	 * @model default="0" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if(module->oclIsInvalid() or module->oclIsUndefined() or module=null) then 0.0 else self.module.period endif'"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Returns the value of the '<em><b>Execution Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Interval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Intervals</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_ExecutionIntervals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interval> getExecutionIntervals();

	/**
	 * Returns the value of the '<em><b>Virtual Processor Utilization</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Processor Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Processor Utilization</em>' attribute.
	 * @see #setVirtualProcessorUtilization(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_VirtualProcessorUtilization()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getVirtualProcessorUtilization();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Partition#getVirtualProcessorUtilization <em>Virtual Processor Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Processor Utilization</em>' attribute.
	 * @see #getVirtualProcessorUtilization()
	 * @generated
	 */
	void setVirtualProcessorUtilization(double value);

	/**
	 * Returns the value of the '<em><b>Availability Factor</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Factor</em>' attribute.
	 * @see #setAvailabilityFactor(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_AvailabilityFactor()
	 * @model default="0" required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t--check for divide by zero!\n\t\t\tif (period <> 0) then executionIntervals->collect(i : Interval | i.end - i.start)->sum() / period\n\t\t\telse 0.0\n\t\t\tendif'"
	 * @generated
	 */
	double getAvailabilityFactor();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Partition#getAvailabilityFactor <em>Availability Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Factor</em>' attribute.
	 * @see #getAvailabilityFactor()
	 * @generated
	 */
	void setAvailabilityFactor(double value);

	/**
	 * Returns the value of the '<em><b>Scheduling Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.ensma.realtimescheduling.SchedulingAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Algorithm</em>' attribute.
	 * @see fr.ensma.realtimescheduling.SchedulingAlgorithm
	 * @see #setSchedulingAlgorithm(SchedulingAlgorithm)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_SchedulingAlgorithm()
	 * @model required="true"
	 * @generated
	 */
	SchedulingAlgorithm getSchedulingAlgorithm();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Partition#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Algorithm</em>' attribute.
	 * @see fr.ensma.realtimescheduling.SchedulingAlgorithm
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 */
	void setSchedulingAlgorithm(SchedulingAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Task}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Task#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_Tasks()
	 * @see fr.ensma.realtimescheduling.Task#getPartition
	 * @model opposite="partition"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Module#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(Module)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPartition_Module()
	 * @see fr.ensma.realtimescheduling.Module#getPartition
	 * @model opposite="partition" required="true"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Partition#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // Partition
