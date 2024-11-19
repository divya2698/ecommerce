/**
 */
package Ecommerce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.DigitalProduct#getDownloadLink <em>Download Link</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getDigitalProduct()
 * @model
 * @generated
 */
public interface DigitalProduct extends Product, Downloadable {
	/**
	 * Returns the value of the '<em><b>Download Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Download Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Link</em>' attribute.
	 * @see #setDownloadLink(String)
	 * @see Ecommerce.EcommercePackage#getDigitalProduct_DownloadLink()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDownloadLink();

	/**
	 * Sets the value of the '{@link Ecommerce.DigitalProduct#getDownloadLink <em>Download Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Link</em>' attribute.
	 * @see #getDownloadLink()
	 * @generated
	 */
	void setDownloadLink(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateLink();

} // DigitalProduct
