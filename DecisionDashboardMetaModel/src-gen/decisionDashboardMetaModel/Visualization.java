/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.Visualization#getName <em>Name</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Visualization#getMark <em>Mark</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Visualization#getData <em>Data</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Visualization#getVatask <em>Vatask</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Visualization#getDecisionarea <em>Decisionarea</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Visualization#getTitle <em>Title</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Visualization#getMlmodel <em>Mlmodel</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization()
 * @model
 * @generated
 */
public interface Visualization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Visualization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Mark}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization_Mark()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Mark> getMark();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Vatask</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.VATask}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.VATask#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vatask</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization_Vatask()
	 * @see decisionDashboardMetaModel.VATask#getVisualization
	 * @model opposite="visualization" required="true"
	 * @generated
	 */
	EList<VATask> getVatask();

	/**
	 * Returns the value of the '<em><b>Decisionarea</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.DecisionArea}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.DecisionArea#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisionarea</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization_Decisionarea()
	 * @see decisionDashboardMetaModel.DecisionArea#getVisualization
	 * @model opposite="visualization" required="true"
	 * @generated
	 */
	EList<DecisionArea> getDecisionarea();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Visualization#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Mlmodel</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.MLModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlmodel</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVisualization_Mlmodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<MLModel> getMlmodel();

} // Visualization
