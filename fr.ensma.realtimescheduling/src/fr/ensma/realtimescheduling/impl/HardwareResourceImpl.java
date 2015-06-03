/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.HardwareResource;
import fr.ensma.realtimescheduling.Module;
import fr.ensma.realtimescheduling.Network;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.HardwareResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.HardwareResourceImpl#getScheduledOn <em>Scheduled On</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.HardwareResourceImpl#getCommunicatesOver <em>Communicates Over</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareResourceImpl extends MinimalEObjectImpl.Container implements HardwareResource {
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
	 * The cached value of the '{@link #getScheduledOn() <em>Scheduled On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> scheduledOn;

	/**
	 * The cached value of the '{@link #getCommunicatesOver() <em>Communicates Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicatesOver()
	 * @generated
	 * @ordered
	 */
	protected Network communicatesOver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.HARDWARE_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.HARDWARE_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getScheduledOn() {
		if (scheduledOn == null) {
			scheduledOn = new EObjectContainmentEList<Module>(Module.class, this, RealtimeschedulingPackage.HARDWARE_RESOURCE__SCHEDULED_ON);
		}
		return scheduledOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getCommunicatesOver() {
		return communicatesOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicatesOver(Network newCommunicatesOver, NotificationChain msgs) {
		Network oldCommunicatesOver = communicatesOver;
		communicatesOver = newCommunicatesOver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER, oldCommunicatesOver, newCommunicatesOver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicatesOver(Network newCommunicatesOver) {
		if (newCommunicatesOver != communicatesOver) {
			NotificationChain msgs = null;
			if (communicatesOver != null)
				msgs = ((InternalEObject)communicatesOver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER, null, msgs);
			if (newCommunicatesOver != null)
				msgs = ((InternalEObject)newCommunicatesOver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER, null, msgs);
			msgs = basicSetCommunicatesOver(newCommunicatesOver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER, newCommunicatesOver, newCommunicatesOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__SCHEDULED_ON:
				return ((InternalEList<?>)getScheduledOn()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER:
				return basicSetCommunicatesOver(null, msgs);
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
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__NAME:
				return getName();
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__SCHEDULED_ON:
				return getScheduledOn();
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER:
				return getCommunicatesOver();
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
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__SCHEDULED_ON:
				getScheduledOn().clear();
				getScheduledOn().addAll((Collection<? extends Module>)newValue);
				return;
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER:
				setCommunicatesOver((Network)newValue);
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
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__SCHEDULED_ON:
				getScheduledOn().clear();
				return;
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER:
				setCommunicatesOver((Network)null);
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
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__SCHEDULED_ON:
				return scheduledOn != null && !scheduledOn.isEmpty();
			case RealtimeschedulingPackage.HARDWARE_RESOURCE__COMMUNICATES_OVER:
				return communicatesOver != null;
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
		result.append(')');
		return result.toString();
	}

} //HardwareResourceImpl
