/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Route</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Route#getConnections <em>Connections</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Route#getEndToEndDelay <em>End To End Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Connection}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Connection#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute_Connections()
	 * @see fr.ensma.realtimescheduling.Connection#getRoutes
	 * @model opposite="routes"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>End To End Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End To End Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End to end delay for a frame on this route of a virtual link
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End To End Delay</em>' attribute.
	 * @see #setEndToEndDelay(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute_EndToEndDelay()
	 * @model required="true"
	 * @generated
	 */
	int getEndToEndDelay();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Route#getEndToEndDelay <em>End To End Delay</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>End To End Delay</em>' attribute.
	 * @see #getEndToEndDelay()
	 * @generated
	 */
	void setEndToEndDelay(int value);

} // Route
