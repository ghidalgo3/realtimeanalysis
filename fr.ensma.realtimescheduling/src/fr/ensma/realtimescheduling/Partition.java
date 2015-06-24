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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositivePeriod='period > 0' AvailibilityFactorLessThanOrEqualToOne='availabilityFactor <= 1' PeriodSpansIntervals='let sortedIntervals : Sequence(Interval) = executionIntervals\n\t\t->sortedBy(start)\n\tin if (sortedIntervals\n\t\t->size() > 1)\n\tthen sortedIntervals\n\t\t->last().end <= period\n\telse true\n\tendif' NonOverlappingIntervals='if (executionIntervals\n\t\t->size() <= 1)\n\tthen true -- Nothing can overlap if there is only one or none!\n\telse\n\tlet sortedIntervals : Sequence(Interval) = executionIntervals\n\t\t->sortedBy(i : Interval | i.start)\n\tin sortedIntervals\n\t\t->subSequence(1, sortedIntervals\n\t\t\t->size() - 1)\n\t\t->forAll(i : Interval | i.end <= sortedIntervals\n\t\t\t->at(1 + sortedIntervals\n\t\t\t\t->indexOf(i)).start)\n\tendif'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if (module\n\t\t\t->oclIsInvalid() or module\n\t\t\t->oclIsUndefined() or module = null)\n\t\tthen 0.0\n\t\telse self.module.period\n\t\tendif'"
	 * @generated
	 */
	double getPeriod();

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='--check for divide by zero!\n\t\t\tif (period <> 0)\n\t\t\tthen executionIntervals\n\t\t\t\t->collect(i : Interval | i.end - i.start)\n\t\t\t\t->sum() / period\n\t\t\telse 0.0\n\t\t\tendif'"
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
