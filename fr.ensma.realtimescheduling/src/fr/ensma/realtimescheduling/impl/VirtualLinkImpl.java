/**
 */
package fr.ensma.realtimescheduling.impl;

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
import fr.ensma.realtimescheduling.Node;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.VirtualLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getMinInterFrameTime <em>Min Inter Frame Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.VirtualLinkImpl#getEndToEndDelay <em>End To End Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualLinkImpl extends MinimalEObjectImpl.Container implements VirtualLink {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

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
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, RealtimeschedulingPackage.VIRTUAL_LINK__NODES, RealtimeschedulingPackage.NODE__VIRTUAL_LINKS);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.VIRTUAL_LINK__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__NODES:
				return getNodes();
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				return getId();
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				return getMinInterFrameTime();
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				return getEndToEndDelay();
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				setId((String)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				setMinInterFrameTime((Integer)newValue);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				setEndToEndDelay((Integer)newValue);
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__NODES:
				getNodes().clear();
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				setMinInterFrameTime(MIN_INTER_FRAME_TIME_EDEFAULT);
				return;
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				setEndToEndDelay(END_TO_END_DELAY_EDEFAULT);
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
			case RealtimeschedulingPackage.VIRTUAL_LINK__NODES:
				return nodes != null && !nodes.isEmpty();
			case RealtimeschedulingPackage.VIRTUAL_LINK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimeschedulingPackage.VIRTUAL_LINK__MIN_INTER_FRAME_TIME:
				return minInterFrameTime != MIN_INTER_FRAME_TIME_EDEFAULT;
			case RealtimeschedulingPackage.VIRTUAL_LINK__END_TO_END_DELAY:
				return endToEndDelay != END_TO_END_DELAY_EDEFAULT;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(minInterFrameTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nodes == null) ? 0 : nodes.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VirtualLinkImpl)) {
			return false;
		}
		VirtualLinkImpl other = (VirtualLinkImpl) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (Double.doubleToLongBits(minInterFrameTime) != Double
				.doubleToLongBits(other.minInterFrameTime)) {
			return false;
		}
		if (nodes == null) {
			if (other.nodes != null) {
				return false;
			}
		} else if (!nodes.equals(other.nodes)) {
			return false;
		}
		return true;
	}
	
	

} //VirtualLinkImpl
