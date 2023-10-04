/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.Dashboard#getTitle <em>Title</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Dashboard#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Dashboard#getDecisionarea <em>Decisionarea</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Dashboard#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDashboard_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Dashboard#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Visualization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDashboard_Visualization()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Visualization> getVisualization();

	/**
	 * Returns the value of the '<em><b>Decisionarea</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.DecisionArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisionarea</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDashboard_Decisionarea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DecisionArea> getDecisionarea();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDashboard_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Dashboard#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Dashboard
