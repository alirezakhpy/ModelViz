/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.MLModel#getModelType <em>Model Type</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMLModel()
 * @model
 * @generated
 */
public interface MLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.ModelTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see decisionDashboardMetaModel.ModelTypeList
	 * @see #setModelType(ModelTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMLModel_ModelType()
	 * @model
	 * @generated
	 */
	ModelTypeList getModelType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.MLModel#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see decisionDashboardMetaModel.ModelTypeList
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(ModelTypeList value);

} // MLModel
