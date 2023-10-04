/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.DecisionArea#getDtype <em>Dtype</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.DecisionArea#getVisualizationgoal <em>Visualizationgoal</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.DecisionArea#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDecisionArea()
 * @model
 * @generated
 */
public interface DecisionArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.DecisionAreaList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute.
	 * @see decisionDashboardMetaModel.DecisionAreaList
	 * @see #setDtype(DecisionAreaList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDecisionArea_Dtype()
	 * @model
	 * @generated
	 */
	DecisionAreaList getDtype();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.DecisionArea#getDtype <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' attribute.
	 * @see decisionDashboardMetaModel.DecisionAreaList
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(DecisionAreaList value);

	/**
	 * Returns the value of the '<em><b>Visualizationgoal</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.VisualizationGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualizationgoal</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDecisionArea_Visualizationgoal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VisualizationGoal> getVisualizationgoal();

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Visualization}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.Visualization#getDecisionarea <em>Decisionarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDecisionArea_Visualization()
	 * @see decisionDashboardMetaModel.Visualization#getDecisionarea
	 * @model opposite="decisionarea" required="true"
	 * @generated
	 */
	EList<Visualization> getVisualization();

} // DecisionArea
