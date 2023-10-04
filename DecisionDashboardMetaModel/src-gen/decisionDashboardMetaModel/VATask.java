/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VA Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.VATask#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.VATask#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.VATask#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVATask()
 * @model
 * @generated
 */
public interface VATask extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.VATaskTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VATaskTypeList
	 * @see #setTaskType(VATaskTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVATask_TaskType()
	 * @model
	 * @generated
	 */
	VATaskTypeList getTaskType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.VATask#getTaskType <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VATaskTypeList
	 * @see #getTaskType()
	 * @generated
	 */
	void setTaskType(VATaskTypeList value);

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Visualization}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.Visualization#getVatask <em>Vatask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVATask_Visualization()
	 * @see decisionDashboardMetaModel.Visualization#getVatask
	 * @model opposite="vatask" required="true"
	 * @generated
	 */
	EList<Visualization> getVisualization();

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' reference list.
	 * The list contents are of type {@link decisionDashboardMetaModel.Mark}.
	 * It is bidirectional and its opposite is '{@link decisionDashboardMetaModel.Mark#getVatask <em>Vatask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' reference list.
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVATask_Mark()
	 * @see decisionDashboardMetaModel.Mark#getVatask
	 * @model opposite="vatask" required="true"
	 * @generated
	 */
	EList<Mark> getMark();

} // VATask
