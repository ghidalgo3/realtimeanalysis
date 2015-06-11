/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.Periodicity;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getWorstCaseExecTime <em>Worst Case Exec Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getImplicitDeadline <em>Implicit Deadline</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getWorstCaseResponseTime <em>Worst Case Response Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#isScheduleable <em>Scheduleable</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getCriticalInstance <em>Critical Instance</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getReleaseTime <em>Release Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getPeriodicity <em>Periodicity</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getCharacteristicPeriod <em>Characteristic Period</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.TaskImpl#getPartition <em>Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorstCaseExecTime() <em>Worst Case Exec Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCaseExecTime()
	 * @generated
	 * @ordered
	 */
	protected static final int WORST_CASE_EXEC_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWorstCaseExecTime() <em>Worst Case Exec Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCaseExecTime()
	 * @generated
	 * @ordered
	 */
	protected int worstCaseExecTime = WORST_CASE_EXEC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitDeadline() <em>Implicit Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final int IMPLICIT_DEADLINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getImplicitDeadline() <em>Implicit Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitDeadline()
	 * @generated
	 * @ordered
	 */
	protected int implicitDeadline = IMPLICIT_DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorstCaseResponseTime() <em>Worst Case Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCaseResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final int WORST_CASE_RESPONSE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWorstCaseResponseTime() <em>Worst Case Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCaseResponseTime()
	 * @generated
	 * @ordered
	 */
	protected int worstCaseResponseTime = WORST_CASE_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isScheduleable() <em>Scheduleable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduleable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCHEDULEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScheduleable() <em>Scheduleable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduleable()
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleable = SCHEDULEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected static final int JITTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected int jitter = JITTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticalInstance() <em>Critical Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalInstance()
	 * @generated
	 * @ordered
	 */
	protected static final int CRITICAL_INSTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCriticalInstance() <em>Critical Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalInstance()
	 * @generated
	 * @ordered
	 */
	protected int criticalInstance = CRITICAL_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseTime() <em>Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected static final int RELEASE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReleaseTime() <em>Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected int releaseTime = RELEASE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodicity() <em>Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected static final Periodicity PERIODICITY_EDEFAULT = Periodicity.PERIODIC;

	/**
	 * The cached value of the '{@link #getPeriodicity() <em>Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected Periodicity periodicity = PERIODICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacteristicPeriod() <em>Characteristic Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARACTERISTIC_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCharacteristicPeriod() <em>Characteristic Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicPeriod()
	 * @generated
	 * @ordered
	 */
	protected int characteristicPeriod = CHARACTERISTIC_PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected Partition partition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorstCaseExecTime() {
		return worstCaseExecTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstCaseExecTime(int newWorstCaseExecTime) {
		int oldWorstCaseExecTime = worstCaseExecTime;
		worstCaseExecTime = newWorstCaseExecTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__WORST_CASE_EXEC_TIME, oldWorstCaseExecTime, worstCaseExecTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getImplicitDeadline() {
		return implicitDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitDeadline(int newImplicitDeadline) {
		int oldImplicitDeadline = implicitDeadline;
		implicitDeadline = newImplicitDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__IMPLICIT_DEADLINE, oldImplicitDeadline, implicitDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorstCaseResponseTime() {
		return worstCaseResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstCaseResponseTime(int newWorstCaseResponseTime) {
		int oldWorstCaseResponseTime = worstCaseResponseTime;
		worstCaseResponseTime = newWorstCaseResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__WORST_CASE_RESPONSE_TIME, oldWorstCaseResponseTime, worstCaseResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScheduleable() {
		return scheduleable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleable(boolean newScheduleable) {
		boolean oldScheduleable = scheduleable;
		scheduleable = newScheduleable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__SCHEDULEABLE, oldScheduleable, scheduleable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(int newJitter) {
		int oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__JITTER, oldJitter, jitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCriticalInstance() {
		return criticalInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalInstance(int newCriticalInstance) {
		int oldCriticalInstance = criticalInstance;
		criticalInstance = newCriticalInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__CRITICAL_INSTANCE, oldCriticalInstance, criticalInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReleaseTime() {
		return releaseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseTime(int newReleaseTime) {
		int oldReleaseTime = releaseTime;
		releaseTime = newReleaseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__RELEASE_TIME, oldReleaseTime, releaseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Periodicity getPeriodicity() {
		return periodicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicity(Periodicity newPeriodicity) {
		Periodicity oldPeriodicity = periodicity;
		periodicity = newPeriodicity == null ? PERIODICITY_EDEFAULT : newPeriodicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__PERIODICITY, oldPeriodicity, periodicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharacteristicPeriod() {
		return characteristicPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristicPeriod(int newCharacteristicPeriod) {
		int oldCharacteristicPeriod = characteristicPeriod;
		characteristicPeriod = newCharacteristicPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__CHARACTERISTIC_PERIOD, oldCharacteristicPeriod, characteristicPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getPartition() {
		if (partition != null && partition.eIsProxy()) {
			InternalEObject oldPartition = (InternalEObject)partition;
			partition = (Partition)eResolveProxy(oldPartition);
			if (partition != oldPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimeschedulingPackage.TASK__PARTITION, oldPartition, partition));
			}
		}
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition basicGetPartition() {
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartition(Partition newPartition, NotificationChain msgs) {
		Partition oldPartition = partition;
		partition = newPartition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__PARTITION, oldPartition, newPartition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartition(Partition newPartition) {
		if (newPartition != partition) {
			NotificationChain msgs = null;
			if (partition != null)
				msgs = ((InternalEObject)partition).eInverseRemove(this, RealtimeschedulingPackage.PARTITION__TASKS, Partition.class, msgs);
			if (newPartition != null)
				msgs = ((InternalEObject)newPartition).eInverseAdd(this, RealtimeschedulingPackage.PARTITION__TASKS, Partition.class, msgs);
			msgs = basicSetPartition(newPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.TASK__PARTITION, newPartition, newPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.TASK__PARTITION:
				if (partition != null)
					msgs = ((InternalEObject)partition).eInverseRemove(this, RealtimeschedulingPackage.PARTITION__TASKS, Partition.class, msgs);
				return basicSetPartition((Partition)otherEnd, msgs);
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
			case RealtimeschedulingPackage.TASK__PARTITION:
				return basicSetPartition(null, msgs);
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
			case RealtimeschedulingPackage.TASK__NAME:
				return getName();
			case RealtimeschedulingPackage.TASK__WORST_CASE_EXEC_TIME:
				return getWorstCaseExecTime();
			case RealtimeschedulingPackage.TASK__IMPLICIT_DEADLINE:
				return getImplicitDeadline();
			case RealtimeschedulingPackage.TASK__PRIORITY:
				return getPriority();
			case RealtimeschedulingPackage.TASK__WORST_CASE_RESPONSE_TIME:
				return getWorstCaseResponseTime();
			case RealtimeschedulingPackage.TASK__SCHEDULEABLE:
				return isScheduleable();
			case RealtimeschedulingPackage.TASK__JITTER:
				return getJitter();
			case RealtimeschedulingPackage.TASK__CRITICAL_INSTANCE:
				return getCriticalInstance();
			case RealtimeschedulingPackage.TASK__RELEASE_TIME:
				return getReleaseTime();
			case RealtimeschedulingPackage.TASK__PERIODICITY:
				return getPeriodicity();
			case RealtimeschedulingPackage.TASK__CHARACTERISTIC_PERIOD:
				return getCharacteristicPeriod();
			case RealtimeschedulingPackage.TASK__PARTITION:
				if (resolve) return getPartition();
				return basicGetPartition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimeschedulingPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case RealtimeschedulingPackage.TASK__WORST_CASE_EXEC_TIME:
				setWorstCaseExecTime((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__IMPLICIT_DEADLINE:
				setImplicitDeadline((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__WORST_CASE_RESPONSE_TIME:
				setWorstCaseResponseTime((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__SCHEDULEABLE:
				setScheduleable((Boolean)newValue);
				return;
			case RealtimeschedulingPackage.TASK__JITTER:
				setJitter((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__CRITICAL_INSTANCE:
				setCriticalInstance((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__RELEASE_TIME:
				setReleaseTime((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__PERIODICITY:
				setPeriodicity((Periodicity)newValue);
				return;
			case RealtimeschedulingPackage.TASK__CHARACTERISTIC_PERIOD:
				setCharacteristicPeriod((Integer)newValue);
				return;
			case RealtimeschedulingPackage.TASK__PARTITION:
				setPartition((Partition)newValue);
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
			case RealtimeschedulingPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__WORST_CASE_EXEC_TIME:
				setWorstCaseExecTime(WORST_CASE_EXEC_TIME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__IMPLICIT_DEADLINE:
				setImplicitDeadline(IMPLICIT_DEADLINE_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__WORST_CASE_RESPONSE_TIME:
				setWorstCaseResponseTime(WORST_CASE_RESPONSE_TIME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__SCHEDULEABLE:
				setScheduleable(SCHEDULEABLE_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__JITTER:
				setJitter(JITTER_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__CRITICAL_INSTANCE:
				setCriticalInstance(CRITICAL_INSTANCE_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__RELEASE_TIME:
				setReleaseTime(RELEASE_TIME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__PERIODICITY:
				setPeriodicity(PERIODICITY_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__CHARACTERISTIC_PERIOD:
				setCharacteristicPeriod(CHARACTERISTIC_PERIOD_EDEFAULT);
				return;
			case RealtimeschedulingPackage.TASK__PARTITION:
				setPartition((Partition)null);
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
			case RealtimeschedulingPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimeschedulingPackage.TASK__WORST_CASE_EXEC_TIME:
				return worstCaseExecTime != WORST_CASE_EXEC_TIME_EDEFAULT;
			case RealtimeschedulingPackage.TASK__IMPLICIT_DEADLINE:
				return implicitDeadline != IMPLICIT_DEADLINE_EDEFAULT;
			case RealtimeschedulingPackage.TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RealtimeschedulingPackage.TASK__WORST_CASE_RESPONSE_TIME:
				return worstCaseResponseTime != WORST_CASE_RESPONSE_TIME_EDEFAULT;
			case RealtimeschedulingPackage.TASK__SCHEDULEABLE:
				return scheduleable != SCHEDULEABLE_EDEFAULT;
			case RealtimeschedulingPackage.TASK__JITTER:
				return jitter != JITTER_EDEFAULT;
			case RealtimeschedulingPackage.TASK__CRITICAL_INSTANCE:
				return criticalInstance != CRITICAL_INSTANCE_EDEFAULT;
			case RealtimeschedulingPackage.TASK__RELEASE_TIME:
				return releaseTime != RELEASE_TIME_EDEFAULT;
			case RealtimeschedulingPackage.TASK__PERIODICITY:
				return periodicity != PERIODICITY_EDEFAULT;
			case RealtimeschedulingPackage.TASK__CHARACTERISTIC_PERIOD:
				return characteristicPeriod != CHARACTERISTIC_PERIOD_EDEFAULT;
			case RealtimeschedulingPackage.TASK__PARTITION:
				return partition != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", worstCaseExecTime: ");
		result.append(worstCaseExecTime);
		result.append(", implicitDeadline: ");
		result.append(implicitDeadline);
		result.append(", priority: ");
		result.append(priority);
		result.append(", worstCaseResponseTime: ");
		result.append(worstCaseResponseTime);
		result.append(", scheduleable: ");
		result.append(scheduleable);
		result.append(", jitter: ");
		result.append(jitter);
		result.append(", criticalInstance: ");
		result.append(criticalInstance);
		result.append(", releaseTime: ");
		result.append(releaseTime);
		result.append(", periodicity: ");
		result.append(periodicity);
		result.append(", characteristicPeriod: ");
		result.append(characteristicPeriod);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
