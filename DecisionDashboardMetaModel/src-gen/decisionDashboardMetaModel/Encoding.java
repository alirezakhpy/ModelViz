/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.Encoding#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getEncoding()
 * @model
 * @generated
 */
public interface Encoding extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getEncoding_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.Encoding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Encoding
