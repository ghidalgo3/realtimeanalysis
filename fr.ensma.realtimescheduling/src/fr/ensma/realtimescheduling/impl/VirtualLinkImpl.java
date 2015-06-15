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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getMinInterFrameTime <em>Min Inter Frame Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getEndToEndDelay <em>End To End Delay</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualLinkImpl extends MinimalEObjectImpl.Container implements VirtualLink {
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
	 * The default value of the '{@link #getMinInterFrameTime() <em>Min Inter Frame Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterFrameTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INTER_FRAME_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinInterFrameTime() <em>Min Inter Frame Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterFrameTime()
	 * @generated
	 * @ordered
	 */
	protected int minInterFrameTime = MIN_INTER_FRAME_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndToEndDelay() <em>End To End Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int END_TO_END_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndToEndDelay() <em>End To End Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndDelay()
	 * @generated
	 * @ordered
	 */
	protected int endToEndDelay = END_TO_END_DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Module source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.VIRTUAL_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInterFrameTime() {
		return minInterFrameTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterFrameTime(int newMinInterFrameTime) {
		int oldMinInterFrameTime = minInterFrameTime;
		minInterFrameTime = newMinInterFrameTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME, oldMinInterFrameTime, minInterFrameTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndToEndDelay() {
		return endToEndDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndToEndDelay(int newEndToEndDelay) {
		int oldEndToEndDelay = endToEndDelay;
		endToEndDelay = newEndToEndDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY, oldEndToEndDelay, endToEndDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Module newSource) {
		Module oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				return getId();
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				return getMinInterFrameTime();
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				return getEndToEndDelay();
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				return getRoutes();
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				setId((String)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				setMinInterFrameTime((Integer)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				setEndToEndDelay((Integer)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				setSource((Module)newValue);
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				setMinInterFrameTime(MIN_INTER_FRAME_TIME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				setEndToEndDelay(END_TO_END_DELAY_EDEFAULT);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				getRoutes().clear();
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				setSource((Module)null);
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				return minInterFrameTime != MIN_INTER_FRAME_TIME_EDEFAULT;
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				return endToEndDelay != END_TO_END_DELAY_EDEFAULT;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ROUTES:
				return routes != null && !routes.isEmpty();
			case RealtimeschedulingPackage.VIRTUAL_LINK__SOURCE:
				return source != null;
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
		result.append(", minInterFrameTime: ");
		result.append(minInterFrameTime);
		result.append(", endToEndDelay: ");
		result.append(endToEndDelay);
		result.append(')');
		return result.toString();
	}

} //VirtualLinkImpl
