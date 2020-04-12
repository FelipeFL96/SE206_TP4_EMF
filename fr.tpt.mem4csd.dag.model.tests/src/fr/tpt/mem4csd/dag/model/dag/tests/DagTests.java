/**
 */
package fr.tpt.mem4csd.dag.model.dag.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dag</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DagTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DagTests("dag Tests");
		suite.addTestSuite(DagSpecificationTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(PortTest.class);
		suite.addTestSuite(ChannelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DagTests(String name) {
		super(name);
	}

} //DagTests
