/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Route#getSource <em>Source</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Route#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Route#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Module)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute_Source()
	 * @model required="true"
	 * @generated
	 */
	Module getSource();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Route#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Module value);

	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinations</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute_Destinations()
	 * @model required="true"
	 * @generated
	 */
	EList<Module> getDestinations();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Connection}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Connection#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute_Connection()
	 * @see fr.ensma.realtimescheduling.Connection#getRoute
	 * @model opposite="route" required="true"
	 * @generated
	 */
	EList<Connection> getConnection();

} // Route
