/**
 */
package Ecommerce.impl;

import Ecommerce.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcommerceFactoryImpl extends EFactoryImpl implements EcommerceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcommerceFactory init() {
		try {
			EcommerceFactory theEcommerceFactory = (EcommerceFactory)EPackage.Registry.INSTANCE.getEFactory(EcommercePackage.eNS_URI);
			if (theEcommerceFactory != null) {
				return theEcommerceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcommerceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcommerceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcommercePackage.USER: return createUser();
			case EcommercePackage.CUSTOMER: return createCustomer();
			case EcommercePackage.ORDER: return createOrder();
			case EcommercePackage.PRODUCT: return createProduct();
			case EcommercePackage.CATEGORY: return createCategory();
			case EcommercePackage.SHOPPING_CART: return createShoppingCart();
			case EcommercePackage.ADMIN: return createAdmin();
			case EcommercePackage.VIP_CUSTOMER: return createVIPCustomer();
			case EcommercePackage.INVENTORY: return createInventory();
			case EcommercePackage.SHIPPABLE: return createShippable();
			case EcommercePackage.PAYMENT: return createPayment();
			case EcommercePackage.ORDER_ITEM: return createOrderItem();
			case EcommercePackage.PHYSICAL_PRODUCT: return createPhysicalProduct();
			case EcommercePackage.DIGITAL_PRODUCT: return createDigitalProduct();
			case EcommercePackage.DOWNLOADABLE: return createDownloadable();
			case EcommercePackage.REVIEW: return createReview();
			case EcommercePackage.STATE_MACHINE28: return createStateMachine28();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingCart createShoppingCart() {
		ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
		return shoppingCart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VIPCustomer createVIPCustomer() {
		VIPCustomerImpl vipCustomer = new VIPCustomerImpl();
		return vipCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory createInventory() {
		InventoryImpl inventory = new InventoryImpl();
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shippable createShippable() {
		ShippableImpl shippable = new ShippableImpl();
		return shippable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItem createOrderItem() {
		OrderItemImpl orderItem = new OrderItemImpl();
		return orderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalProduct createPhysicalProduct() {
		PhysicalProductImpl physicalProduct = new PhysicalProductImpl();
		return physicalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalProduct createDigitalProduct() {
		DigitalProductImpl digitalProduct = new DigitalProductImpl();
		return digitalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Downloadable createDownloadable() {
		DownloadableImpl downloadable = new DownloadableImpl();
		return downloadable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Review createReview() {
		ReviewImpl review = new ReviewImpl();
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine28 createStateMachine28() {
		StateMachine28Impl stateMachine28 = new StateMachine28Impl();
		return stateMachine28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcommercePackage getEcommercePackage() {
		return (EcommercePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcommercePackage getPackage() {
		return EcommercePackage.eINSTANCE;
	}

} //EcommerceFactoryImpl
