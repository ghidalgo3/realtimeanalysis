/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Network;
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
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getVirtualLinks <em>Virtual Links</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getNetworkBandwidth <em>Network Bandwidth</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.NetworkImpl#getMaxFrameSize <em>Max Frame Size</em>}</li>
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
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;
	/**
	 * The cached value of the '{@link #getVirtualLinks() <em>Virtual Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualLink> virtualLinks;

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
	 * The default value of the '{@link #getNetworkBandwidth() <em>Network Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final double NETWORK_BANDWIDTH_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getNetworkBandwidth() <em>Network Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkBandwidth()
	 * @generated
	 * @ordered
	 */
	protected double networkBandwidth = NETWORK_BANDWIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_FRAME_SIZE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected double maxFrameSize = MAX_FRAME_SIZE_EDEFAULT;

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
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, RealtimeschedulingPackage.NETWORK__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualLink> getVirtualLinks() {
		if (virtualLinks == null) {
			virtualLinks = new EObjectContainmentEList<VirtualLink>(VirtualLink.class, this, RealtimeschedulingPackage.NETWORK__VIRTUAL_LINKS);
		}
		return virtualLinks;
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
	public double getNetworkBandwidth() {
		return networkBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkBandwidth(double newNetworkBandwidth) {
		double oldNetworkBandwidth = networkBandwidth;
		networkBandwidth = newNetworkBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH, oldNetworkBandwidth, networkBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxFrameSize() {
		return maxFrameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFrameSize(double newMaxFrameSize) {
		double oldMaxFrameSize = maxFrameSize;
		maxFrameSize = newMaxFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.NETWORK__MAX_FRAME_SIZE, oldMaxFrameSize, maxFrameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.NETWORK__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.NETWORK__VIRTUAL_LINKS:
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
			case RealtimeschedulingPackage.NETWORK__NAME:
				return getName();
			case RealtimeschedulingPackage.NETWORK__NODES:
				return getNodes();
			case RealtimeschedulingPackage.NETWORK__VIRTUAL_LINKS:
				return getVirtualLinks();
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				return getLatency();
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				return getNetworkBandwidth();
			case RealtimeschedulingPackage.NETWORK__MAX_FRAME_SIZE:
				return getMaxFrameSize();
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
			case RealtimeschedulingPackage.NETWORK__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__VIRTUAL_LINKS:
				getVirtualLinks().clear();
				getVirtualLinks().addAll((Collection<? extends VirtualLink>)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				setLatency((Integer)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				setNetworkBandwidth((Double)newValue);
				return;
			case RealtimeschedulingPackage.NETWORK__MAX_FRAME_SIZE:
				setMaxFrameSize((Double)newValue);
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
			case RealtimeschedulingPackage.NETWORK__NODES:
				getNodes().clear();
				return;
			case RealtimeschedulingPackage.NETWORK__VIRTUAL_LINKS:
				getVirtualLinks().clear();
				return;
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				setNetworkBandwidth(NETWORK_BANDWIDTH_EDEFAULT);
				return;
			case RealtimeschedulingPackage.NETWORK__MAX_FRAME_SIZE:
				setMaxFrameSize(MAX_FRAME_SIZE_EDEFAULT);
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
			case RealtimeschedulingPackage.NETWORK__NODES:
				return nodes != null && !nodes.isEmpty();
			case RealtimeschedulingPackage.NETWORK__VIRTUAL_LINKS:
				return virtualLinks != null && !virtualLinks.isEmpty();
			case RealtimeschedulingPackage.NETWORK__LATENCY:
				return latency != LATENCY_EDEFAULT;
			case RealtimeschedulingPackage.NETWORK__NETWORK_BANDWIDTH:
				return networkBandwidth != NETWORK_BANDWIDTH_EDEFAULT;
			case RealtimeschedulingPackage.NETWORK__MAX_FRAME_SIZE:
				return maxFrameSize != MAX_FRAME_SIZE_EDEFAULT;
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
		result.append(", latency: ");
		result.append(latency);
		result.append(", networkBandwidth: ");
		result.append(networkBandwidth);
		result.append(", maxFrameSize: ");
		result.append(maxFrameSize);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
