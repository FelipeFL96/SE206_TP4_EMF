/**
 */
package fr.tpt.mem4csd.dag.model.dag.impl;

import fr.tpt.mem4csd.dag.model.dag.Channel;
import fr.tpt.mem4csd.dag.model.dag.DagPackage;
import fr.tpt.mem4csd.dag.model.dag.DagSpecification;
import fr.tpt.mem4csd.dag.model.dag.NamedElement;
import fr.tpt.mem4csd.dag.model.dag.Task;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Queue;
import java.util.LinkedList;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.DagSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.DagSpecificationImpl#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.DagSpecificationImpl#getSortedTasks <em>Sorted Tasks</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.DagSpecificationImpl#getOwnedChannels <em>Owned Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DagSpecificationImpl extends IdentifiedElementImpl implements DagSpecification {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedTasks() <em>Owned Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> ownedTasks;

	/**
	 * The cached value of the '{@link #getOwnedChannels() <em>Owned Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> ownedChannels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DagSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DagPackage.Literals.DAG_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.DAG_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getOwnedTasks() {
		if (ownedTasks == null) {
			ownedTasks = new EObjectContainmentEList<Task>(Task.class, this, DagPackage.DAG_SPECIFICATION__OWNED_TASKS);
		}
		return ownedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Task> getSortedTasks() {
		Queue<Task> taskQueue = new LinkedList<Task>();
		EList<Task> sortedTasks = new BasicEList<Task>();

		// Getting root tasks into the queue
		for (Task task : ownedTasks)
			taskQueue.add(task);
		for (Channel channel : ownedChannels)
			taskQueue.remove(channel.getDestTask());

		// Breadth First Search to line up levels of tasks by their order of communication
		while (!taskQueue.isEmpty()) {
			Task currentTask = taskQueue.poll();
			sortedTasks.add(currentTask);
			for (Channel channel : ownedChannels) {
				if ((channel.getSourceTask() == currentTask) && (!sortedTasks.contains(channel.getDestTask()))) {
					taskQueue.add(channel.getDestTask());
				}
			}
		}

		return sortedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Channel> getOwnedChannels() {
		if (ownedChannels == null) {
			ownedChannels = new EObjectContainmentEList<Channel>(Channel.class, this, DagPackage.DAG_SPECIFICATION__OWNED_CHANNELS);
		}
		return ownedChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DagPackage.DAG_SPECIFICATION__OWNED_TASKS:
				return ((InternalEList<?>)getOwnedTasks()).basicRemove(otherEnd, msgs);
			case DagPackage.DAG_SPECIFICATION__OWNED_CHANNELS:
				return ((InternalEList<?>)getOwnedChannels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DagPackage.DAG_SPECIFICATION__NAME:
				return getName();
			case DagPackage.DAG_SPECIFICATION__OWNED_TASKS:
				return getOwnedTasks();
			case DagPackage.DAG_SPECIFICATION__SORTED_TASKS:
				return getSortedTasks();
			case DagPackage.DAG_SPECIFICATION__OWNED_CHANNELS:
				return getOwnedChannels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DagPackage.DAG_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case DagPackage.DAG_SPECIFICATION__OWNED_TASKS:
				getOwnedTasks().clear();
				getOwnedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case DagPackage.DAG_SPECIFICATION__OWNED_CHANNELS:
				getOwnedChannels().clear();
				getOwnedChannels().addAll((Collection<? extends Channel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DagPackage.DAG_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DagPackage.DAG_SPECIFICATION__OWNED_TASKS:
				getOwnedTasks().clear();
				return;
			case DagPackage.DAG_SPECIFICATION__OWNED_CHANNELS:
				getOwnedChannels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DagPackage.DAG_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DagPackage.DAG_SPECIFICATION__OWNED_TASKS:
				return ownedTasks != null && !ownedTasks.isEmpty();
			case DagPackage.DAG_SPECIFICATION__SORTED_TASKS:
				return !getSortedTasks().isEmpty();
			case DagPackage.DAG_SPECIFICATION__OWNED_CHANNELS:
				return ownedChannels != null && !ownedChannels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DagPackage.DAG_SPECIFICATION__NAME: return DagPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case DagPackage.NAMED_ELEMENT__NAME: return DagPackage.DAG_SPECIFICATION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getQualifiedName() {
		return getName();
	}
} //DagSpecificationImpl
