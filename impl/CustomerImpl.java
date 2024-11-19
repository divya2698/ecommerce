/**
 */
package Ecommerce.impl;

import Ecommerce.Customer;
import Ecommerce.EcommercePackage;
import Ecommerce.Order;
import Ecommerce.ShoppingCart;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getShippingAddress <em>Shipping Address</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getLoyaltyPoints <em>Loyalty Points</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getShoppingcart <em>Shoppingcart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The default value of the '{@link #getShippingAddress() <em>Shipping Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPPING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingAddress() <em>Shipping Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingAddress()
	 * @generated
	 * @ordered
	 */
	protected String shippingAddress = SHIPPING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingAddress() <em>Billing Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingAddress() <em>Billing Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAddress()
	 * @generated
	 * @ordered
	 */
	protected String billingAddress = BILLING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoyaltyPoints() <em>Loyalty Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoyaltyPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int LOYALTY_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoyaltyPoints() <em>Loyalty Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoyaltyPoints()
	 * @generated
	 * @ordered
	 */
	protected int loyaltyPoints = LOYALTY_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> order;

	/**
	 * The cached value of the '{@link #getShoppingcart() <em>Shoppingcart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingcart()
	 * @generated
	 * @ordered
	 */
	protected ShoppingCart shoppingcart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingAddress(String newShippingAddress) {
		String oldShippingAddress = shippingAddress;
		shippingAddress = newShippingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__SHIPPING_ADDRESS, oldShippingAddress, shippingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingAddress() {
		return billingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAddress(String newBillingAddress) {
		String oldBillingAddress = billingAddress;
		billingAddress = newBillingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__BILLING_ADDRESS, oldBillingAddress, billingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoyaltyPoints(int newLoyaltyPoints) {
		int oldLoyaltyPoints = loyaltyPoints;
		loyaltyPoints = newLoyaltyPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__LOYALTY_POINTS, oldLoyaltyPoints, loyaltyPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrder() {
		if (order == null) {
			order = new EObjectResolvingEList<Order>(Order.class, this, EcommercePackage.CUSTOMER__ORDER);
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingCart getShoppingcart() {
		return shoppingcart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShoppingcart(ShoppingCart newShoppingcart, NotificationChain msgs) {
		ShoppingCart oldShoppingcart = shoppingcart;
		shoppingcart = newShoppingcart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__SHOPPINGCART, oldShoppingcart, newShoppingcart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingcart(ShoppingCart newShoppingcart) {
		if (newShoppingcart != shoppingcart) {
			NotificationChain msgs = null;
			if (shoppingcart != null)
				msgs = ((InternalEObject)shoppingcart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__SHOPPINGCART, null, msgs);
			if (newShoppingcart != null)
				msgs = ((InternalEObject)newShoppingcart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__SHOPPINGCART, null, msgs);
			msgs = basicSetShoppingcart(newShoppingcart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__SHOPPINGCART, newShoppingcart, newShoppingcart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void placeOrder(Order order) {
		System.out.println("Order Placed Successfully: "+"Order Number:"+order.getId());
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getLoyalityPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewOrderHistory() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.CUSTOMER__SHOPPINGCART:
				return basicSetShoppingcart(null, msgs);
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
			case EcommercePackage.CUSTOMER__SHIPPING_ADDRESS:
				return getShippingAddress();
			case EcommercePackage.CUSTOMER__BILLING_ADDRESS:
				return getBillingAddress();
			case EcommercePackage.CUSTOMER__LOYALTY_POINTS:
				return getLoyaltyPoints();
			case EcommercePackage.CUSTOMER__ORDER:
				return getOrder();
			case EcommercePackage.CUSTOMER__SHOPPINGCART:
				return getShoppingcart();
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
			case EcommercePackage.CUSTOMER__SHIPPING_ADDRESS:
				setShippingAddress((String)newValue);
				return;
			case EcommercePackage.CUSTOMER__BILLING_ADDRESS:
				setBillingAddress((String)newValue);
				return;
			case EcommercePackage.CUSTOMER__LOYALTY_POINTS:
				setLoyaltyPoints((Integer)newValue);
				return;
			case EcommercePackage.CUSTOMER__ORDER:
				getOrder().clear();
				getOrder().addAll((Collection<? extends Order>)newValue);
				return;
			case EcommercePackage.CUSTOMER__SHOPPINGCART:
				setShoppingcart((ShoppingCart)newValue);
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
			case EcommercePackage.CUSTOMER__SHIPPING_ADDRESS:
				setShippingAddress(SHIPPING_ADDRESS_EDEFAULT);
				return;
			case EcommercePackage.CUSTOMER__BILLING_ADDRESS:
				setBillingAddress(BILLING_ADDRESS_EDEFAULT);
				return;
			case EcommercePackage.CUSTOMER__LOYALTY_POINTS:
				setLoyaltyPoints(LOYALTY_POINTS_EDEFAULT);
				return;
			case EcommercePackage.CUSTOMER__ORDER:
				getOrder().clear();
				return;
			case EcommercePackage.CUSTOMER__SHOPPINGCART:
				setShoppingcart((ShoppingCart)null);
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
			case EcommercePackage.CUSTOMER__SHIPPING_ADDRESS:
				return SHIPPING_ADDRESS_EDEFAULT == null ? shippingAddress != null : !SHIPPING_ADDRESS_EDEFAULT.equals(shippingAddress);
			case EcommercePackage.CUSTOMER__BILLING_ADDRESS:
				return BILLING_ADDRESS_EDEFAULT == null ? billingAddress != null : !BILLING_ADDRESS_EDEFAULT.equals(billingAddress);
			case EcommercePackage.CUSTOMER__LOYALTY_POINTS:
				return loyaltyPoints != LOYALTY_POINTS_EDEFAULT;
			case EcommercePackage.CUSTOMER__ORDER:
				return order != null && !order.isEmpty();
			case EcommercePackage.CUSTOMER__SHOPPINGCART:
				return shoppingcart != null;
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
			case EcommercePackage.CUSTOMER___PLACE_ORDER:
				placeOrder(null);
				return null;
			case EcommercePackage.CUSTOMER___GET_LOYALITY_POINTS:
				getLoyalityPoints();
				return null;
			case EcommercePackage.CUSTOMER___VIEW_ORDER_HISTORY:
				viewOrderHistory();
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
		result.append(" (shippingAddress: ");
		result.append(shippingAddress);
		result.append(", billingAddress: ");
		result.append(billingAddress);
		result.append(", loyaltyPoints: ");
		result.append(loyaltyPoints);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
