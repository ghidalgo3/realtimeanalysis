/**
 */
package fr.ensma.realtimescheduling.tests;

import fr.ensma.realtimescheduling.RealtimeschedulingFactory;
import fr.ensma.realtimescheduling.VirtualLink;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualLinkTest extends TestCase {

	/**
	 * The fixture for this Virtual Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualLink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualLinkTest.class);
	}

	/**
	 * Constructs a new Virtual Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualLinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Virtual Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VirtualLink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Virtual Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualLink getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimeschedulingFactory.eINSTANCE.createVirtualLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VirtualLinkTest
