/**
 */
package Ecommerce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.PhysicalProduct#getWeight <em>Weight</em>}</li>
 *   <li>{@link Ecommerce.PhysicalProduct#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getPhysicalProduct()
 * @model
 * @generated
 */
public interface PhysicalProduct extends Product, Shippable {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see Ecommerce.EcommercePackage#getPhysicalProduct_Weight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link Ecommerce.PhysicalProduct#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #setDimensions(String)
	 * @see Ecommerce.EcommercePackage#getPhysicalProduct_Dimensions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDimensions();

	/**
	 * Sets the value of the '{@link Ecommerce.PhysicalProduct#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculateShipping();

} // PhysicalProduct
