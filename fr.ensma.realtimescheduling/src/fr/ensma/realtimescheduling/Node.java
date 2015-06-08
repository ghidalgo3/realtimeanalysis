/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Node#getVirtualLinks <em>Virtual Links</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Node#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Node#getTransmissionDelay <em>Transmission Delay</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Node#getRealLinks <em>Real Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Links</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.VirtualLink}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.VirtualLink#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Links</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNode_VirtualLinks()
	 * @see fr.ensma.realtimescheduling.VirtualLink#getNodes
	 * @model opposite="nodes" required="true"
	 * @generated
	 */
	EList<VirtualLink> getVirtualLinks();

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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNode_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Transmission Delay</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Delay</em>' attribute.
	 * @see #setTransmissionDelay(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNode_TransmissionDelay()
	 * @model default="0.0" required="true" derived="true"
	 * @generated
	 */
	double getTransmissionDelay();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Node#getTransmissionDelay <em>Transmission Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Delay</em>' attribute.
	 * @see #getTransmissionDelay()
	 * @generated
	 */
	void setTransmissionDelay(double value);

	/**
	 * Returns the value of the '<em><b>Real Links</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Links</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNode_RealLinks()
	 * @model
	 * @generated
	 */
	EList<Node> getRealLinks();

} // Node
