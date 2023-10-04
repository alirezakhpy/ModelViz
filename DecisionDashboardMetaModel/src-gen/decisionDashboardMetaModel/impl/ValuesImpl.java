/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.Values;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getKommuneNo <em>Kommune No</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getCountyNo <em>County No</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getWeekDay <em>Week Day</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getProductUnitPrice <em>Product Unit Price</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getDay <em>Day</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getYear <em>Year</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getDayOfYear <em>Day Of Year</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getWeekOfYear <em>Week Of Year</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getQuarterOfYear <em>Quarter Of Year</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getWeekEnd <em>Week End</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getPostNo <em>Post No</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getAvgturnover <em>Avgturnover</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getShopProfileName <em>Shop Profile Name</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getExpanding_mean <em>Expanding mean</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.ValuesImpl#getLag_1 <em>Lag 1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuesImpl extends MinimalEObjectImpl.Container implements Values {
	/**
	 * The default value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected String storeName = STORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKommuneNo() <em>Kommune No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommuneNo()
	 * @generated
	 * @ordered
	 */
	protected static final String KOMMUNE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKommuneNo() <em>Kommune No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommuneNo()
	 * @generated
	 * @ordered
	 */
	protected String kommuneNo = KOMMUNE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountyNo() <em>County No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyNo()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTY_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountyNo() <em>County No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyNo()
	 * @generated
	 * @ordered
	 */
	protected String countyNo = COUNTY_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeekDay() <em>Week Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekDay()
	 * @generated
	 * @ordered
	 */
	protected static final String WEEK_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekDay() <em>Week Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekDay()
	 * @generated
	 * @ordered
	 */
	protected String weekDay = WEEK_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected String productID = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductUnitPrice() <em>Product Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductUnitPrice() <em>Product Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected String productUnitPrice = PRODUCT_UNIT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected String day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected String month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayOfYear() <em>Day Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfYear()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_OF_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayOfYear() <em>Day Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfYear()
	 * @generated
	 * @ordered
	 */
	protected String dayOfYear = DAY_OF_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeekOfYear() <em>Week Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekOfYear()
	 * @generated
	 * @ordered
	 */
	protected static final String WEEK_OF_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekOfYear() <em>Week Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekOfYear()
	 * @generated
	 * @ordered
	 */
	protected String weekOfYear = WEEK_OF_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuarterOfYear() <em>Quarter Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuarterOfYear()
	 * @generated
	 * @ordered
	 */
	protected static final String QUARTER_OF_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuarterOfYear() <em>Quarter Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuarterOfYear()
	 * @generated
	 * @ordered
	 */
	protected String quarterOfYear = QUARTER_OF_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeekEnd() <em>Week End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String WEEK_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekEnd() <em>Week End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekEnd()
	 * @generated
	 * @ordered
	 */
	protected String weekEnd = WEEK_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostNo() <em>Post No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostNo()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostNo() <em>Post No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostNo()
	 * @generated
	 * @ordered
	 */
	protected String postNo = POST_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgturnover() <em>Avgturnover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgturnover()
	 * @generated
	 * @ordered
	 */
	protected static final String AVGTURNOVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvgturnover() <em>Avgturnover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgturnover()
	 * @generated
	 * @ordered
	 */
	protected String avgturnover = AVGTURNOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShopProfileName() <em>Shop Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShopProfileName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOP_PROFILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShopProfileName() <em>Shop Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShopProfileName()
	 * @generated
	 * @ordered
	 */
	protected String shopProfileName = SHOP_PROFILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected String profile = PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpanding_mean() <em>Expanding mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpanding_mean()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPANDING_MEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpanding_mean() <em>Expanding mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpanding_mean()
	 * @generated
	 * @ordered
	 */
	protected String expanding_mean = EXPANDING_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLag_1() <em>Lag 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLag_1()
	 * @generated
	 * @ordered
	 */
	protected static final String LAG_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLag_1() <em>Lag 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLag_1()
	 * @generated
	 * @ordered
	 */
	protected String lag_1 = LAG_1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreName(String newStoreName) {
		String oldStoreName = storeName;
		storeName = newStoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__STORE_NAME,
					oldStoreName, storeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKommuneNo() {
		return kommuneNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKommuneNo(String newKommuneNo) {
		String oldKommuneNo = kommuneNo;
		kommuneNo = newKommuneNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__KOMMUNE_NO,
					oldKommuneNo, kommuneNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountyNo() {
		return countyNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountyNo(String newCountyNo) {
		String oldCountyNo = countyNo;
		countyNo = newCountyNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__COUNTY_NO,
					oldCountyNo, countyNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeekDay() {
		return weekDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekDay(String newWeekDay) {
		String oldWeekDay = weekDay;
		weekDay = newWeekDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__WEEK_DAY,
					oldWeekDay, weekDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductID(String newProductID) {
		String oldProductID = productID;
		productID = newProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__PRODUCT_ID,
					oldProductID, productID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductUnitPrice() {
		return productUnitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductUnitPrice(String newProductUnitPrice) {
		String oldProductUnitPrice = productUnitPrice;
		productUnitPrice = newProductUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.VALUES__PRODUCT_UNIT_PRICE, oldProductUnitPrice,
					productUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(String newDay) {
		String oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__DAY, oldDay,
					day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(String newMonth) {
		String oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__MONTH,
					oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__YEAR,
					oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDayOfYear() {
		return dayOfYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfYear(String newDayOfYear) {
		String oldDayOfYear = dayOfYear;
		dayOfYear = newDayOfYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__DAY_OF_YEAR,
					oldDayOfYear, dayOfYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeekOfYear() {
		return weekOfYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekOfYear(String newWeekOfYear) {
		String oldWeekOfYear = weekOfYear;
		weekOfYear = newWeekOfYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.VALUES__WEEK_OF_YEAR, oldWeekOfYear, weekOfYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuarterOfYear() {
		return quarterOfYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuarterOfYear(String newQuarterOfYear) {
		String oldQuarterOfYear = quarterOfYear;
		quarterOfYear = newQuarterOfYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.VALUES__QUARTER_OF_YEAR, oldQuarterOfYear, quarterOfYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeekEnd() {
		return weekEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekEnd(String newWeekEnd) {
		String oldWeekEnd = weekEnd;
		weekEnd = newWeekEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__WEEK_END,
					oldWeekEnd, weekEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostNo() {
		return postNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostNo(String newPostNo) {
		String oldPostNo = postNo;
		postNo = newPostNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__POST_NO,
					oldPostNo, postNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvgturnover() {
		return avgturnover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgturnover(String newAvgturnover) {
		String oldAvgturnover = avgturnover;
		avgturnover = newAvgturnover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__AVGTURNOVER,
					oldAvgturnover, avgturnover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShopProfileName() {
		return shopProfileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShopProfileName(String newShopProfileName) {
		String oldShopProfileName = shopProfileName;
		shopProfileName = newShopProfileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.VALUES__SHOP_PROFILE_NAME, oldShopProfileName, shopProfileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(String newProfile) {
		String oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__PROFILE,
					oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpanding_mean() {
		return expanding_mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpanding_mean(String newExpanding_mean) {
		String oldExpanding_mean = expanding_mean;
		expanding_mean = newExpanding_mean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.VALUES__EXPANDING_MEAN, oldExpanding_mean, expanding_mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLag_1() {
		return lag_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLag_1(String newLag_1) {
		String oldLag_1 = lag_1;
		lag_1 = newLag_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VALUES__LAG_1,
					oldLag_1, lag_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.VALUES__STORE_NAME:
			return getStoreName();
		case DecisionDashboardMetaModelPackage.VALUES__KOMMUNE_NO:
			return getKommuneNo();
		case DecisionDashboardMetaModelPackage.VALUES__COUNTY_NO:
			return getCountyNo();
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_DAY:
			return getWeekDay();
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_ID:
			return getProductID();
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_UNIT_PRICE:
			return getProductUnitPrice();
		case DecisionDashboardMetaModelPackage.VALUES__DAY:
			return getDay();
		case DecisionDashboardMetaModelPackage.VALUES__MONTH:
			return getMonth();
		case DecisionDashboardMetaModelPackage.VALUES__YEAR:
			return getYear();
		case DecisionDashboardMetaModelPackage.VALUES__DAY_OF_YEAR:
			return getDayOfYear();
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_OF_YEAR:
			return getWeekOfYear();
		case DecisionDashboardMetaModelPackage.VALUES__QUARTER_OF_YEAR:
			return getQuarterOfYear();
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_END:
			return getWeekEnd();
		case DecisionDashboardMetaModelPackage.VALUES__POST_NO:
			return getPostNo();
		case DecisionDashboardMetaModelPackage.VALUES__AVGTURNOVER:
			return getAvgturnover();
		case DecisionDashboardMetaModelPackage.VALUES__SHOP_PROFILE_NAME:
			return getShopProfileName();
		case DecisionDashboardMetaModelPackage.VALUES__PROFILE:
			return getProfile();
		case DecisionDashboardMetaModelPackage.VALUES__EXPANDING_MEAN:
			return getExpanding_mean();
		case DecisionDashboardMetaModelPackage.VALUES__LAG_1:
			return getLag_1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.VALUES__STORE_NAME:
			setStoreName((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__KOMMUNE_NO:
			setKommuneNo((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__COUNTY_NO:
			setCountyNo((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_DAY:
			setWeekDay((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_ID:
			setProductID((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_UNIT_PRICE:
			setProductUnitPrice((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__DAY:
			setDay((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__MONTH:
			setMonth((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__YEAR:
			setYear((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__DAY_OF_YEAR:
			setDayOfYear((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_OF_YEAR:
			setWeekOfYear((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__QUARTER_OF_YEAR:
			setQuarterOfYear((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_END:
			setWeekEnd((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__POST_NO:
			setPostNo((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__AVGTURNOVER:
			setAvgturnover((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__SHOP_PROFILE_NAME:
			setShopProfileName((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__PROFILE:
			setProfile((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__EXPANDING_MEAN:
			setExpanding_mean((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__LAG_1:
			setLag_1((String) newValue);
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
		case DecisionDashboardMetaModelPackage.VALUES__STORE_NAME:
			setStoreName(STORE_NAME_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__KOMMUNE_NO:
			setKommuneNo(KOMMUNE_NO_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__COUNTY_NO:
			setCountyNo(COUNTY_NO_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_DAY:
			setWeekDay(WEEK_DAY_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_ID:
			setProductID(PRODUCT_ID_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_UNIT_PRICE:
			setProductUnitPrice(PRODUCT_UNIT_PRICE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__DAY:
			setDay(DAY_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__MONTH:
			setMonth(MONTH_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__YEAR:
			setYear(YEAR_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__DAY_OF_YEAR:
			setDayOfYear(DAY_OF_YEAR_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_OF_YEAR:
			setWeekOfYear(WEEK_OF_YEAR_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__QUARTER_OF_YEAR:
			setQuarterOfYear(QUARTER_OF_YEAR_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_END:
			setWeekEnd(WEEK_END_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__POST_NO:
			setPostNo(POST_NO_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__AVGTURNOVER:
			setAvgturnover(AVGTURNOVER_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__SHOP_PROFILE_NAME:
			setShopProfileName(SHOP_PROFILE_NAME_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__PROFILE:
			setProfile(PROFILE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__EXPANDING_MEAN:
			setExpanding_mean(EXPANDING_MEAN_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VALUES__LAG_1:
			setLag_1(LAG_1_EDEFAULT);
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
		case DecisionDashboardMetaModelPackage.VALUES__STORE_NAME:
			return STORE_NAME_EDEFAULT == null ? storeName != null : !STORE_NAME_EDEFAULT.equals(storeName);
		case DecisionDashboardMetaModelPackage.VALUES__KOMMUNE_NO:
			return KOMMUNE_NO_EDEFAULT == null ? kommuneNo != null : !KOMMUNE_NO_EDEFAULT.equals(kommuneNo);
		case DecisionDashboardMetaModelPackage.VALUES__COUNTY_NO:
			return COUNTY_NO_EDEFAULT == null ? countyNo != null : !COUNTY_NO_EDEFAULT.equals(countyNo);
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_DAY:
			return WEEK_DAY_EDEFAULT == null ? weekDay != null : !WEEK_DAY_EDEFAULT.equals(weekDay);
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_ID:
			return PRODUCT_ID_EDEFAULT == null ? productID != null : !PRODUCT_ID_EDEFAULT.equals(productID);
		case DecisionDashboardMetaModelPackage.VALUES__PRODUCT_UNIT_PRICE:
			return PRODUCT_UNIT_PRICE_EDEFAULT == null ? productUnitPrice != null
					: !PRODUCT_UNIT_PRICE_EDEFAULT.equals(productUnitPrice);
		case DecisionDashboardMetaModelPackage.VALUES__DAY:
			return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
		case DecisionDashboardMetaModelPackage.VALUES__MONTH:
			return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
		case DecisionDashboardMetaModelPackage.VALUES__YEAR:
			return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
		case DecisionDashboardMetaModelPackage.VALUES__DAY_OF_YEAR:
			return DAY_OF_YEAR_EDEFAULT == null ? dayOfYear != null : !DAY_OF_YEAR_EDEFAULT.equals(dayOfYear);
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_OF_YEAR:
			return WEEK_OF_YEAR_EDEFAULT == null ? weekOfYear != null : !WEEK_OF_YEAR_EDEFAULT.equals(weekOfYear);
		case DecisionDashboardMetaModelPackage.VALUES__QUARTER_OF_YEAR:
			return QUARTER_OF_YEAR_EDEFAULT == null ? quarterOfYear != null
					: !QUARTER_OF_YEAR_EDEFAULT.equals(quarterOfYear);
		case DecisionDashboardMetaModelPackage.VALUES__WEEK_END:
			return WEEK_END_EDEFAULT == null ? weekEnd != null : !WEEK_END_EDEFAULT.equals(weekEnd);
		case DecisionDashboardMetaModelPackage.VALUES__POST_NO:
			return POST_NO_EDEFAULT == null ? postNo != null : !POST_NO_EDEFAULT.equals(postNo);
		case DecisionDashboardMetaModelPackage.VALUES__AVGTURNOVER:
			return AVGTURNOVER_EDEFAULT == null ? avgturnover != null : !AVGTURNOVER_EDEFAULT.equals(avgturnover);
		case DecisionDashboardMetaModelPackage.VALUES__SHOP_PROFILE_NAME:
			return SHOP_PROFILE_NAME_EDEFAULT == null ? shopProfileName != null
					: !SHOP_PROFILE_NAME_EDEFAULT.equals(shopProfileName);
		case DecisionDashboardMetaModelPackage.VALUES__PROFILE:
			return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
		case DecisionDashboardMetaModelPackage.VALUES__EXPANDING_MEAN:
			return EXPANDING_MEAN_EDEFAULT == null ? expanding_mean != null
					: !EXPANDING_MEAN_EDEFAULT.equals(expanding_mean);
		case DecisionDashboardMetaModelPackage.VALUES__LAG_1:
			return LAG_1_EDEFAULT == null ? lag_1 != null : !LAG_1_EDEFAULT.equals(lag_1);
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
		result.append(" (StoreName: ");
		result.append(storeName);
		result.append(", kommuneNo: ");
		result.append(kommuneNo);
		result.append(", CountyNo: ");
		result.append(countyNo);
		result.append(", WeekDay: ");
		result.append(weekDay);
		result.append(", ProductID: ");
		result.append(productID);
		result.append(", ProductUnitPrice: ");
		result.append(productUnitPrice);
		result.append(", Day: ");
		result.append(day);
		result.append(", Month: ");
		result.append(month);
		result.append(", Year: ");
		result.append(year);
		result.append(", DayOfYear: ");
		result.append(dayOfYear);
		result.append(", WeekOfYear: ");
		result.append(weekOfYear);
		result.append(", QuarterOfYear: ");
		result.append(quarterOfYear);
		result.append(", WeekEnd: ");
		result.append(weekEnd);
		result.append(", PostNo: ");
		result.append(postNo);
		result.append(", Avgturnover: ");
		result.append(avgturnover);
		result.append(", ShopProfileName: ");
		result.append(shopProfileName);
		result.append(", Profile: ");
		result.append(profile);
		result.append(", expanding_mean: ");
		result.append(expanding_mean);
		result.append(", lag_1: ");
		result.append(lag_1);
		result.append(')');
		return result.toString();
	}

} //ValuesImpl
