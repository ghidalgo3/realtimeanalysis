/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Interval;
import fr.ensma.realtimescheduling.Module;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.SchedulingAlgorithm;
import fr.ensma.realtimescheduling.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getExecutionIntervals <em>Execution Intervals</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getVirtualProcessorUtilization <em>Virtual Processor Utilization</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getAvailabilityFactor <em>Availability Factor</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.PartitionImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionImpl extends MinimalEObjectImpl.Container implements Partition {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PERIOD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimeschedulingPackage.Literals.PARTITION__PERIOD).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getExecutionIntervals() <em>Execution Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<Interval> executionIntervals;

	/**
	 * The default value of the '{@link #getVirtualProcessorUtilization() <em>Virtual Processor Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualProcessorUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double VIRTUAL_PROCESSOR_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVirtualProcessorUtilization() <em>Virtual Processor Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualProcessorUtilization()
	 * @generated
	 * @ordered
	 */
	protected double virtualProcessorUtilization = VIRTUAL_PROCESSOR_UTILIZATION_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getAvailabilityFactor() <em>Availability Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityFactor()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate AVAILABILITY_FACTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimeschedulingPackage.Literals.PARTITION__AVAILABILITY_FACTOR).getSettingDelegate();

	/**
	 * The default value of the '{@link #getSchedulingAlgorithm() <em>Scheduling Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingAlgorithm SCHEDULING_ALGORITHM_EDEFAULT = SchedulingAlgorithm.FIXED_PRIORITY;

	/**
	 * The cached value of the '{@link #getSchedulingAlgorithm() <em>Scheduling Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected SchedulingAlgorithm schedulingAlgorithm = SCHEDULING_ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected Module module;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.PARTITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod() {
		return (Double)PERIOD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interval> getExecutionIntervals() {
		if (executionIntervals == null) {
			executionIntervals = new EObjectContainmentEList<Interval>(Interval.class, this, RealtimeschedulingPackage.PARTITION__EXECUTION_INTERVALS);
		}
		return executionIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVirtualProcessorUtilization() {
		return virtualProcessorUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualProcessorUtilization(double newVirtualProcessorUtilization) {
		double oldVirtualProcessorUtilization = virtualProcessorUtilization;
		virtualProcessorUtilization = newVirtualProcessorUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.PARTITION__VIRTUAL_PROCESSOR_UTILIZATION, oldVirtualProcessorUtilization, virtualProcessorUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvailabilityFactor() {
		return (Double)AVAILABILITY_FACTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingAlgorithm getSchedulingAlgorithm() {
		return schedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingAlgorithm(SchedulingAlgorithm newSchedulingAlgorithm) {
		SchedulingAlgorithm oldSchedulingAlgorithm = schedulingAlgorithm;
		schedulingAlgorithm = newSchedulingAlgorithm == null ? SCHEDULING_ALGORITHM_EDEFAULT : newSchedulingAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.PARTITION__SCHEDULING_ALGORITHM, oldSchedulingAlgorithm, schedulingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, RealtimeschedulingPackage.PARTITION__TASKS, RealtimeschedulingPackage.TASK__PARTITION);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (Module)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimeschedulingPackage.PARTITION__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		Module oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.PARTITION__MODULE, oldModule, newModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject)module).eInverseRemove(this, RealtimeschedulingPackage.MODULE__PARTITION, Module.class, msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, RealtimeschedulingPackage.MODULE__PARTITION, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.PARTITION__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.PARTITION__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case RealtimeschedulingPackage.PARTITION__MODULE:
				if (module != null)
					msgs = ((InternalEObject)module).eInverseRemove(this, RealtimeschedulingPackage.MODULE__PARTITION, Module.class, msgs);
				return basicSetModule((Module)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.PARTITION__EXECUTION_INTERVALS:
				return ((InternalEList<?>)getExecutionIntervals()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.PARTITION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.PARTITION__MODULE:
				return basicSetModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimeschedulingPackage.PARTITION__ID:
				return getId();
			case RealtimeschedulingPackage.PARTITION__PERIOD:
				return getPeriod();
			case RealtimeschedulingPackage.PARTITION__EXECUTION_INTERVALS:
				return getExecutionIntervals();
			case RealtimeschedulingPackage.PARTITION__VIRTUAL_PROCESSOR_UTILIZATION:
				return getVirtualProcessorUtilization();
			case RealtimeschedulingPackage.PARTITION__AVAILABILITY_FACTOR:
				return getAvailabilityFactor();
			case RealtimeschedulingPackage.PARTITION__SCHEDULING_ALGORITHM:
				return getSchedulingAlgorithm();
			case RealtimeschedulingPackage.PARTITION__TASKS:
				return getTasks();
			case RealtimeschedulingPackage.PARTITION__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimeschedulingPackage.PARTITION__ID:
				setId((Integer)newValue);
				return;
			case RealtimeschedulingPackage.PARTITION__EXECUTION_INTERVALS:
				getExecutionIntervals().clear();
				getExecutionIntervals().addAll((Collection<? extends Interval>)newValue);
				return;
			case RealtimeschedulingPackage.PARTITION__VIRTUAL_PROCESSOR_UTILIZATION:
				setVirtualProcessorUtilization((Double)newValue);
				return;
			case RealtimeschedulingPackage.PARTITION__SCHEDULING_ALGORITHM:
				setSchedulingAlgorithm((SchedulingAlgorithm)newValue);
				return;
			case RealtimeschedulingPackage.PARTITION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case RealtimeschedulingPackage.PARTITION__MODULE:
				setModule((Module)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RealtimeschedulingPackage.PARTITION__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimeschedulingPackage.PARTITION__EXECUTION_INTERVALS:
				getExecutionIntervals().clear();
				return;
			case RealtimeschedulingPackage.PARTITION__VIRTUAL_PROCESSOR_UTILIZATION:
				setVirtualProcessorUtilization(VIRTUAL_PROCESSOR_UTILIZATION_EDEFAULT);
				return;
			case RealtimeschedulingPackage.PARTITION__SCHEDULING_ALGORITHM:
				setSchedulingAlgorithm(SCHEDULING_ALGORITHM_EDEFAULT);
				return;
			case RealtimeschedulingPackage.PARTITION__TASKS:
				getTasks().clear();
				return;
			case RealtimeschedulingPackage.PARTITION__MODULE:
				setModule((Module)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RealtimeschedulingPackage.PARTITION__ID:
				return id != ID_EDEFAULT;
			case RealtimeschedulingPackage.PARTITION__PERIOD:
				return PERIOD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimeschedulingPackage.PARTITION__EXECUTION_INTERVALS:
				return executionIntervals != null && !executionIntervals.isEmpty();
			case RealtimeschedulingPackage.PARTITION__VIRTUAL_PROCESSOR_UTILIZATION:
				return virtualProcessorUtilization != VIRTUAL_PROCESSOR_UTILIZATION_EDEFAULT;
			case RealtimeschedulingPackage.PARTITION__AVAILABILITY_FACTOR:
				return AVAILABILITY_FACTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimeschedulingPackage.PARTITION__SCHEDULING_ALGORITHM:
				return schedulingAlgorithm != SCHEDULING_ALGORITHM_EDEFAULT;
			case RealtimeschedulingPackage.PARTITION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case RealtimeschedulingPackage.PARTITION__MODULE:
				return module != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", virtualProcessorUtilization: ");
		result.append(virtualProcessorUtilization);
		result.append(", schedulingAlgorithm: ");
		result.append(schedulingAlgorithm);
		result.append(')');
		return result.toString();
	}

} //PartitionImpl
