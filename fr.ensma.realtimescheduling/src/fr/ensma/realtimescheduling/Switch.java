/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Switch#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Switch#getSwitchPorts <em>Switch Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSwitch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtleastTwoSwitchPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AtleastTwoSwitchPorts='switchPorts->size() > 1'"
 * @generated
 */
public interface Switch extends EObject {
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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSwitch_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Switch#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Switch Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.SwitchPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Ports</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSwitch_SwitchPorts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SwitchPort> getSwitchPorts();

} // Switch
