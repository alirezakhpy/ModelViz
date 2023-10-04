/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.Mark#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Mark#getData <em>Data</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Mark#getTitle <em>Title</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Mark#getVisualType <em>Visual Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.Mark#getVatask <em>Vatask</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMark()
 * @model
 * @generated
 */
public interface Mark extends EObject {
	/**
	 * Returns the value of the '<em><b>Visual Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.VisualFormatList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VisualFormatList
	 * @see #setVisualType(VisualFormatList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMark_VisualType()
	 * @model
	 * @generated
	 */
	VisualFormatList getVisualType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Mark#getVisualType <em>Visual Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VisualFormatList
	 * @see #getVisualType()
	 * @generated
	 */
	void setVisualType(VisualFormatList value);

	/**
	 * Returns the value of the '<em><b>Vatask</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.VATask}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.VATask#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vatask</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMark_Vatask()
	 * @see decisionDashboardMetaModel.VATask#getMark
	 * @model opposite="mark" required="true"
	 * @generated
	 */
	EList<VATask> getVatask();

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' containment reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Encoding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' containment reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMark_Encoding()
	 * @model containment="true" lower="2" upper="4"
	 * @generated
	 */
	EList<Encoding> getEncoding();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Data}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.Data#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMark_Data()
	 * @see decisionDashboardMetaModel.Data#getMark
	 * @model opposite="mark" required="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getMark_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Mark#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Mark
