/**
 */
package fr.tpt.mem4csd.dag.model.dag.tests;

import fr.tpt.mem4csd.dag.model.dag.Channel;
import fr.tpt.mem4csd.dag.model.dag.DagFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.Channel#getSourceTask() <em>Source Task</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.Channel#getDestTask() <em>Dest Task</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ChannelTest extends IdentifiedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChannelTest.class);
	}

	/**
	 * Constructs a new Channel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Channel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Channel getFixture() {
		return (Channel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DagFactory.eINSTANCE.createChannel());
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

	/**
	 * Tests the '{@link fr.tpt.mem4csd.dag.model.dag.Channel#getSourceTask() <em>Source Task</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.dag.model.dag.Channel#getSourceTask()
	 * @generated
	 */
	public void testGetSourceTask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link fr.tpt.mem4csd.dag.model.dag.Channel#getDestTask() <em>Dest Task</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.dag.model.dag.Channel#getDestTask()
	 * @generated
	 */
	public void testGetDestTask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ChannelTest
