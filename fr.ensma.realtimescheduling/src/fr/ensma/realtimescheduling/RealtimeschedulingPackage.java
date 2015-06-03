/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.ensma.realtimescheduling.RealtimeschedulingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RealtimeschedulingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "realtimescheduling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ensma.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ensma.fr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimeschedulingPackage eINSTANCE = fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.HardwareResourceImpl <em>Hardware Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.HardwareResourceImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getHardwareResource()
	 * @generated
	 */
	int HARDWARE_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scheduled On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__SCHEDULED_ON = 1;

	/**
	 * The feature id for the '<em><b>Communicates Over</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__COMMUNICATES_OVER = 2;

	/**
	 * The number of structural features of the '<em>Hardware Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hardware Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.TaskImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Worst Case Exec Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WORST_CASE_EXEC_TIME = 1;

	/**
	 * The feature id for the '<em><b>Implicit Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLICIT_DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESPONSE_TIME = 4;

	/**
	 * The feature id for the '<em><b>Scheduleable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULEABLE = 5;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__JITTER = 6;

	/**
	 * The feature id for the '<em><b>Critical Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CRITICAL_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Release Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RELEASE_TIME = 8;

	/**
	 * The feature id for the '<em><b>Periodicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERIODICITY = 9;

	/**
	 * The feature id for the '<em><b>Characteristic Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CHARACTERISTIC_PERIOD = 10;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARTITION = 11;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.ModuleImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UTILIZATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARTITION = 3;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PROCESSORS = 4;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.PartitionImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Execution Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__EXECUTION_INTERVALS = 2;

	/**
	 * The feature id for the '<em><b>Virtual Processor Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__VIRTUAL_PROCESSOR_UTILIZATION = 3;

	/**
	 * The feature id for the '<em><b>Availability Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__AVAILABILITY_FACTOR = 4;

	/**
	 * The feature id for the '<em><b>Scheduling Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SCHEDULING_ALGORITHM = 5;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TASKS = 6;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__MODULE = 7;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.IntervalImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__END = 1;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.NetworkImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.SystemImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__USES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Executes Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__EXECUTES_SOFTWARE = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.SoftwareResourceImpl <em>Software Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.SoftwareResourceImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getSoftwareResource()
	 * @generated
	 */
	int SOFTWARE_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Executed Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__EXECUTED_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Contained Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__CONTAINED_PARTITIONS = 2;

	/**
	 * The number of structural features of the '<em>Software Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Software Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.impl.ProcessorImpl
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.Periodicity <em>Periodicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.Periodicity
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getPeriodicity()
	 * @generated
	 */
	int PERIODICITY = 9;

	/**
	 * The meta object id for the '{@link fr.ensma.realtimescheduling.SchedulingAlgorithm <em>Scheduling Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.realtimescheduling.SchedulingAlgorithm
	 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getSchedulingAlgorithm()
	 * @generated
	 */
	int SCHEDULING_ALGORITHM = 10;


	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.HardwareResource <em>Hardware Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Resource</em>'.
	 * @see fr.ensma.realtimescheduling.HardwareResource
	 * @generated
	 */
	EClass getHardwareResource();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.HardwareResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ensma.realtimescheduling.HardwareResource#getName()
	 * @see #getHardwareResource()
	 * @generated
	 */
	EAttribute getHardwareResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ensma.realtimescheduling.HardwareResource#getScheduledOn <em>Scheduled On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled On</em>'.
	 * @see fr.ensma.realtimescheduling.HardwareResource#getScheduledOn()
	 * @see #getHardwareResource()
	 * @generated
	 */
	EReference getHardwareResource_ScheduledOn();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ensma.realtimescheduling.HardwareResource#getCommunicatesOver <em>Communicates Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communicates Over</em>'.
	 * @see fr.ensma.realtimescheduling.HardwareResource#getCommunicatesOver()
	 * @see #getHardwareResource()
	 * @generated
	 */
	EReference getHardwareResource_CommunicatesOver();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.ensma.realtimescheduling.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getWorstCaseExecTime <em>Worst Case Exec Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Case Exec Time</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getWorstCaseExecTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_WorstCaseExecTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getImplicitDeadline <em>Implicit Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Deadline</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getImplicitDeadline()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImplicitDeadline();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getResponseTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#isScheduleable <em>Scheduleable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduleable</em>'.
	 * @see fr.ensma.realtimescheduling.Task#isScheduleable()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Scheduleable();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jitter</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getJitter()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Jitter();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getCriticalInstance <em>Critical Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Instance</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getCriticalInstance()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CriticalInstance();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getReleaseTime <em>Release Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Time</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getReleaseTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ReleaseTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getPeriodicity <em>Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicity</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getPeriodicity()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Periodicity();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Task#getCharacteristicPeriod <em>Characteristic Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic Period</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getCharacteristicPeriod()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CharacteristicPeriod();

	/**
	 * Returns the meta object for the reference '{@link fr.ensma.realtimescheduling.Task#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partition</em>'.
	 * @see fr.ensma.realtimescheduling.Task#getPartition()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Partition();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see fr.ensma.realtimescheduling.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Module#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see fr.ensma.realtimescheduling.Module#getUtilization()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Module#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.ensma.realtimescheduling.Module#getId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Module#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.ensma.realtimescheduling.Module#getPeriod()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Period();

	/**
	 * Returns the meta object for the reference list '{@link fr.ensma.realtimescheduling.Module#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partition</em>'.
	 * @see fr.ensma.realtimescheduling.Module#getPartition()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Partition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ensma.realtimescheduling.Module#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see fr.ensma.realtimescheduling.Module#getProcessors()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Processors();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see fr.ensma.realtimescheduling.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Partition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getId()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Partition#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getPeriod()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Period();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ensma.realtimescheduling.Partition#getExecutionIntervals <em>Execution Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Intervals</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getExecutionIntervals()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_ExecutionIntervals();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Partition#getVirtualProcessorUtilization <em>Virtual Processor Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Processor Utilization</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getVirtualProcessorUtilization()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_VirtualProcessorUtilization();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Partition#getAvailabilityFactor <em>Availability Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Factor</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getAvailabilityFactor()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_AvailabilityFactor();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Partition#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Algorithm</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getSchedulingAlgorithm()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_SchedulingAlgorithm();

	/**
	 * Returns the meta object for the reference list '{@link fr.ensma.realtimescheduling.Partition#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getTasks()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Tasks();

	/**
	 * Returns the meta object for the reference '{@link fr.ensma.realtimescheduling.Partition#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see fr.ensma.realtimescheduling.Partition#getModule()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Module();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see fr.ensma.realtimescheduling.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Interval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see fr.ensma.realtimescheduling.Interval#getStart()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Start();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Interval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see fr.ensma.realtimescheduling.Interval#getEnd()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_End();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see fr.ensma.realtimescheduling.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ensma.realtimescheduling.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see fr.ensma.realtimescheduling.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ensma.realtimescheduling.System#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses</em>'.
	 * @see fr.ensma.realtimescheduling.System#getUses()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Uses();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ensma.realtimescheduling.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ensma.realtimescheduling.System#getExecutesSoftware <em>Executes Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executes Software</em>'.
	 * @see fr.ensma.realtimescheduling.System#getExecutesSoftware()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ExecutesSoftware();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.SoftwareResource <em>Software Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Resource</em>'.
	 * @see fr.ensma.realtimescheduling.SoftwareResource
	 * @generated
	 */
	EClass getSoftwareResource();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.SoftwareResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ensma.realtimescheduling.SoftwareResource#getName()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EAttribute getSoftwareResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ensma.realtimescheduling.SoftwareResource#getExecutedTasks <em>Executed Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executed Tasks</em>'.
	 * @see fr.ensma.realtimescheduling.SoftwareResource#getExecutedTasks()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EReference getSoftwareResource_ExecutedTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ensma.realtimescheduling.SoftwareResource#getContainedPartitions <em>Contained Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Partitions</em>'.
	 * @see fr.ensma.realtimescheduling.SoftwareResource#getContainedPartitions()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EReference getSoftwareResource_ContainedPartitions();

	/**
	 * Returns the meta object for class '{@link fr.ensma.realtimescheduling.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see fr.ensma.realtimescheduling.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.realtimescheduling.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ensma.realtimescheduling.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for enum '{@link fr.ensma.realtimescheduling.Periodicity <em>Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Periodicity</em>'.
	 * @see fr.ensma.realtimescheduling.Periodicity
	 * @generated
	 */
	EEnum getPeriodicity();

	/**
	 * Returns the meta object for enum '{@link fr.ensma.realtimescheduling.SchedulingAlgorithm <em>Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Algorithm</em>'.
	 * @see fr.ensma.realtimescheduling.SchedulingAlgorithm
	 * @generated
	 */
	EEnum getSchedulingAlgorithm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RealtimeschedulingFactory getRealtimeschedulingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.HardwareResourceImpl <em>Hardware Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.HardwareResourceImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getHardwareResource()
		 * @generated
		 */
		EClass HARDWARE_RESOURCE = eINSTANCE.getHardwareResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RESOURCE__NAME = eINSTANCE.getHardwareResource_Name();

		/**
		 * The meta object literal for the '<em><b>Scheduled On</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_RESOURCE__SCHEDULED_ON = eINSTANCE.getHardwareResource_ScheduledOn();

		/**
		 * The meta object literal for the '<em><b>Communicates Over</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_RESOURCE__COMMUNICATES_OVER = eINSTANCE.getHardwareResource_CommunicatesOver();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.TaskImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Worst Case Exec Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__WORST_CASE_EXEC_TIME = eINSTANCE.getTask_WorstCaseExecTime();

		/**
		 * The meta object literal for the '<em><b>Implicit Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPLICIT_DEADLINE = eINSTANCE.getTask_ImplicitDeadline();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RESPONSE_TIME = eINSTANCE.getTask_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Scheduleable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SCHEDULEABLE = eINSTANCE.getTask_Scheduleable();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__JITTER = eINSTANCE.getTask_Jitter();

		/**
		 * The meta object literal for the '<em><b>Critical Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CRITICAL_INSTANCE = eINSTANCE.getTask_CriticalInstance();

		/**
		 * The meta object literal for the '<em><b>Release Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RELEASE_TIME = eINSTANCE.getTask_ReleaseTime();

		/**
		 * The meta object literal for the '<em><b>Periodicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERIODICITY = eINSTANCE.getTask_Periodicity();

		/**
		 * The meta object literal for the '<em><b>Characteristic Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CHARACTERISTIC_PERIOD = eINSTANCE.getTask_CharacteristicPeriod();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARTITION = eINSTANCE.getTask_Partition();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.ModuleImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UTILIZATION = eINSTANCE.getModule_Utilization();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__ID = eINSTANCE.getModule_Id();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PERIOD = eINSTANCE.getModule_Period();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PARTITION = eINSTANCE.getModule_Partition();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PROCESSORS = eINSTANCE.getModule_Processors();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.PartitionImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__ID = eINSTANCE.getPartition_Id();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__PERIOD = eINSTANCE.getPartition_Period();

		/**
		 * The meta object literal for the '<em><b>Execution Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__EXECUTION_INTERVALS = eINSTANCE.getPartition_ExecutionIntervals();

		/**
		 * The meta object literal for the '<em><b>Virtual Processor Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__VIRTUAL_PROCESSOR_UTILIZATION = eINSTANCE.getPartition_VirtualProcessorUtilization();

		/**
		 * The meta object literal for the '<em><b>Availability Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__AVAILABILITY_FACTOR = eINSTANCE.getPartition_AvailabilityFactor();

		/**
		 * The meta object literal for the '<em><b>Scheduling Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__SCHEDULING_ALGORITHM = eINSTANCE.getPartition_SchedulingAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__TASKS = eINSTANCE.getPartition_Tasks();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__MODULE = eINSTANCE.getPartition_Module();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.IntervalImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__START = eINSTANCE.getInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__END = eINSTANCE.getInterval_End();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.NetworkImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.SystemImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__USES = eINSTANCE.getSystem_Uses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Executes Software</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__EXECUTES_SOFTWARE = eINSTANCE.getSystem_ExecutesSoftware();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.SoftwareResourceImpl <em>Software Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.SoftwareResourceImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getSoftwareResource()
		 * @generated
		 */
		EClass SOFTWARE_RESOURCE = eINSTANCE.getSoftwareResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_RESOURCE__NAME = eINSTANCE.getSoftwareResource_Name();

		/**
		 * The meta object literal for the '<em><b>Executed Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCE__EXECUTED_TASKS = eINSTANCE.getSoftwareResource_ExecutedTasks();

		/**
		 * The meta object literal for the '<em><b>Contained Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCE__CONTAINED_PARTITIONS = eINSTANCE.getSoftwareResource_ContainedPartitions();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.impl.ProcessorImpl
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.Periodicity <em>Periodicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.Periodicity
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getPeriodicity()
		 * @generated
		 */
		EEnum PERIODICITY = eINSTANCE.getPeriodicity();

		/**
		 * The meta object literal for the '{@link fr.ensma.realtimescheduling.SchedulingAlgorithm <em>Scheduling Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.realtimescheduling.SchedulingAlgorithm
		 * @see fr.ensma.realtimescheduling.impl.RealtimeschedulingPackageImpl#getSchedulingAlgorithm()
		 * @generated
		 */
		EEnum SCHEDULING_ALGORITHM = eINSTANCE.getSchedulingAlgorithm();

	}

} //RealtimeschedulingPackage
