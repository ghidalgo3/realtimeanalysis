/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getMinInterFrameTime <em>Min Inter Frame Time</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getEndToEndDelay <em>End To End Delay</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getRoutes <em>Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink()
 * @model
 * @generated
 */
public interface VirtualLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.VirtualLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Min Inter Frame Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inter Frame Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inter Frame Time</em>' attribute.
	 * @see #setMinInterFrameTime(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink_MinInterFrameTime()
	 * @model required="true"
	 * @generated
	 */
	int getMinInterFrameTime();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.VirtualLink#getMinInterFrameTime <em>Min Inter Frame Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inter Frame Time</em>' attribute.
	 * @see #getMinInterFrameTime()
	 * @generated
	 */
	void setMinInterFrameTime(int value);

	/**
	 * Returns the value of the '<em><b>End To End Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End To End Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Delay</em>' attribute.
	 * @see #setEndToEndDelay(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink_EndToEndDelay()
	 * @model required="true"
	 * @generated
	 */
	int getEndToEndDelay();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.VirtualLink#getEndToEndDelay <em>End To End Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End To End Delay</em>' attribute.
	 * @see #getEndToEndDelay()
	 * @generated
	 */
	void setEndToEndDelay(int value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // VirtualLink
