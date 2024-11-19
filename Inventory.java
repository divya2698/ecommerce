/**
 */
package Ecommerce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Inventory#getLowStockProducts <em>Low Stock Products</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getInventory()
 * @model
 * @generated
 */
public interface Inventory extends EObject {
	/**
	 * Returns the value of the '<em><b>Low Stock Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Stock Products</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Stock Products</em>' reference.
	 * @see #setLowStockProducts(Product)
	 * @see Ecommerce.EcommercePackage#getInventory_LowStockProducts()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Product getLowStockProducts();

	/**
	 * Sets the value of the '{@link Ecommerce.Inventory#getLowStockProducts <em>Low Stock Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Stock Products</em>' reference.
	 * @see #getLowStockProducts()
	 * @generated
	 */
	void setLowStockProducts(Product value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateStock();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkAvailability();

} // Inventory
