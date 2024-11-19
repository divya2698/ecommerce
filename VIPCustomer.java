/**
 */
package Ecommerce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VIP Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.VIPCustomer#getDiscountRate <em>Discount Rate</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getVIPCustomer()
 * @model
 * @generated
 */
public interface VIPCustomer extends Customer {
	/**
	 * Returns the value of the '<em><b>Discount Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Rate</em>' attribute.
	 * @see #setDiscountRate(double)
	 * @see Ecommerce.EcommercePackage#getVIPCustomer_DiscountRate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getDiscountRate();

	/**
	 * Sets the value of the '{@link Ecommerce.VIPCustomer#getDiscountRate <em>Discount Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Rate</em>' attribute.
	 * @see #getDiscountRate()
	 * @generated
	 */
	void setDiscountRate(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void applyDiscount();

} // VIPCustomer
