/**
 */
package Ecommerce;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Customer#getShippingAddress <em>Shipping Address</em>}</li>
 *   <li>{@link Ecommerce.Customer#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link Ecommerce.Customer#getLoyaltyPoints <em>Loyalty Points</em>}</li>
 *   <li>{@link Ecommerce.Customer#getOrder <em>Order</em>}</li>
 *   <li>{@link Ecommerce.Customer#getShoppingcart <em>Shoppingcart</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Shipping Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Address</em>' attribute.
	 * @see #setShippingAddress(String)
	 * @see Ecommerce.EcommercePackage#getCustomer_ShippingAddress()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getShippingAddress();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getShippingAddress <em>Shipping Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Address</em>' attribute.
	 * @see #getShippingAddress()
	 * @generated
	 */
	void setShippingAddress(String value);

	/**
	 * Returns the value of the '<em><b>Billing Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Address</em>' attribute.
	 * @see #setBillingAddress(String)
	 * @see Ecommerce.EcommercePackage#getCustomer_BillingAddress()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBillingAddress();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getBillingAddress <em>Billing Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Address</em>' attribute.
	 * @see #getBillingAddress()
	 * @generated
	 */
	void setBillingAddress(String value);

	/**
	 * Returns the value of the '<em><b>Loyalty Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loyalty Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loyalty Points</em>' attribute.
	 * @see #setLoyaltyPoints(int)
	 * @see Ecommerce.EcommercePackage#getCustomer_LoyaltyPoints()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getLoyaltyPoints();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getLoyaltyPoints <em>Loyalty Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loyalty Points</em>' attribute.
	 * @see #getLoyaltyPoints()
	 * @generated
	 */
	void setLoyaltyPoints(int value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link Ecommerce.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see Ecommerce.EcommercePackage#getCustomer_Order()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Order> getOrder();

	/**
	 * Returns the value of the '<em><b>Shoppingcart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shoppingcart</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shoppingcart</em>' containment reference.
	 * @see #setShoppingcart(ShoppingCart)
	 * @see Ecommerce.EcommercePackage#getCustomer_Shoppingcart()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ShoppingCart getShoppingcart();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getShoppingcart <em>Shoppingcart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoppingcart</em>' containment reference.
	 * @see #getShoppingcart()
	 * @generated
	 */
	void setShoppingcart(ShoppingCart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void placeOrder(Order order);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getLoyalityPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewOrderHistory();

} // Customer
