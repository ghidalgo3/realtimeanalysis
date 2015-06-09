/**
 */
package fr.ensma.realtimescheduling.tests;

import fr.ensma.realtimescheduling.Processor;
import fr.ensma.realtimescheduling.RealtimeschedulingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorTest extends TestCase {

	/**
	 * The fixture for this Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Processor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessorTest.class);
	}

	/**
	 * Constructs a new Processor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Processor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Processor getFixture() {
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
		setFixture(RealtimeschedulingFactory.eINSTANCE.createProcessor());
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

} //ProcessorTest
