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
 *   <li>{@link fr.ensma.realtimescheduling.Route#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Route#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getRoute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DestinationsCannotIncludeSource'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DestinationsCannotIncludeSource='\n\t\t\tdestinations->forAll(dest : Module | dest <> source)'"
 * @generated
 */
public interface Route extends EObject {
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
	 * @model opposite="route"
	 * @generated
	 */
	EList<Connection> getConnection();

} // Route
