/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.VisualizationGoal#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.VisualizationGoal#getVatask <em>Vatask</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualizationGoal()
 * @model
 * @generated
 */
public interface VisualizationGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.VAGoalTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VAGoalTypeList
	 * @see #setGoalType(VAGoalTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualizationGoal_GoalType()
	 * @model
	 * @generated
	 */
	VAGoalTypeList getGoalType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.VisualizationGoal#getGoalType <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VAGoalTypeList
	 * @see #getGoalType()
	 * @generated
	 */
	void setGoalType(VAGoalTypeList value);

	/**
	 * Returns the value of the '<em><b>Vatask</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.VATask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vatask</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualizationGoal_Vatask()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VATask> getVatask();

} // VisualizationGoal
