/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.VAGoalTypeList;
import decisionDashboardMetaModel.VATask;
import decisionDashboardMetaModel.VisualizationGoal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationGoalImpl#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationGoalImpl#getVatask <em>Vatask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationGoalImpl extends MinimalEObjectImpl.Container implements VisualizationGoal {
	/**
	 * The default value of the '{@link #getGoalType() <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalType()
	 * @generated
	 * @ordered
	 */
	protected static final VAGoalTypeList GOAL_TYPE_EDEFAULT = VAGoalTypeList.IDENTIFYING_UNDERLYING_PATTERN_BY_PARTITIONING;

	/**
	 * The cached value of the '{@link #getGoalType() <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalType()
	 * @generated
	 * @ordered
	 */
	protected VAGoalTypeList goalType = GOAL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVatask() <em>Vatask</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatask()
	 * @generated
	 * @ordered
	 */
	protected EList<VATask> vatask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.VISUALIZATION_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAGoalTypeList getGoalType() {
		return goalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalType(VAGoalTypeList newGoalType) {
		VAGoalTypeList oldGoalType = goalType;
		goalType = newGoalType == null ? GOAL_TYPE_EDEFAULT : newGoalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__GOAL_TYPE, oldGoalType, goalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VATask> getVatask() {
		if (vatask == null) {
			vatask = new EObjectContainmentEList<VATask>(VATask.class, this,
					DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__VATASK);
		}
		return vatask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__VATASK:
			return ((InternalEList<?>) getVatask()).basicRemove(otherEnd, msgs);
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__GOAL_TYPE:
			return getGoalType();
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__VATASK:
			return getVatask();
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__GOAL_TYPE:
			setGoalType((VAGoalTypeList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__VATASK:
			getVatask().clear();
			getVatask().addAll((Collection<? extends VATask>) newValue);
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__GOAL_TYPE:
			setGoalType(GOAL_TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__VATASK:
			getVatask().clear();
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__GOAL_TYPE:
			return goalType != GOAL_TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL__VATASK:
			return vatask != null && !vatask.isEmpty();
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
		result.append(" (goalType: ");
		result.append(goalType);
		result.append(')');
		return result.toString();
	}

} //VisualizationGoalImpl
