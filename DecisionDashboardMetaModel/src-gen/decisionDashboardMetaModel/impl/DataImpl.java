/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.Data;
import decisionDashboardMetaModel.DataTypeList;
import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.Mark;
import decisionDashboardMetaModel.Values;

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
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.DataImpl#getSource <em>Source</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.DataImpl#getType <em>Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.DataImpl#getValues <em>Values</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.DataImpl#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypeList TYPE_EDEFAULT = DataTypeList.POINT_OF_SALES;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeList type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Values> values;

	/**
	 * The cached value of the '{@link #getMark() <em>Mark</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected EList<Mark> mark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.DATA__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeList getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataTypeList newType) {
		DataTypeList oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.DATA__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Values> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<Values>(Values.class, this,
					DecisionDashboardMetaModelPackage.DATA__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mark> getMark() {
		if (mark == null) {
			mark = new EObjectWithInverseResolvingEList.ManyInverse<Mark>(Mark.class, this,
					DecisionDashboardMetaModelPackage.DATA__MARK, DecisionDashboardMetaModelPackage.MARK__DATA);
		}
		return mark;
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
		case DecisionDashboardMetaModelPackage.DATA__MARK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMark()).basicAdd(otherEnd, msgs);
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
		case DecisionDashboardMetaModelPackage.DATA__VALUES:
			return ((InternalEList<?>) getValues()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.DATA__MARK:
			return ((InternalEList<?>) getMark()).basicRemove(otherEnd, msgs);
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
		case DecisionDashboardMetaModelPackage.DATA__SOURCE:
			return getSource();
		case DecisionDashboardMetaModelPackage.DATA__TYPE:
			return getType();
		case DecisionDashboardMetaModelPackage.DATA__VALUES:
			return getValues();
		case DecisionDashboardMetaModelPackage.DATA__MARK:
			return getMark();
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
		case DecisionDashboardMetaModelPackage.DATA__SOURCE:
			setSource((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.DATA__TYPE:
			setType((DataTypeList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.DATA__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends Values>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.DATA__MARK:
			getMark().clear();
			getMark().addAll((Collection<? extends Mark>) newValue);
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
		case DecisionDashboardMetaModelPackage.DATA__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.DATA__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.DATA__VALUES:
			getValues().clear();
			return;
		case DecisionDashboardMetaModelPackage.DATA__MARK:
			getMark().clear();
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
		case DecisionDashboardMetaModelPackage.DATA__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
		case DecisionDashboardMetaModelPackage.DATA__TYPE:
			return type != TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.DATA__VALUES:
			return values != null && !values.isEmpty();
		case DecisionDashboardMetaModelPackage.DATA__MARK:
			return mark != null && !mark.isEmpty();
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
		result.append(" (Source: ");
		result.append(source);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DataImpl
