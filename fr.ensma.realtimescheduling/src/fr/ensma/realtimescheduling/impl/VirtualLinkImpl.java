/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Module;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.Route;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Virtual Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getBAG <em>BAG</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getMaxFrameSize <em>Max Frame Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualLinkImpl extends MinimalEObjectImpl.Container implements
		VirtualLink {

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBAG() <em>BAG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAG()
	 * @generated
	 * @ordered
	 */
	protected static final int BAG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBAG() <em>BAG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAG()
	 * @generated
	 * @ordered
	 */
	protected int bag = BAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Module source;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> destinations;

	/**
	 * The default value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_FRAME_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected int maxFrameSize = MAX_FRAME_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.VIRTUAL_LINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBAG() {
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBAG(int newBAG) {
		int oldBAG = bag;
		bag = newBAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__BAG, oldBAG, bag));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Module getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Module)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Module newSource) {
		Module oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectResolvingEList<Module>(Module.class, this, RealtimeschedulingPackage.VIRTUAL_LINK__DESTINATIONS);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxFrameSize() {
		return maxFrameSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFrameSize(int newMaxFrameSize) {
		int oldMaxFrameSize = maxFrameSize;
		maxFrameSize = newMaxFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__MAX_FRAME_SIZE, oldMaxFrameSize, maxFrameSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				return getId();
			case RealtimeschedulingPackage.VIRTUAL_LINK__BAG:
				return getBAG();
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				return getRoutes();
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RealtimeschedulingPackage.VIRTUAL_LINK__DESTINATIONS:
				return getDestinations();
			case RealtimeschedulingPackage.VIRTUAL_LINK__MAX_FRAME_SIZE:
				return getMaxFrameSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				setId((String)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__BAG:
				setBAG((Integer)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				setSource((Module)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__DESTINATIONS:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends Module>)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__MAX_FRAME_SIZE:
				setMaxFrameSize((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__BAG:
				setBAG(BAG_EDEFAULT);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				getRoutes().clear();
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				setSource((Module)null);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__DESTINATIONS:
				getDestinations().clear();
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__MAX_FRAME_SIZE:
				setMaxFrameSize(MAX_FRAME_SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimeschedulingPackage.VIRTUAL_LINK__BAG:
				return bag != BAG_EDEFAULT;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				return routes != null && !routes.isEmpty();
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				return source != null;
			case RealtimeschedulingPackage.VIRTUAL_LINK__DESTINATIONS:
				return destinations != null && !destinations.isEmpty();
			case RealtimeschedulingPackage.VIRTUAL_LINK__MAX_FRAME_SIZE:
				return maxFrameSize != MAX_FRAME_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", BAG: ");
		result.append(bag);
		result.append(", maxFrameSize: ");
		result.append(maxFrameSize);
		result.append(')');
		return result.toString();
	}

} // VirtualLinkImpl
