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
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getRoutes <em>Routes</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getSource <em>Source</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.VirtualLink#getMaxFrameSize <em>Max Frame Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DestinationsCannotIncludeSource PositiveMinInterFrameTime PositiveMaxFrameSize PathExists RoutesConnectSourceToDestinations NoCycles'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DestinationsCannotIncludeSource='\n\t\t\t\tdestinations->forAll(dest : Module | dest <> source)' PositiveMinInterFrameTime='minInterFrameTime > 0' PositiveMaxFrameSize='maxFrameSize > 0'"
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
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Route> getRoutes();

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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink_Source()
	 * @model required="true"
	 * @generated
	 */
	Module getSource();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.VirtualLink#getSource <em>Source</em>}' reference.
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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink_Destinations()
	 * @model required="true"
	 * @generated
	 */
	EList<Module> getDestinations();

	/**
	 * Returns the value of the '<em><b>Max Frame Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Frame Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Frame Size</em>' attribute.
	 * @see #setMaxFrameSize(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getVirtualLink_MaxFrameSize()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMaxFrameSize();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.VirtualLink#getMaxFrameSize <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Frame Size</em>' attribute.
	 * @see #getMaxFrameSize()
	 * @generated
	 */
	void setMaxFrameSize(int value);

} // VirtualLink
