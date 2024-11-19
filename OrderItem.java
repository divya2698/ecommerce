/**
 */
package Ecommerce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.OrderItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link Ecommerce.OrderItem#getSubTotal <em>Sub Total</em>}</li>
 *   <li>{@link Ecommerce.OrderItem#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getOrderItem()
 * @model
 * @generated
 */
public interface OrderItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see Ecommerce.EcommercePackage#getOrderItem_Quantity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link Ecommerce.OrderItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Total</em>' attribute.
	 * @see #setSubTotal(double)
	 * @see Ecommerce.EcommercePackage#getOrderItem_SubTotal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSubTotal();

	/**
	 * Sets the value of the '{@link Ecommerce.OrderItem#getSubTotal <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Total</em>' attribute.
	 * @see #getSubTotal()
	 * @generated
	 */
	void setSubTotal(double value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see Ecommerce.EcommercePackage#getOrderItem_Product()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link Ecommerce.OrderItem#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculateSubTotal();

} // OrderItem
