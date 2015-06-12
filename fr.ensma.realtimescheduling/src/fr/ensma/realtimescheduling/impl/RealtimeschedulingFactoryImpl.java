/**
 */
package fr.ensma.realtimescheduling.impl;

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
import fr.ensma.realtimescheduling.RealtimeschedulingFactory;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.SchedulingAlgorithm;
import fr.ensma.realtimescheduling.SoftwareResource;
import fr.ensma.realtimescheduling.Switch;
import fr.ensma.realtimescheduling.Task;
import fr.ensma.realtimescheduling.VirtualLink;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimeschedulingFactoryImpl extends EFactoryImpl implements RealtimeschedulingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RealtimeschedulingFactory init() {
		try {
			RealtimeschedulingFactory theRealtimeschedulingFactory = (RealtimeschedulingFactory)EPackage.Registry.INSTANCE.getEFactory(RealtimeschedulingPackage.eNS_URI);
			if (theRealtimeschedulingFactory != null) {
				return theRealtimeschedulingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RealtimeschedulingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeschedulingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RealtimeschedulingPackage.HARDWARE_RESOURCE: return createHardwareResource();
			case RealtimeschedulingPackage.TASK: return createTask();
			case RealtimeschedulingPackage.MODULE: return createModule();
			case RealtimeschedulingPackage.PARTITION: return createPartition();
			case RealtimeschedulingPackage.INTERVAL: return createInterval();
			case RealtimeschedulingPackage.NETWORK: return createNetwork();
			case RealtimeschedulingPackage.SYSTEM: return createSystem();
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE: return createSoftwareResource();
			case RealtimeschedulingPackage.PROCESSOR: return createProcessor();
			case RealtimeschedulingPackage.SWITCH: return createSwitch();
			case RealtimeschedulingPackage.VIRTUAL_LINK: return createVirtualLink();
			case RealtimeschedulingPackage.PORT: return createPort();
			case RealtimeschedulingPackage.CONNECTION: return createConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RealtimeschedulingPackage.PERIODICITY:
				return createPeriodicityFromString(eDataType, initialValue);
			case RealtimeschedulingPackage.SCHEDULING_ALGORITHM:
				return createSchedulingAlgorithmFromString(eDataType, initialValue);
			case RealtimeschedulingPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RealtimeschedulingPackage.PERIODICITY:
				return convertPeriodicityToString(eDataType, instanceValue);
			case RealtimeschedulingPackage.SCHEDULING_ALGORITHM:
				return convertSchedulingAlgorithmToString(eDataType, instanceValue);
			case RealtimeschedulingPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareResource createHardwareResource() {
		HardwareResourceImpl hardwareResource = new HardwareResourceImpl();
		return hardwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.ensma.realtimescheduling.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResource createSoftwareResource() {
		SoftwareResourceImpl softwareResource = new SoftwareResourceImpl();
		return softwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualLink createVirtualLink() {
		VirtualLinkImpl virtualLink = new VirtualLinkImpl();
		return virtualLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Periodicity createPeriodicityFromString(EDataType eDataType, String initialValue) {
		Periodicity result = Periodicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingAlgorithm createSchedulingAlgorithmFromString(EDataType eDataType, String initialValue) {
		SchedulingAlgorithm result = SchedulingAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeschedulingPackage getRealtimeschedulingPackage() {
		return (RealtimeschedulingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RealtimeschedulingPackage getPackage() {
		return RealtimeschedulingPackage.eINSTANCE;
	}

} //RealtimeschedulingFactoryImpl
