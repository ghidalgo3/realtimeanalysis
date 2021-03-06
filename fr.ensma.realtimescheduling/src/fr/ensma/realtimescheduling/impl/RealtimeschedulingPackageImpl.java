/**
 */
package fr.ensma.realtimescheduling.impl;

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
import fr.ensma.realtimescheduling.RealtimeschedulingFactory;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.Route;
import fr.ensma.realtimescheduling.SchedulingAlgorithm;
import fr.ensma.realtimescheduling.SoftwareResource;
import fr.ensma.realtimescheduling.Switch;
import fr.ensma.realtimescheduling.SwitchPort;
import fr.ensma.realtimescheduling.Task;
import fr.ensma.realtimescheduling.VirtualLink;
import fr.ensma.realtimescheduling.util.RealtimeschedulingValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class RealtimeschedulingPackageImpl extends EPackageImpl implements
		RealtimeschedulingPackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareResourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareResourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualLinkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchPortEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endSystemPortEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum periodicityEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingAlgorithmEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RealtimeschedulingPackageImpl() {
		super(eNS_URI, RealtimeschedulingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RealtimeschedulingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RealtimeschedulingPackage init() {
		if (isInited) return (RealtimeschedulingPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimeschedulingPackage.eNS_URI);

		// Obtain or create and register package
		RealtimeschedulingPackageImpl theRealtimeschedulingPackage = (RealtimeschedulingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RealtimeschedulingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RealtimeschedulingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRealtimeschedulingPackage.createPackageContents();

		// Initialize created meta-data
		theRealtimeschedulingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRealtimeschedulingPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RealtimeschedulingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRealtimeschedulingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RealtimeschedulingPackage.eNS_URI, theRealtimeschedulingPackage);
		return theRealtimeschedulingPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareResource() {
		return hardwareResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareResource_Modules() {
		return (EReference)hardwareResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareResource_Network() {
		return (EReference)hardwareResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_WorstCaseExecTime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ImplicitDeadline() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Priority() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ResponseTime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Scheduleable() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CriticalInstance() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Periodicity() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CharacteristicPeriod() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Partition() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Utilization() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Id() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Period() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Partition() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Processors() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModulePorts() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Delay() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartition_Id() {
		return (EAttribute)partitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartition_Period() {
		return (EAttribute)partitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ExecutionIntervals() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartition_VirtualProcessorUtilization() {
		return (EAttribute)partitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartition_AvailabilityFactor() {
		return (EAttribute)partitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartition_SchedulingAlgorithm() {
		return (EAttribute)partitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Tasks() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Module() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_Start() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_End() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Switches() {
		return (EReference)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_NetworkBandwidth() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Connections() {
		return (EReference)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Latency() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Hardware() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Software() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareResource() {
		return softwareResourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResource_ExecutedTasks() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResource_ContainedPartitions() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResource_VirtualLinks() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Id() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_Id() {
		return (EAttribute)switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_SwitchPorts() {
		return (EReference)switchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualLink() {
		return virtualLinkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualLink_Id() {
		return (EAttribute)virtualLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualLink_BAG() {
		return (EAttribute)virtualLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualLink_Routes() {
		return (EReference)virtualLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualLink_Source() {
		return (EReference)virtualLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualLink_Destinations() {
		return (EReference)virtualLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualLink_MaxFrameSize() {
		return (EAttribute)virtualLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Order() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Bandwidth() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Id() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Connection() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_A() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Routes() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Id() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_B() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_Connections() {
		return (EReference)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_EndToEndDelay() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchPort() {
		return switchPortEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndSystemPort() {
		return endSystemPortEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPeriodicity() {
		return periodicityEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingAlgorithm() {
		return schedulingAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeschedulingFactory getRealtimeschedulingFactory() {
		return (RealtimeschedulingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hardwareResourceEClass = createEClass(HARDWARE_RESOURCE);
		createEReference(hardwareResourceEClass, HARDWARE_RESOURCE__MODULES);
		createEReference(hardwareResourceEClass, HARDWARE_RESOURCE__NETWORK);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ID);
		createEAttribute(taskEClass, TASK__WORST_CASE_EXEC_TIME);
		createEAttribute(taskEClass, TASK__IMPLICIT_DEADLINE);
		createEAttribute(taskEClass, TASK__PRIORITY);
		createEAttribute(taskEClass, TASK__RESPONSE_TIME);
		createEAttribute(taskEClass, TASK__SCHEDULEABLE);
		createEAttribute(taskEClass, TASK__CRITICAL_INSTANCE);
		createEAttribute(taskEClass, TASK__PERIODICITY);
		createEAttribute(taskEClass, TASK__CHARACTERISTIC_PERIOD);
		createEReference(taskEClass, TASK__PARTITION);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__UTILIZATION);
		createEAttribute(moduleEClass, MODULE__ID);
		createEAttribute(moduleEClass, MODULE__PERIOD);
		createEReference(moduleEClass, MODULE__PARTITION);
		createEReference(moduleEClass, MODULE__PROCESSORS);
		createEReference(moduleEClass, MODULE__MODULE_PORTS);
		createEAttribute(moduleEClass, MODULE__DELAY);

		partitionEClass = createEClass(PARTITION);
		createEAttribute(partitionEClass, PARTITION__ID);
		createEAttribute(partitionEClass, PARTITION__PERIOD);
		createEReference(partitionEClass, PARTITION__EXECUTION_INTERVALS);
		createEAttribute(partitionEClass, PARTITION__VIRTUAL_PROCESSOR_UTILIZATION);
		createEAttribute(partitionEClass, PARTITION__AVAILABILITY_FACTOR);
		createEAttribute(partitionEClass, PARTITION__SCHEDULING_ALGORITHM);
		createEReference(partitionEClass, PARTITION__TASKS);
		createEReference(partitionEClass, PARTITION__MODULE);

		intervalEClass = createEClass(INTERVAL);
		createEAttribute(intervalEClass, INTERVAL__START);
		createEAttribute(intervalEClass, INTERVAL__END);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEReference(networkEClass, NETWORK__SWITCHES);
		createEAttribute(networkEClass, NETWORK__NETWORK_BANDWIDTH);
		createEReference(networkEClass, NETWORK__CONNECTIONS);
		createEAttribute(networkEClass, NETWORK__LATENCY);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__HARDWARE);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__SOFTWARE);

		softwareResourceEClass = createEClass(SOFTWARE_RESOURCE);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__EXECUTED_TASKS);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__CONTAINED_PARTITIONS);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__VIRTUAL_LINKS);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__ID);

		switchEClass = createEClass(SWITCH);
		createEAttribute(switchEClass, SWITCH__ID);
		createEReference(switchEClass, SWITCH__SWITCH_PORTS);

		virtualLinkEClass = createEClass(VIRTUAL_LINK);
		createEAttribute(virtualLinkEClass, VIRTUAL_LINK__ID);
		createEAttribute(virtualLinkEClass, VIRTUAL_LINK__BAG);
		createEReference(virtualLinkEClass, VIRTUAL_LINK__ROUTES);
		createEReference(virtualLinkEClass, VIRTUAL_LINK__SOURCE);
		createEReference(virtualLinkEClass, VIRTUAL_LINK__DESTINATIONS);
		createEAttribute(virtualLinkEClass, VIRTUAL_LINK__MAX_FRAME_SIZE);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__ORDER);
		createEAttribute(portEClass, PORT__BANDWIDTH);
		createEAttribute(portEClass, PORT__ID);
		createEReference(portEClass, PORT__CONNECTION);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__ROUTES);
		createEAttribute(connectionEClass, CONNECTION__ID);
		createEReference(connectionEClass, CONNECTION__B);
		createEReference(connectionEClass, CONNECTION__A);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__CONNECTIONS);
		createEAttribute(routeEClass, ROUTE__END_TO_END_DELAY);

		switchPortEClass = createEClass(SWITCH_PORT);

		endSystemPortEClass = createEClass(END_SYSTEM_PORT);

		// Create enums
		periodicityEEnum = createEEnum(PERIODICITY);
		schedulingAlgorithmEEnum = createEEnum(SCHEDULING_ALGORITHM);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		switchPortEClass.getESuperTypes().add(this.getPort());
		endSystemPortEClass.getESuperTypes().add(this.getPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(hardwareResourceEClass, HardwareResource.class, "HardwareResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareResource_Modules(), this.getModule(), null, "modules", null, 0, -1, HardwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareResource_Network(), this.getNetwork(), null, "network", null, 0, 1, HardwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Id(), ecorePackage.getEString(), "id", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_WorstCaseExecTime(), ecorePackage.getEInt(), "worstCaseExecTime", "0", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ImplicitDeadline(), ecorePackage.getEInt(), "implicitDeadline", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ResponseTime(), ecorePackage.getEInt(), "responseTime", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Scheduleable(), ecorePackage.getEBoolean(), "scheduleable", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CriticalInstance(), ecorePackage.getEInt(), "criticalInstance", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Periodicity(), this.getPeriodicity(), "periodicity", "Periodic", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CharacteristicPeriod(), ecorePackage.getEInt(), "characteristicPeriod", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Partition(), this.getPartition(), this.getPartition_Tasks(), "partition", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Utilization(), ecorePackage.getEDouble(), "utilization", "0", 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Id(), ecorePackage.getEString(), "id", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Period(), ecorePackage.getEInt(), "period", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Partition(), this.getPartition(), this.getPartition_Module(), "partition", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Processors(), this.getProcessor(), null, "processors", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ModulePorts(), this.getEndSystemPort(), null, "modulePorts", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Delay(), ecorePackage.getEInt(), "delay", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartition_Id(), ecorePackage.getEString(), "id", "0", 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartition_Period(), ecorePackage.getEDouble(), "period", "0", 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_ExecutionIntervals(), this.getInterval(), null, "executionIntervals", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartition_VirtualProcessorUtilization(), ecorePackage.getEDouble(), "virtualProcessorUtilization", "0", 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartition_AvailabilityFactor(), ecorePackage.getEDouble(), "availabilityFactor", "0", 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartition_SchedulingAlgorithm(), this.getSchedulingAlgorithm(), "schedulingAlgorithm", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_Tasks(), this.getTask(), this.getTask_Partition(), "tasks", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_Module(), this.getModule(), this.getModule_Partition(), "module", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterval_Start(), ecorePackage.getEInt(), "start", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterval_End(), ecorePackage.getEInt(), "end", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Name(), ecorePackage.getEString(), "name", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Switches(), this.getSwitch(), null, "switches", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_NetworkBandwidth(), ecorePackage.getEInt(), "networkBandwidth", "0", 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Connections(), this.getConnection(), null, "connections", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Latency(), ecorePackage.getEInt(), "latency", "0", 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, fr.ensma.realtimescheduling.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Hardware(), this.getHardwareResource(), null, "hardware", null, 1, 1, fr.ensma.realtimescheduling.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, fr.ensma.realtimescheduling.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Software(), this.getSoftwareResource(), null, "software", null, 1, 1, fr.ensma.realtimescheduling.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareResourceEClass, SoftwareResource.class, "SoftwareResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareResource_ExecutedTasks(), this.getTask(), null, "executedTasks", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareResource_ContainedPartitions(), this.getPartition(), null, "containedPartitions", null, 1, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareResource_VirtualLinks(), this.getVirtualLink(), null, "virtualLinks", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Id(), ecorePackage.getEString(), "id", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitch_Id(), ecorePackage.getEString(), "id", null, 1, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_SwitchPorts(), this.getSwitchPort(), null, "switchPorts", null, 1, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualLinkEClass, VirtualLink.class, "VirtualLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualLink_Id(), ecorePackage.getEString(), "id", null, 1, 1, VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualLink_BAG(), ecorePackage.getEInt(), "BAG", null, 1, 1, VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualLink_Routes(), this.getRoute(), null, "routes", null, 1, -1, VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualLink_Source(), this.getModule(), null, "source", null, 1, 1, VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualLink_Destinations(), this.getModule(), null, "destinations", null, 1, -1, VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualLink_MaxFrameSize(), ecorePackage.getEInt(), "maxFrameSize", "0", 1, 1, VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Order(), ecorePackage.getEInt(), "order", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Bandwidth(), ecorePackage.getEDouble(), "Bandwidth", "0.0", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Id(), ecorePackage.getEString(), "id", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Connection(), this.getConnection(), null, "connection", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Routes(), this.getRoute(), this.getRoute_Connections(), "routes", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Id(), ecorePackage.getEString(), "id", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_B(), this.getPort(), null, "B", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_A(), this.getPort(), null, "A", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_Connections(), this.getConnection(), this.getConnection_Routes(), "connections", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_EndToEndDelay(), ecorePackage.getEInt(), "endToEndDelay", null, 1, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchPortEClass, SwitchPort.class, "SwitchPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endSystemPortEClass, EndSystemPort.class, "EndSystemPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(periodicityEEnum, Periodicity.class, "Periodicity");
		addEEnumLiteral(periodicityEEnum, Periodicity.PERIODIC);
		addEEnumLiteral(periodicityEEnum, Periodicity.SPORADIC);
		addEEnumLiteral(periodicityEEnum, Periodicity.APERIODIC);

		initEEnum(schedulingAlgorithmEEnum, SchedulingAlgorithm.class, "SchedulingAlgorithm");
		addEEnumLiteral(schedulingAlgorithmEEnum, SchedulingAlgorithm.FIXED_PRIORITY);
		addEEnumLiteral(schedulingAlgorithmEEnum, SchedulingAlgorithm.RATE_MONOTONIC);
		addEEnumLiteral(schedulingAlgorithmEEnum, SchedulingAlgorithm.DEADLINE_MONOTONIC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositiveWCET ExecutionAndDeadlineAllowsCompletion ExecutionAndPeriodAllowsCompletion DeadlineLessThanPeriod PositivePeriod"
		   });	
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositiveDelay NonZeroPeriod NonOverlappingPartitions"
		   });	
		addAnnotation
		  (partitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositivePeriod AvailibilityFactorLessThanOrEqualToOne PeriodSpansIntervals NonOverlappingIntervals"
		   });	
		addAnnotation
		  (intervalEClass, 
		   source, 
		   new String[] {
			 "constraints", "EndAfterStart NonZeroLength"
		   });	
		addAnnotation
		  (networkEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositiveNetworkLatency PositiveNetworkBandwith"
		   });	
		addAnnotation
		  (switchEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtleastTwoSwitchPorts"
		   });	
		addAnnotation
		  (virtualLinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "DestinationsCannotIncludeSource PositiveBAG PositiveMaxFrameSize PathExists RoutesConnectSourceToDestinations NoCycles"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositiveBandwidth UtilizationSumLessThanOne"
		   });
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "PositiveWCET", "worstCaseExecTime > 0",
			 "ExecutionAndDeadlineAllowsCompletion", "worstCaseExecTime <= implicitDeadline",
			 "ExecutionAndPeriodAllowsCompletion", "\n\t\tif (periodicity <> Periodicity::Aperiodic)\n\t\t\tthen worstCaseExecTime <= characteristicPeriod\n\t\t\telse true\n\t\t\tendif",
			 "DeadlineLessThanPeriod", "implicitDeadline <= characteristicPeriod",
			 "PositivePeriod", "characteristicPeriod > 0"
		   });	
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "PositiveDelay", "delay > 0",
			 "NonZeroPeriod", "period > 0",
			 "NonOverlappingPartitions", "let allIntervals : Sequence(Interval) = partition.executionIntervals\n\t\t->flatten()\n\t\t->sortedBy(i : Interval | i.start)\n\tin if (allIntervals\n\t\t\t->size() <= 1)\n\t\tthen true\n\t\telse allIntervals\n\t\t\t->subSequence(1, allIntervals\n\t\t\t\t->size() - 1)\n\t\t\t->forAll(i : Interval | i.end <= allIntervals\n\t\t\t\t->at(1 + allIntervals\n\t\t\t\t\t->indexOf(i)).start)\n\t\tendif"
		   });	
		addAnnotation
		  (getModule_Utilization(), 
		   source, 
		   new String[] {
			 "derivation", "if (partition\n\t\t\t\t\t\t->size() > 0)\n\t\t\t\t\tthen partition\n\t\t\t\t\t\t->collect(p | p.availabilityFactor)\n\t\t\t\t\t\t->sum()\n\t\t\t\t\telse 0.0\n\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (partitionEClass, 
		   source, 
		   new String[] {
			 "PositivePeriod", "period > 0",
			 "AvailibilityFactorLessThanOrEqualToOne", "availabilityFactor <= 1",
			 "PeriodSpansIntervals", "let sortedIntervals : Sequence(Interval) = executionIntervals\n\t\t->sortedBy(start)\n\tin if (sortedIntervals\n\t\t->size() > 1)\n\tthen sortedIntervals\n\t\t->last().end <= period\n\telse true\n\tendif",
			 "NonOverlappingIntervals", "if (executionIntervals\n\t\t->size() <= 1)\n\tthen true -- Nothing can overlap if there is only one or none!\n\telse\n\tlet sortedIntervals : Sequence(Interval) = executionIntervals\n\t\t->sortedBy(i : Interval | i.start)\n\tin sortedIntervals\n\t\t->subSequence(1, sortedIntervals\n\t\t\t->size() - 1)\n\t\t->forAll(i : Interval | i.end <= sortedIntervals\n\t\t\t->at(1 + sortedIntervals\n\t\t\t\t->indexOf(i)).start)\n\tendif"
		   });	
		addAnnotation
		  (getPartition_Period(), 
		   source, 
		   new String[] {
			 "derivation", "if (module\n\t\t\t->oclIsInvalid() or module\n\t\t\t->oclIsUndefined() or module = null)\n\t\tthen 0.0\n\t\telse self.module.period\n\t\tendif"
		   });	
		addAnnotation
		  (getPartition_AvailabilityFactor(), 
		   source, 
		   new String[] {
			 "derivation", "--check for divide by zero!\n\t\t\tif (period <> 0)\n\t\t\tthen executionIntervals\n\t\t\t\t->collect(i : Interval | i.end - i.start)\n\t\t\t\t->sum() / period\n\t\t\telse 0.0\n\t\t\tendif"
		   });	
		addAnnotation
		  (intervalEClass, 
		   source, 
		   new String[] {
			 "EndAfterStart", "end >= start",
			 "NonZeroLength", "end <> start"
		   });	
		addAnnotation
		  (networkEClass, 
		   source, 
		   new String[] {
			 "PositiveNetworkLatency", "latency > 0",
			 "PositiveNetworkBandwith", "networkBandwidth > 0"
		   });	
		addAnnotation
		  (switchEClass, 
		   source, 
		   new String[] {
			 "AtleastTwoSwitchPorts", "switchPorts->size() > 1"
		   });	
		addAnnotation
		  (virtualLinkEClass, 
		   source, 
		   new String[] {
			 "DestinationsCannotIncludeSource", "\n\t\t\t\tdestinations->forAll(dest : Module | dest <> source)",
			 "PositiveBAG", "BAG > 0",
			 "PositiveMaxFrameSize", "maxFrameSize > 0"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "PositiveBandwidth", "Bandwidth > 0"
		   });
	}

} // RealtimeschedulingPackageImpl
