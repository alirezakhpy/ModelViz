/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.Mark;
import decisionDashboardMetaModel.VATask;
import decisionDashboardMetaModel.VATaskTypeList;
import decisionDashboardMetaModel.Visualization;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VA Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.VATaskImpl#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VATaskImpl#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VATaskImpl#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VATaskImpl extends MinimalEObjectImpl.Container implements VATask {
	/**
	 * The default value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected static final VATaskTypeList TASK_TYPE_EDEFAULT = VATaskTypeList.DISTRIBUTION_OVER_TEMPORAL_DIMENSION_BY_EMPHASIZING_ON_INDIVIDUAL_VALUES_FOR_TREND_DETECTION;

	/**
	 * The cached value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected VATaskTypeList taskType = TASK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected EList<Visualization> visualization;

	/**
	 * The cached value of the '{@link #getMark() <em>Mark</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected EList<Mark> mark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VATaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.VA_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VATaskTypeList getTaskType() {
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskType(VATaskTypeList newTaskType) {
		VATaskTypeList oldTaskType = taskType;
		taskType = newTaskType == null ? TASK_TYPE_EDEFAULT : newTaskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VA_TASK__TASK_TYPE,
					oldTaskType, taskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visualization> getVisualization() {
		if (visualization == null) {
			visualization = new EObjectWithInverseResolvingEList.ManyInverse<Visualization>(Visualization.class, this,
					DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION,
					DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK);
		}
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mark> getMark() {
		if (mark == null) {
			mark = new EObjectWithInverseResolvingEList.ManyInverse<Mark>(Mark.class, this,
					DecisionDashboardMetaModelPackage.VA_TASK__MARK, DecisionDashboardMetaModelPackage.MARK__VATASK);
		}
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVisualization()).basicAdd(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.VA_TASK__MARK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMark()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION:
			return ((InternalEList<?>) getVisualization()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.VA_TASK__MARK:
			return ((InternalEList<?>) getMark()).basicRemove(otherEnd, msgs);
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
		case DecisionDashboardMetaModelPackage.VA_TASK__TASK_TYPE:
			return getTaskType();
		case DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION:
			return getVisualization();
		case DecisionDashboardMetaModelPackage.VA_TASK__MARK:
			return getMark();
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
		case DecisionDashboardMetaModelPackage.VA_TASK__TASK_TYPE:
			setTaskType((VATaskTypeList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION:
			getVisualization().clear();
			getVisualization().addAll((Collection<? extends Visualization>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VA_TASK__MARK:
			getMark().clear();
			getMark().addAll((Collection<? extends Mark>) newValue);
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
		case DecisionDashboardMetaModelPackage.VA_TASK__TASK_TYPE:
			setTaskType(TASK_TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION:
			getVisualization().clear();
			return;
		case DecisionDashboardMetaModelPackage.VA_TASK__MARK:
			getMark().clear();
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
		case DecisionDashboardMetaModelPackage.VA_TASK__TASK_TYPE:
			return taskType != TASK_TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION:
			return visualization != null && !visualization.isEmpty();
		case DecisionDashboardMetaModelPackage.VA_TASK__MARK:
			return mark != null && !mark.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (taskType: ");
		result.append(taskType);
		result.append(')');
		return result.toString();
	}

} //VATaskImpl
