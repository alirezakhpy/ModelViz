/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.Data#getSource <em>Source</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Data#getType <em>Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Data#getValues <em>Values</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Data#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getData_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Data#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.DataTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see decisionDashboardMetaModel.DataTypeList
	 * @see #setType(DataTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getData_Type()
	 * @model
	 * @generated
	 */
	DataTypeList getType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Data#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see decisionDashboardMetaModel.DataTypeList
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypeList value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Values}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getData_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Values> getValues();

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Mark}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.Mark#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getData_Mark()
	 * @see decisionDashboardMetaModel.Mark#getData
	 * @model opposite="data" required="true"
	 * @generated
	 */
	EList<Mark> getMark();

} // Data
