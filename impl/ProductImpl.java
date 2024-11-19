/**
 */
package Ecommerce.impl;

import Ecommerce.Category;
import Ecommerce.EcommercePackage;
import Ecommerce.Product;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getStockQuantity <em>Stock Quantity</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getDiscountedPrice <em>Discounted Price</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStockQuantity() <em>Stock Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int STOCK_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStockQuantity() <em>Stock Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockQuantity()
	 * @generated
	 * @ordered
	 */
	protected int stockQuantity = STOCK_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscountedPrice() <em>Discounted Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountedPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOUNTED_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscountedPrice() <em>Discounted Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountedPrice()
	 * @generated
	 * @ordered
	 */
	protected double discountedPrice = DISCOUNTED_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStockQuantity() {
		return stockQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStockQuantity(int newStockQuantity) {
		int oldStockQuantity = stockQuantity;
		stockQuantity = newStockQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__STOCK_QUANTITY, oldStockQuantity, stockQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiscountedPrice() {
		return discountedPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountedPrice(double newDiscountedPrice) {
		double oldDiscountedPrice = discountedPrice;
		discountedPrice = newDiscountedPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__DISCOUNTED_PRICE, oldDiscountedPrice, discountedPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Category)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.PRODUCT__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateStock() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getTotalSold() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcommercePackage.PRODUCT__ID:
				return getId();
			case EcommercePackage.PRODUCT__NAME:
				return getName();
			case EcommercePackage.PRODUCT__PRICE:
				return getPrice();
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				return getStockQuantity();
			case EcommercePackage.PRODUCT__DISCOUNTED_PRICE:
				return getDiscountedPrice();
			case EcommercePackage.PRODUCT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
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
			case EcommercePackage.PRODUCT__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case EcommercePackage.PRODUCT__PRICE:
				setPrice((Double)newValue);
				return;
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				setStockQuantity((Integer)newValue);
				return;
			case EcommercePackage.PRODUCT__DISCOUNTED_PRICE:
				setDiscountedPrice((Double)newValue);
				return;
			case EcommercePackage.PRODUCT__CATEGORY:
				setCategory((Category)newValue);
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
			case EcommercePackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				setStockQuantity(STOCK_QUANTITY_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__DISCOUNTED_PRICE:
				setDiscountedPrice(DISCOUNTED_PRICE_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__CATEGORY:
				setCategory((Category)null);
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
			case EcommercePackage.PRODUCT__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcommercePackage.PRODUCT__PRICE:
				return price != PRICE_EDEFAULT;
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				return stockQuantity != STOCK_QUANTITY_EDEFAULT;
			case EcommercePackage.PRODUCT__DISCOUNTED_PRICE:
				return discountedPrice != DISCOUNTED_PRICE_EDEFAULT;
			case EcommercePackage.PRODUCT__CATEGORY:
				return category != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcommercePackage.PRODUCT___UPDATE_STOCK:
				updateStock();
				return null;
			case EcommercePackage.PRODUCT___SET_PRICE:
				setPrice();
				return null;
			case EcommercePackage.PRODUCT___GET_TOTAL_SOLD:
				getTotalSold();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", stockQuantity: ");
		result.append(stockQuantity);
		result.append(", discountedPrice: ");
		result.append(discountedPrice);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
