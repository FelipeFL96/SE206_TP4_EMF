/**
 */
package fr.tpt.mem4csd.dag.model.dag.impl;

import fr.tpt.mem4csd.dag.model.dag.Channel;
import fr.tpt.mem4csd.dag.model.dag.DagPackage;
import fr.tpt.mem4csd.dag.model.dag.Port;
import fr.tpt.mem4csd.dag.model.dag.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getDestPort <em>Dest Port</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getSourceTask <em>Source Task</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getDestTask <em>Dest Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends IdentifiedElementImpl implements Channel {
	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Port sourcePort;

	/**
	 * The cached value of the '{@link #getDestPort() <em>Dest Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestPort()
	 * @generated
	 * @ordered
	 */
	protected Port destPort;

	/**
	 * The cached value of the '{@link #getSourceTask() <em>Source Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTask()
	 * @generated
	 * @ordered
	 */
	protected Task sourceTask;

	/**
	 * The cached value of the '{@link #getDestTask() <em>Dest Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestTask()
	 * @generated
	 * @ordered
	 */
	protected Task destTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DagPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (Port)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DagPackage.CHANNEL__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePort(Port newSourcePort) {
		Port oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.CHANNEL__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getDestPort() {
		if (destPort != null && destPort.eIsProxy()) {
			InternalEObject oldDestPort = (InternalEObject)destPort;
			destPort = (Port)eResolveProxy(oldDestPort);
			if (destPort != oldDestPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DagPackage.CHANNEL__DEST_PORT, oldDestPort, destPort));
			}
		}
		return destPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetDestPort() {
		return destPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestPort(Port newDestPort) {
		Port oldDestPort = destPort;
		destPort = newDestPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.CHANNEL__DEST_PORT, oldDestPort, destPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getSourceTask() {
		if (sourceTask != null && sourceTask.eIsProxy()) {
			InternalEObject oldSourceTask = (InternalEObject)sourceTask;
			sourceTask = (Task)eResolveProxy(oldSourceTask);
			if (sourceTask != oldSourceTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DagPackage.CHANNEL__SOURCE_TASK, oldSourceTask, sourceTask));
			}
		}
		return sourceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetSourceTask() {
		return sourceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceTask(Task newSourceTask) {
		Task oldSourceTask = sourceTask;
		sourceTask = newSourceTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.CHANNEL__SOURCE_TASK, oldSourceTask, sourceTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getDestTask() {
		if (destTask != null && destTask.eIsProxy()) {
			InternalEObject oldDestTask = (InternalEObject)destTask;
			destTask = (Task)eResolveProxy(oldDestTask);
			if (destTask != oldDestTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DagPackage.CHANNEL__DEST_TASK, oldDestTask, destTask));
			}
		}
		return destTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetDestTask() {
		return destTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestTask(Task newDestTask) {
		Task oldDestTask = destTask;
		destTask = newDestTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.CHANNEL__DEST_TASK, oldDestTask, destTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DagPackage.CHANNEL__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case DagPackage.CHANNEL__DEST_PORT:
				if (resolve) return getDestPort();
				return basicGetDestPort();
			case DagPackage.CHANNEL__SOURCE_TASK:
				if (resolve) return getSourceTask();
				return basicGetSourceTask();
			case DagPackage.CHANNEL__DEST_TASK:
				if (resolve) return getDestTask();
				return basicGetDestTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DagPackage.CHANNEL__SOURCE_PORT:
				setSourcePort((Port)newValue);
				return;
			case DagPackage.CHANNEL__DEST_PORT:
				setDestPort((Port)newValue);
				return;
			case DagPackage.CHANNEL__SOURCE_TASK:
				setSourceTask((Task)newValue);
				return;
			case DagPackage.CHANNEL__DEST_TASK:
				setDestTask((Task)newValue);
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
			case DagPackage.CHANNEL__SOURCE_PORT:
				setSourcePort((Port)null);
				return;
			case DagPackage.CHANNEL__DEST_PORT:
				setDestPort((Port)null);
				return;
			case DagPackage.CHANNEL__SOURCE_TASK:
				setSourceTask((Task)null);
				return;
			case DagPackage.CHANNEL__DEST_TASK:
				setDestTask((Task)null);
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
			case DagPackage.CHANNEL__SOURCE_PORT:
				return sourcePort != null;
			case DagPackage.CHANNEL__DEST_PORT:
				return destPort != null;
			case DagPackage.CHANNEL__SOURCE_TASK:
				return sourceTask != null;
			case DagPackage.CHANNEL__DEST_TASK:
				return destTask != null;
		}
		return super.eIsSet(featureID);
	}

} //ChannelImpl
