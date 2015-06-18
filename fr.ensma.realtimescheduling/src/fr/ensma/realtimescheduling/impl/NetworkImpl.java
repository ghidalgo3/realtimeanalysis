/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Connection;
import fr.ensma.realtimescheduling.Network;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.Switch;

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
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getNetworkBandwidth <em>Network Bandwidth</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getLatency <em>Latency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
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
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switches;

	/**
	 * The default value of the '{@link #getNetworkBandwidth() <em>Network Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final int NETWORK_BANDWIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNetworkBandwidth() <em>Network Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkBandwidth()
	 * @generated
	 * @ordered
	 */
	protected int networkBandwidth = NETWORK_BANDWIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final int LATENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected int latency = LATENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new EObjectContainmentEList<Switch>(Switch.class, this, RealtimeschedulingPackage.NETWORK__SWITCHES);
		}
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNetworkBandwidth() {
		return networkBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkBandwidth(int newNetworkBandwidth) {
		int oldNetworkBandwidth = networkBandwidth;
		networkBandwidth = newNetworkBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH, oldNetworkBandwidth, networkBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, RealtimeschedulingPackage.NETWORK__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(int newLatency) {
		int oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.NETWORK__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.NETWORK__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.NETWORK__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case RealtimeschedulingPackage.NETWORK__NAME:
				return getName();
			case RealtimeschedulingPackage.NETWORK__SWITCHES:
				return getSwitches();
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				return getNetworkBandwidth();
			case RealtimeschedulingPackage.NETWORK__CONNECTIONS:
				return getConnections();
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				return getLatency();
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
			case RealtimeschedulingPackage.NETWORK__NAME:
				setName((String)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				setNetworkBandwidth((Integer)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				setLatency((Integer)newValue);
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
			case RealtimeschedulingPackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.NETWORK__SWITCHES:
				getSwitches().clear();
				return;
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				setNetworkBandwidth(NETWORK_BANDWIDTH_EDEFAULT);
				return;
			case RealtimeschedulingPackage.NETWORK__CONNECTIONS:
				getConnections().clear();
				return;
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				setLatency(LATENCY_EDEFAULT);
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
			case RealtimeschedulingPackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimeschedulingPackage.NETWORK__SWITCHES:
				return switches != null && !switches.isEmpty();
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				return networkBandwidth != NETWORK_BANDWIDTH_EDEFAULT;
			case RealtimeschedulingPackage.NETWORK__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				return latency != LATENCY_EDEFAULT;
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
		result.append(", networkBandwidth: ");
		result.append(networkBandwidth);
		result.append(", latency: ");
		result.append(latency);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
