/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Node;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.VirtualLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NodeImpl#getVirtualLinks <em>Virtual Links</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NodeImpl#getTransmissionDelay <em>Transmission Delay</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NodeImpl#getRealLinks <em>Real Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getVirtualLinks() <em>Virtual Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualLink> virtualLinks;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmissionDelay() <em>Transmission Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMISSION_DELAY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransmissionDelay() <em>Transmission Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionDelay()
	 * @generated
	 * @ordered
	 */
	protected double transmissionDelay = TRANSMISSION_DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealLinks() <em>Real Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> realLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualLink> getVirtualLinks() {
		if (virtualLinks == null) {
			virtualLinks = new EObjectWithInverseResolvingEList.ManyInverse<VirtualLink>(VirtualLink.class, this, RealtimeschedulingPackage.NODE__VIRTUAL_LINKS, RealtimeschedulingPackage.VIRTUAL_LINK__NODES);
		}
		return virtualLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransmissionDelay() {
		return transmissionDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionDelay(double newTransmissionDelay) {
		double oldTransmissionDelay = transmissionDelay;
		transmissionDelay = newTransmissionDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.NODE__TRANSMISSION_DELAY, oldTransmissionDelay, transmissionDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRealLinks() {
		if (realLinks == null) {
			realLinks = new EObjectResolvingEList<Node>(Node.class, this, RealtimeschedulingPackage.NODE__REAL_LINKS);
		}
		return realLinks;
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
			case RealtimeschedulingPackage.NODE__VIRTUAL_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualLinks()).basicAdd(otherEnd, msgs);
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
			case RealtimeschedulingPackage.NODE__VIRTUAL_LINKS:
				return ((InternalEList<?>)getVirtualLinks()).basicRemove(otherEnd, msgs);
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
			case RealtimeschedulingPackage.NODE__VIRTUAL_LINKS:
				return getVirtualLinks();
			case RealtimeschedulingPackage.NODE__ID:
				return getId();
			case RealtimeschedulingPackage.NODE__TRANSMISSION_DELAY:
				return getTransmissionDelay();
			case RealtimeschedulingPackage.NODE__REAL_LINKS:
				return getRealLinks();
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
			case RealtimeschedulingPackage.NODE__VIRTUAL_LINKS:
				getVirtualLinks().clear();
				getVirtualLinks().addAll((Collection<? extends VirtualLink>)newValue);
				return;
			case RealtimeschedulingPackage.NODE__ID:
				setId((String)newValue);
				return;
			case RealtimeschedulingPackage.NODE__TRANSMISSION_DELAY:
				setTransmissionDelay((Double)newValue);
				return;
			case RealtimeschedulingPackage.NODE__REAL_LINKS:
				getRealLinks().clear();
				getRealLinks().addAll((Collection<? extends Node>)newValue);
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
			case RealtimeschedulingPackage.NODE__VIRTUAL_LINKS:
				getVirtualLinks().clear();
				return;
			case RealtimeschedulingPackage.NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimeschedulingPackage.NODE__TRANSMISSION_DELAY:
				setTransmissionDelay(TRANSMISSION_DELAY_EDEFAULT);
				return;
			case RealtimeschedulingPackage.NODE__REAL_LINKS:
				getRealLinks().clear();
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
			case RealtimeschedulingPackage.NODE__VIRTUAL_LINKS:
				return virtualLinks != null && !virtualLinks.isEmpty();
			case RealtimeschedulingPackage.NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimeschedulingPackage.NODE__TRANSMISSION_DELAY:
				return transmissionDelay != TRANSMISSION_DELAY_EDEFAULT;
			case RealtimeschedulingPackage.NODE__REAL_LINKS:
				return realLinks != null && !realLinks.isEmpty();
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
		result.append(", transmissionDelay: ");
		result.append(transmissionDelay);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
