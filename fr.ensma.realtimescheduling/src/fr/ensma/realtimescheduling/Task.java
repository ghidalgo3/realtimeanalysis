/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getWorstCaseExecTime <em>Worst Case Exec Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getImplicitDeadline <em>Implicit Deadline</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getWorstCaseResponseTime <em>Worst Case Response Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#isScheduleable <em>Scheduleable</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getJitter <em>Jitter</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getCriticalInstance <em>Critical Instance</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getReleaseTime <em>Release Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getPeriodicity <em>Periodicity</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getCharacteristicPeriod <em>Characteristic Period</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Task#getPartition <em>Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveWCET ExecutionAndDeadlineAllowsCompletion ExecutionAndPeriodAllowsCompletion DeadlineLessThanPeriod PositivePeriod'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositiveWCET='\n\t\t\tworstCaseExecTime > 0' ExecutionAndDeadlineAllowsCompletion='\n\t\t\tworstCaseExecTime <= implicitDeadline' ExecutionAndPeriodAllowsCompletion='\n\t\t\tif (periodicity <> Periodicity::Aperiodic)\n\t\t\tthen worstCaseExecTime <= characteristicPeriod\n\t\t\telse true\n\t\t\tendif' DeadlineLessThanPeriod='\n\t\t\timplicitDeadline <= characteristicPeriod' PositivePeriod='\n\t\t\tcharacteristicPeriod > 0'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Worst Case Exec Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Case Exec Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Case Exec Time</em>' attribute.
	 * @see #setWorstCaseExecTime(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_WorstCaseExecTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getWorstCaseExecTime();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getWorstCaseExecTime <em>Worst Case Exec Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Case Exec Time</em>' attribute.
	 * @see #getWorstCaseExecTime()
	 * @generated
	 */
	void setWorstCaseExecTime(int value);

	/**
	 * Returns the value of the '<em><b>Implicit Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Deadline</em>' attribute.
	 * @see #setImplicitDeadline(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_ImplicitDeadline()
	 * @model required="true"
	 * @generated
	 */
	int getImplicitDeadline();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getImplicitDeadline <em>Implicit Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Deadline</em>' attribute.
	 * @see #getImplicitDeadline()
	 * @generated
	 */
	void setImplicitDeadline(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Worst Case Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Case Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Case Response Time</em>' attribute.
	 * @see #setWorstCaseResponseTime(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_WorstCaseResponseTime()
	 * @model required="true"
	 * @generated
	 */
	int getWorstCaseResponseTime();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getWorstCaseResponseTime <em>Worst Case Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Case Response Time</em>' attribute.
	 * @see #getWorstCaseResponseTime()
	 * @generated
	 */
	void setWorstCaseResponseTime(int value);

	/**
	 * Returns the value of the '<em><b>Scheduleable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduleable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduleable</em>' attribute.
	 * @see #setScheduleable(boolean)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_Scheduleable()
	 * @model required="true"
	 * @generated
	 */
	boolean isScheduleable();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#isScheduleable <em>Scheduleable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduleable</em>' attribute.
	 * @see #isScheduleable()
	 * @generated
	 */
	void setScheduleable(boolean value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' attribute.
	 * @see #setJitter(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_Jitter()
	 * @model required="true"
	 * @generated
	 */
	int getJitter();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getJitter <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' attribute.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(int value);

	/**
	 * Returns the value of the '<em><b>Critical Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Instance</em>' attribute.
	 * @see #setCriticalInstance(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_CriticalInstance()
	 * @model required="true"
	 * @generated
	 */
	int getCriticalInstance();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getCriticalInstance <em>Critical Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Instance</em>' attribute.
	 * @see #getCriticalInstance()
	 * @generated
	 */
	void setCriticalInstance(int value);

	/**
	 * Returns the value of the '<em><b>Release Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Time</em>' attribute.
	 * @see #setReleaseTime(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_ReleaseTime()
	 * @model required="true"
	 * @generated
	 */
	int getReleaseTime();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getReleaseTime <em>Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Time</em>' attribute.
	 * @see #getReleaseTime()
	 * @generated
	 */
	void setReleaseTime(int value);

	/**
	 * Returns the value of the '<em><b>Periodicity</b></em>' attribute.
	 * The default value is <code>"Periodic"</code>.
	 * The literals are from the enumeration {@link fr.ensma.realtimescheduling.Periodicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicity</em>' attribute.
	 * @see fr.ensma.realtimescheduling.Periodicity
	 * @see #setPeriodicity(Periodicity)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_Periodicity()
	 * @model default="Periodic" required="true"
	 * @generated
	 */
	Periodicity getPeriodicity();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getPeriodicity <em>Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity</em>' attribute.
	 * @see fr.ensma.realtimescheduling.Periodicity
	 * @see #getPeriodicity()
	 * @generated
	 */
	void setPeriodicity(Periodicity value);

	/**
	 * Returns the value of the '<em><b>Characteristic Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field only has 'meaning' if a task is not aperiodic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic Period</em>' attribute.
	 * @see #setCharacteristicPeriod(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_CharacteristicPeriod()
	 * @model required="true"
	 * @generated
	 */
	int getCharacteristicPeriod();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getCharacteristicPeriod <em>Characteristic Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Period</em>' attribute.
	 * @see #getCharacteristicPeriod()
	 * @generated
	 */
	void setCharacteristicPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Partition#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' reference.
	 * @see #setPartition(Partition)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getTask_Partition()
	 * @see fr.ensma.realtimescheduling.Partition#getTasks
	 * @model opposite="tasks" required="true"
	 * @generated
	 */
	Partition getPartition();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Task#getPartition <em>Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition</em>' reference.
	 * @see #getPartition()
	 * @generated
	 */
	void setPartition(Partition value);

} // Task
