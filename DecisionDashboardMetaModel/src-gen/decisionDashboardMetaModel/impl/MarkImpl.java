/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.Data;
import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.Encoding;
import decisionDashboardMetaModel.Mark;
import decisionDashboardMetaModel.VATask;
import decisionDashboardMetaModel.VisualFormatList;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.MarkImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.MarkImpl#getData <em>Data</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.MarkImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.MarkImpl#getVisualType <em>Visual Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.MarkImpl#getVatask <em>Vatask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkImpl extends MinimalEObjectImpl.Container implements Mark {
	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EList<Encoding> encoding;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualType() <em>Visual Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualType()
	 * @generated
	 * @ordered
	 */
	protected static final VisualFormatList VISUAL_TYPE_EDEFAULT = VisualFormatList.BAR;

	/**
	 * The cached value of the '{@link #getVisualType() <em>Visual Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualType()
	 * @generated
	 * @ordered
	 */
	protected VisualFormatList visualType = VISUAL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVatask() <em>Vatask</em>}' reference list.
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
	protected MarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.MARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualFormatList getVisualType() {
		return visualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualType(VisualFormatList newVisualType) {
		VisualFormatList oldVisualType = visualType;
		visualType = newVisualType == null ? VISUAL_TYPE_EDEFAULT : newVisualType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.MARK__VISUAL_TYPE,
					oldVisualType, visualType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VATask> getVatask() {
		if (vatask == null) {
			vatask = new EObjectWithInverseResolvingEList.ManyInverse<VATask>(VATask.class, this,
					DecisionDashboardMetaModelPackage.MARK__VATASK, DecisionDashboardMetaModelPackage.VA_TASK__MARK);
		}
		return vatask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encoding> getEncoding() {
		if (encoding == null) {
			encoding = new EObjectContainmentEList<Encoding>(Encoding.class, this,
					DecisionDashboardMetaModelPackage.MARK__ENCODING);
		}
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectWithInverseResolvingEList.ManyInverse<Data>(Data.class, this,
					DecisionDashboardMetaModelPackage.MARK__DATA, DecisionDashboardMetaModelPackage.DATA__MARK);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.MARK__TITLE,
					oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.MARK__DATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData()).basicAdd(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.MARK__VATASK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVatask()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.MARK__ENCODING:
			return ((InternalEList<?>) getEncoding()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.MARK__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.MARK__VATASK:
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
		case DecisionDashboardMetaModelPackage.MARK__ENCODING:
			return getEncoding();
		case DecisionDashboardMetaModelPackage.MARK__DATA:
			return getData();
		case DecisionDashboardMetaModelPackage.MARK__TITLE:
			return getTitle();
		case DecisionDashboardMetaModelPackage.MARK__VISUAL_TYPE:
			return getVisualType();
		case DecisionDashboardMetaModelPackage.MARK__VATASK:
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
		case DecisionDashboardMetaModelPackage.MARK__ENCODING:
			getEncoding().clear();
			getEncoding().addAll((Collection<? extends Encoding>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.MARK__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.MARK__TITLE:
			setTitle((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.MARK__VISUAL_TYPE:
			setVisualType((VisualFormatList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.MARK__VATASK:
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
		case DecisionDashboardMetaModelPackage.MARK__ENCODING:
			getEncoding().clear();
			return;
		case DecisionDashboardMetaModelPackage.MARK__DATA:
			getData().clear();
			return;
		case DecisionDashboardMetaModelPackage.MARK__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.MARK__VISUAL_TYPE:
			setVisualType(VISUAL_TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.MARK__VATASK:
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
		case DecisionDashboardMetaModelPackage.MARK__ENCODING:
			return encoding != null && !encoding.isEmpty();
		case DecisionDashboardMetaModelPackage.MARK__DATA:
			return data != null && !data.isEmpty();
		case DecisionDashboardMetaModelPackage.MARK__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case DecisionDashboardMetaModelPackage.MARK__VISUAL_TYPE:
			return visualType != VISUAL_TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.MARK__VATASK:
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
		result.append(" (title: ");
		result.append(title);
		result.append(", visualType: ");
		result.append(visualType);
		result.append(')');
		return result.toString();
	}

} //MarkImpl
