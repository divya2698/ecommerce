/**
 */
package Ecommerce.impl;

import Ecommerce.DigitalProduct;
import Ecommerce.Downloadable;
import Ecommerce.EcommercePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.DigitalProductImpl#getDownloadLink <em>Download Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalProductImpl extends ProductImpl implements DigitalProduct {
	/**
	 * The default value of the '{@link #getDownloadLink() <em>Download Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadLink()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadLink() <em>Download Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadLink()
	 * @generated
	 * @ordered
	 */
	protected String downloadLink = DOWNLOAD_LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.DIGITAL_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDownloadLink() {
		return downloadLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownloadLink(String newDownloadLink) {
		String oldDownloadLink = downloadLink;
		downloadLink = newDownloadLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.DIGITAL_PRODUCT__DOWNLOAD_LINK, oldDownloadLink, downloadLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void provideDownloadLink() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateLink() {
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
			case EcommercePackage.DIGITAL_PRODUCT__DOWNLOAD_LINK:
				return getDownloadLink();
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
			case EcommercePackage.DIGITAL_PRODUCT__DOWNLOAD_LINK:
				setDownloadLink((String)newValue);
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
			case EcommercePackage.DIGITAL_PRODUCT__DOWNLOAD_LINK:
				setDownloadLink(DOWNLOAD_LINK_EDEFAULT);
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
			case EcommercePackage.DIGITAL_PRODUCT__DOWNLOAD_LINK:
				return DOWNLOAD_LINK_EDEFAULT == null ? downloadLink != null : !DOWNLOAD_LINK_EDEFAULT.equals(downloadLink);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Downloadable.class) {
			switch (baseOperationID) {
				case EcommercePackage.DOWNLOADABLE___PROVIDE_DOWNLOAD_LINK: return EcommercePackage.DIGITAL_PRODUCT___PROVIDE_DOWNLOAD_LINK;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcommercePackage.DIGITAL_PRODUCT___PROVIDE_DOWNLOAD_LINK:
				provideDownloadLink();
				return null;
			case EcommercePackage.DIGITAL_PRODUCT___GENERATE_LINK:
				generateLink();
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
		result.append(" (downloadLink: ");
		result.append(downloadLink);
		result.append(')');
		return result.toString();
	}

} //DigitalProductImpl
