/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Connection;
import fr.ensma.realtimescheduling.Module;
import fr.ensma.realtimescheduling.Port;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.ConnectionImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.ConnectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.ConnectionImpl#getModule <em>Module</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.ConnectionImpl#getVirtuallink <em>Virtuallink</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

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
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected Module module;

	/**
	 * The cached value of the '{@link #getVirtuallink() <em>Virtuallink</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtuallink()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualLink> virtuallink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectWithInverseResolvingEList<Port>(Port.class, this, RealtimeschedulingPackage.CONNECTION__PORTS, RealtimeschedulingPackage.PORT__CONNECTION);
		}
		return ports;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.CONNECTION__ID, oldId, id));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimeschedulingPackage.CONNECTION__MODULE, oldModule, module));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.CONNECTION__MODULE, oldModule, newModule);
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
				msgs = ((InternalEObject)module).eInverseRemove(this, RealtimeschedulingPackage.MODULE__CONNECTION, Module.class, msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, RealtimeschedulingPackage.MODULE__CONNECTION, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.CONNECTION__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualLink> getVirtuallink() {
		if (virtuallink == null) {
			virtuallink = new EObjectWithInverseResolvingEList.ManyInverse<VirtualLink>(VirtualLink.class, this, RealtimeschedulingPackage.CONNECTION__VIRTUALLINK, RealtimeschedulingPackage.VIRTUAL_LINK__CONNECTION);
		}
		return virtuallink;
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
			case RealtimeschedulingPackage.CONNECTION__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case RealtimeschedulingPackage.CONNECTION__MODULE:
				if (module != null)
					msgs = ((InternalEObject)module).eInverseRemove(this, RealtimeschedulingPackage.MODULE__CONNECTION, Module.class, msgs);
				return basicSetModule((Module)otherEnd, msgs);
			case RealtimeschedulingPackage.CONNECTION__VIRTUALLINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtuallink()).basicAdd(otherEnd, msgs);
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
			case RealtimeschedulingPackage.CONNECTION__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.CONNECTION__MODULE:
				return basicSetModule(null, msgs);
			case RealtimeschedulingPackage.CONNECTION__VIRTUALLINK:
				return ((InternalEList<?>)getVirtuallink()).basicRemove(otherEnd, msgs);
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
			case RealtimeschedulingPackage.CONNECTION__PORTS:
				return getPorts();
			case RealtimeschedulingPackage.CONNECTION__ID:
				return getId();
			case RealtimeschedulingPackage.CONNECTION__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case RealtimeschedulingPackage.CONNECTION__VIRTUALLINK:
				return getVirtuallink();
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
			case RealtimeschedulingPackage.CONNECTION__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case RealtimeschedulingPackage.CONNECTION__ID:
				setId((String)newValue);
				return;
			case RealtimeschedulingPackage.CONNECTION__MODULE:
				setModule((Module)newValue);
				return;
			case RealtimeschedulingPackage.CONNECTION__VIRTUALLINK:
				getVirtuallink().clear();
				getVirtuallink().addAll((Collection<? extends VirtualLink>)newValue);
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
			case RealtimeschedulingPackage.CONNECTION__PORTS:
				getPorts().clear();
				return;
			case RealtimeschedulingPackage.CONNECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimeschedulingPackage.CONNECTION__MODULE:
				setModule((Module)null);
				return;
			case RealtimeschedulingPackage.CONNECTION__VIRTUALLINK:
				getVirtuallink().clear();
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
			case RealtimeschedulingPackage.CONNECTION__PORTS:
				return ports != null && !ports.isEmpty();
			case RealtimeschedulingPackage.CONNECTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimeschedulingPackage.CONNECTION__MODULE:
				return module != null;
			case RealtimeschedulingPackage.CONNECTION__VIRTUALLINK:
				return virtuallink != null && !virtuallink.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
