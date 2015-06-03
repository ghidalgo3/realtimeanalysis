/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.System#getUses <em>Uses</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.System#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.System#getExecutesSoftware <em>Executes Software</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference.
	 * @see #setUses(HardwareResource)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSystem_Uses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HardwareResource getUses();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.System#getUses <em>Uses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' containment reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(HardwareResource value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Executes Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executes Software</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executes Software</em>' containment reference.
	 * @see #setExecutesSoftware(SoftwareResource)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSystem_ExecutesSoftware()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SoftwareResource getExecutesSoftware();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.System#getExecutesSoftware <em>Executes Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executes Software</em>' containment reference.
	 * @see #getExecutesSoftware()
	 * @generated
	 */
	void setExecutesSoftware(SoftwareResource value);

} // System
