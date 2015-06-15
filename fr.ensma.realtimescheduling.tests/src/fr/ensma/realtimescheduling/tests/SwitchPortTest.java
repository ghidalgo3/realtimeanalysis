/**
 */
package fr.ensma.realtimescheduling.tests;

import fr.ensma.realtimescheduling.RealtimeschedulingFactory;
import fr.ensma.realtimescheduling.SwitchPort;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Switch Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchPortTest extends PortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwitchPortTest.class);
	}

	/**
	 * Constructs a new Switch Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Switch Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SwitchPort getFixture() {
		return (SwitchPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimeschedulingFactory.eINSTANCE.createSwitchPort());
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

} //SwitchPortTest
