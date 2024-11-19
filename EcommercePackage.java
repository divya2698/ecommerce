/**
 */
package Ecommerce;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Ecommerce.EcommerceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='E-commerce'"
 * @generated
 */
public interface EcommercePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ecommerce";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Ecommerce.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Ecommerce";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcommercePackage eINSTANCE = Ecommerce.impl.EcommercePackageImpl.init();

	/**
	 * The meta object id for the '{@link Ecommerce.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.UserImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___REGISTER = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___LOGIN = 1;

	/**
	 * The operation id for the '<em>Update Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_PROFILE = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.CustomerImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Shipping Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SHIPPING_ADDRESS = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Billing Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BILLING_ADDRESS = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loyalty Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LOYALTY_POINTS = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ORDER = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shoppingcart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SHOPPINGCART = USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___REGISTER = USER___REGISTER;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___LOGIN = USER___LOGIN;

	/**
	 * The operation id for the '<em>Update Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___UPDATE_PROFILE = USER___UPDATE_PROFILE;

	/**
	 * The operation id for the '<em>Place Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___PLACE_ORDER = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Loyality Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_LOYALITY_POINTS = USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>View Order History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___VIEW_ORDER_HISTORY = USER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.OrderImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_DATE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Ordered Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDERED_PRODUCTS = 3;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Calculate Total</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___CALCULATE_TOTAL = 0;

	/**
	 * The operation id for the '<em>Update Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___UPDATE_STATUS = 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ProductImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Stock Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__STOCK_QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Discounted Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DISCOUNTED_PRICE = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = 5;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Update Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___UPDATE_STOCK = 0;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___SET_PRICE = 1;

	/**
	 * The operation id for the '<em>Get Total Sold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_TOTAL_SOLD = 2;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.CategoryImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Total Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TOTAL_PRODUCTS = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___ADD_PRODUCT = 0;

	/**
	 * The operation id for the '<em>Remove Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___REMOVE_PRODUCT = 1;

	/**
	 * The operation id for the '<em>Get Top Selling Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_TOP_SELLING_PRODUCT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ShoppingCartImpl <em>Shopping Cart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ShoppingCartImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getShoppingCart()
	 * @generated
	 */
	int SHOPPING_CART = 5;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__TOTAL = 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__PRODUCT = 1;

	/**
	 * The number of structural features of the '<em>Shopping Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART___ADD_ITEM = 0;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART___REMOVE_ITEM = 1;

	/**
	 * The operation id for the '<em>Clear Cart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART___CLEAR_CART = 2;

	/**
	 * The number of operations of the '<em>Shopping Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.AdminImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__DEPARTMENT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___REGISTER = USER___REGISTER;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___LOGIN = USER___LOGIN;

	/**
	 * The operation id for the '<em>Update Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___UPDATE_PROFILE = USER___UPDATE_PROFILE;

	/**
	 * The operation id for the '<em>Manage Inventory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___MANAGE_INVENTORY = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Reports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___GENERATE_REPORTS = USER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = USER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.VIPCustomerImpl <em>VIP Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.VIPCustomerImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getVIPCustomer()
	 * @generated
	 */
	int VIP_CUSTOMER = 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__EMAIL = CUSTOMER__EMAIL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__ID = CUSTOMER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__USERNAME = CUSTOMER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__PASSWORD = CUSTOMER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Shipping Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__SHIPPING_ADDRESS = CUSTOMER__SHIPPING_ADDRESS;

	/**
	 * The feature id for the '<em><b>Billing Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__BILLING_ADDRESS = CUSTOMER__BILLING_ADDRESS;

	/**
	 * The feature id for the '<em><b>Loyalty Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__LOYALTY_POINTS = CUSTOMER__LOYALTY_POINTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__ORDER = CUSTOMER__ORDER;

	/**
	 * The feature id for the '<em><b>Shoppingcart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__SHOPPINGCART = CUSTOMER__SHOPPINGCART;

	/**
	 * The feature id for the '<em><b>Discount Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER__DISCOUNT_RATE = CUSTOMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VIP Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER_FEATURE_COUNT = CUSTOMER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER___REGISTER = CUSTOMER___REGISTER;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER___LOGIN = CUSTOMER___LOGIN;

	/**
	 * The operation id for the '<em>Update Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER___UPDATE_PROFILE = CUSTOMER___UPDATE_PROFILE;

	/**
	 * The operation id for the '<em>Place Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER___PLACE_ORDER = CUSTOMER___PLACE_ORDER;

	/**
	 * The operation id for the '<em>Get Loyality Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER___GET_LOYALITY_POINTS = CUSTOMER___GET_LOYALITY_POINTS;

	/**
	 * The operation id for the '<em>View Order History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER___VIEW_ORDER_HISTORY = CUSTOMER___VIEW_ORDER_HISTORY;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER___APPLY_DISCOUNT = CUSTOMER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>VIP Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIP_CUSTOMER_OPERATION_COUNT = CUSTOMER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.InventoryImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 8;

	/**
	 * The feature id for the '<em><b>Low Stock Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__LOW_STOCK_PRODUCTS = 0;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___UPDATE_STOCK = 0;

	/**
	 * The operation id for the '<em>Check Availability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___CHECK_AVAILABILITY = 1;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ShippableImpl <em>Shippable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ShippableImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getShippable()
	 * @generated
	 */
	int SHIPPABLE = 9;

	/**
	 * The number of structural features of the '<em>Shippable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Estimate Shipping Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPABLE___ESTIMATE_SHIPPING_COST = 0;

	/**
	 * The number of operations of the '<em>Shippable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.PaymentImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_DATE = 2;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_METHOD = 3;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Process Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___PROCESS_PAYMENT = 0;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.OrderItemImpl <em>Order Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.OrderItemImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getOrderItem()
	 * @generated
	 */
	int ORDER_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SUB_TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__PRODUCT = 2;

	/**
	 * The number of structural features of the '<em>Order Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Calculate Sub Total</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM___CALCULATE_SUB_TOTAL = 0;

	/**
	 * The number of operations of the '<em>Order Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.PhysicalProductImpl <em>Physical Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.PhysicalProductImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getPhysicalProduct()
	 * @generated
	 */
	int PHYSICAL_PRODUCT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__ID = PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__PRICE = PRODUCT__PRICE;

	/**
	 * The feature id for the '<em><b>Stock Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__STOCK_QUANTITY = PRODUCT__STOCK_QUANTITY;

	/**
	 * The feature id for the '<em><b>Discounted Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__DISCOUNTED_PRICE = PRODUCT__DISCOUNTED_PRICE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__CATEGORY = PRODUCT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__WEIGHT = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT__DIMENSIONS = PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Update Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT___UPDATE_STOCK = PRODUCT___UPDATE_STOCK;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT___SET_PRICE = PRODUCT___SET_PRICE;

	/**
	 * The operation id for the '<em>Get Total Sold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT___GET_TOTAL_SOLD = PRODUCT___GET_TOTAL_SOLD;

	/**
	 * The operation id for the '<em>Estimate Shipping Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT___ESTIMATE_SHIPPING_COST = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate Shipping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT___CALCULATE_SHIPPING = PRODUCT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PRODUCT_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.DigitalProductImpl <em>Digital Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.DigitalProductImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getDigitalProduct()
	 * @generated
	 */
	int DIGITAL_PRODUCT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT__ID = PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT__PRICE = PRODUCT__PRICE;

	/**
	 * The feature id for the '<em><b>Stock Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT__STOCK_QUANTITY = PRODUCT__STOCK_QUANTITY;

	/**
	 * The feature id for the '<em><b>Discounted Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT__DISCOUNTED_PRICE = PRODUCT__DISCOUNTED_PRICE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT__CATEGORY = PRODUCT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Download Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT__DOWNLOAD_LINK = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Update Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT___UPDATE_STOCK = PRODUCT___UPDATE_STOCK;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT___SET_PRICE = PRODUCT___SET_PRICE;

	/**
	 * The operation id for the '<em>Get Total Sold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT___GET_TOTAL_SOLD = PRODUCT___GET_TOTAL_SOLD;

	/**
	 * The operation id for the '<em>Provide Download Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT___PROVIDE_DOWNLOAD_LINK = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT___GENERATE_LINK = PRODUCT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Digital Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PRODUCT_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.DownloadableImpl <em>Downloadable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.DownloadableImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getDownloadable()
	 * @generated
	 */
	int DOWNLOADABLE = 14;

	/**
	 * The number of structural features of the '<em>Downloadable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOADABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provide Download Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOADABLE___PROVIDE_DOWNLOAD_LINK = 0;

	/**
	 * The number of operations of the '<em>Downloadable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOADABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ReviewImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 15;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__RATING = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEW_DATE = 2;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Update Review</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW___UPDATE_REVIEW = 0;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.StateMachine28Impl <em>State Machine28</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.StateMachine28Impl
	 * @see Ecommerce.impl.EcommercePackageImpl#getStateMachine28()
	 * @generated
	 */
	int STATE_MACHINE28 = 16;

	/**
	 * The number of structural features of the '<em>State Machine28</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE28_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>State Machine28</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE28_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Ecommerce.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see Ecommerce.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Ecommerce.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see Ecommerce.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Ecommerce.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the '{@link Ecommerce.User#register() <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see Ecommerce.User#register()
	 * @generated
	 */
	EOperation getUser__Register();

	/**
	 * Returns the meta object for the '{@link Ecommerce.User#login() <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see Ecommerce.User#login()
	 * @generated
	 */
	EOperation getUser__Login();

	/**
	 * Returns the meta object for the '{@link Ecommerce.User#updateProfile() <em>Update Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Profile</em>' operation.
	 * @see Ecommerce.User#updateProfile()
	 * @generated
	 */
	EOperation getUser__UpdateProfile();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see Ecommerce.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Customer#getShippingAddress <em>Shipping Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Address</em>'.
	 * @see Ecommerce.Customer#getShippingAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ShippingAddress();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Customer#getBillingAddress <em>Billing Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Address</em>'.
	 * @see Ecommerce.Customer#getBillingAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_BillingAddress();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Customer#getLoyaltyPoints <em>Loyalty Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loyalty Points</em>'.
	 * @see Ecommerce.Customer#getLoyaltyPoints()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LoyaltyPoints();

	/**
	 * Returns the meta object for the reference list '{@link Ecommerce.Customer#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order</em>'.
	 * @see Ecommerce.Customer#getOrder()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Order();

	/**
	 * Returns the meta object for the containment reference '{@link Ecommerce.Customer#getShoppingcart <em>Shoppingcart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shoppingcart</em>'.
	 * @see Ecommerce.Customer#getShoppingcart()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Shoppingcart();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Customer#placeOrder() <em>Place Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Place Order</em>' operation.
	 * @see Ecommerce.Customer#placeOrder()
	 * @generated
	 */
	EOperation getCustomer__PlaceOrder();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Customer#getLoyalityPoints() <em>Get Loyality Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Loyality Points</em>' operation.
	 * @see Ecommerce.Customer#getLoyalityPoints()
	 * @generated
	 */
	EOperation getCustomer__GetLoyalityPoints();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Customer#viewOrderHistory() <em>View Order History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Order History</em>' operation.
	 * @see Ecommerce.Customer#viewOrderHistory()
	 * @generated
	 */
	EOperation getCustomer__ViewOrderHistory();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see Ecommerce.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Order#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Order#getId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Order#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see Ecommerce.Order#getOrderDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderDate();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Order#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Ecommerce.Order#getStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Status();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.Order#getOrderedProducts <em>Ordered Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ordered Products</em>'.
	 * @see Ecommerce.Order#getOrderedProducts()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_OrderedProducts();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Order#calculateTotal() <em>Calculate Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Total</em>' operation.
	 * @see Ecommerce.Order#calculateTotal()
	 * @generated
	 */
	EOperation getOrder__CalculateTotal();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Order#updateStatus() <em>Update Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Status</em>' operation.
	 * @see Ecommerce.Order#updateStatus()
	 * @generated
	 */
	EOperation getOrder__UpdateStatus();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see Ecommerce.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ecommerce.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Ecommerce.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getStockQuantity <em>Stock Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock Quantity</em>'.
	 * @see Ecommerce.Product#getStockQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_StockQuantity();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getDiscountedPrice <em>Discounted Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discounted Price</em>'.
	 * @see Ecommerce.Product#getDiscountedPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_DiscountedPrice();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see Ecommerce.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Category();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Product#updateStock() <em>Update Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Stock</em>' operation.
	 * @see Ecommerce.Product#updateStock()
	 * @generated
	 */
	EOperation getProduct__UpdateStock();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Product#setPrice() <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see Ecommerce.Product#setPrice()
	 * @generated
	 */
	EOperation getProduct__SetPrice();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Product#getTotalSold() <em>Get Total Sold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Sold</em>' operation.
	 * @see Ecommerce.Product#getTotalSold()
	 * @generated
	 */
	EOperation getProduct__GetTotalSold();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see Ecommerce.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Category#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Category#getId()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ecommerce.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Category#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Ecommerce.Category#getDescription()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Description();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Category#getTotalProducts <em>Total Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Products</em>'.
	 * @see Ecommerce.Category#getTotalProducts()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_TotalProducts();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Category#addProduct() <em>Add Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Product</em>' operation.
	 * @see Ecommerce.Category#addProduct()
	 * @generated
	 */
	EOperation getCategory__AddProduct();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Category#removeProduct() <em>Remove Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Product</em>' operation.
	 * @see Ecommerce.Category#removeProduct()
	 * @generated
	 */
	EOperation getCategory__RemoveProduct();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Category#getTopSellingProduct() <em>Get Top Selling Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Top Selling Product</em>' operation.
	 * @see Ecommerce.Category#getTopSellingProduct()
	 * @generated
	 */
	EOperation getCategory__GetTopSellingProduct();

	/**
	 * Returns the meta object for class '{@link Ecommerce.ShoppingCart <em>Shopping Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping Cart</em>'.
	 * @see Ecommerce.ShoppingCart
	 * @generated
	 */
	EClass getShoppingCart();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.ShoppingCart#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see Ecommerce.ShoppingCart#getTotal()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EAttribute getShoppingCart_Total();

	/**
	 * Returns the meta object for the reference list '{@link Ecommerce.ShoppingCart#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product</em>'.
	 * @see Ecommerce.ShoppingCart#getProduct()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EReference getShoppingCart_Product();

	/**
	 * Returns the meta object for the '{@link Ecommerce.ShoppingCart#addItem() <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see Ecommerce.ShoppingCart#addItem()
	 * @generated
	 */
	EOperation getShoppingCart__AddItem();

	/**
	 * Returns the meta object for the '{@link Ecommerce.ShoppingCart#removeItem() <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see Ecommerce.ShoppingCart#removeItem()
	 * @generated
	 */
	EOperation getShoppingCart__RemoveItem();

	/**
	 * Returns the meta object for the '{@link Ecommerce.ShoppingCart#clearCart() <em>Clear Cart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Cart</em>' operation.
	 * @see Ecommerce.ShoppingCart#clearCart()
	 * @generated
	 */
	EOperation getShoppingCart__ClearCart();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see Ecommerce.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Admin#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see Ecommerce.Admin#getDepartment()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Department();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Admin#manageInventory() <em>Manage Inventory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Manage Inventory</em>' operation.
	 * @see Ecommerce.Admin#manageInventory()
	 * @generated
	 */
	EOperation getAdmin__ManageInventory();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Admin#generateReports() <em>Generate Reports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Reports</em>' operation.
	 * @see Ecommerce.Admin#generateReports()
	 * @generated
	 */
	EOperation getAdmin__GenerateReports();

	/**
	 * Returns the meta object for class '{@link Ecommerce.VIPCustomer <em>VIP Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VIP Customer</em>'.
	 * @see Ecommerce.VIPCustomer
	 * @generated
	 */
	EClass getVIPCustomer();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.VIPCustomer#getDiscountRate <em>Discount Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Rate</em>'.
	 * @see Ecommerce.VIPCustomer#getDiscountRate()
	 * @see #getVIPCustomer()
	 * @generated
	 */
	EAttribute getVIPCustomer_DiscountRate();

	/**
	 * Returns the meta object for the '{@link Ecommerce.VIPCustomer#applyDiscount() <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see Ecommerce.VIPCustomer#applyDiscount()
	 * @generated
	 */
	EOperation getVIPCustomer__ApplyDiscount();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see Ecommerce.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.Inventory#getLowStockProducts <em>Low Stock Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Low Stock Products</em>'.
	 * @see Ecommerce.Inventory#getLowStockProducts()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_LowStockProducts();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Inventory#updateStock() <em>Update Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Stock</em>' operation.
	 * @see Ecommerce.Inventory#updateStock()
	 * @generated
	 */
	EOperation getInventory__UpdateStock();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Inventory#checkAvailability() <em>Check Availability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Availability</em>' operation.
	 * @see Ecommerce.Inventory#checkAvailability()
	 * @generated
	 */
	EOperation getInventory__CheckAvailability();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Shippable <em>Shippable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shippable</em>'.
	 * @see Ecommerce.Shippable
	 * @generated
	 */
	EClass getShippable();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Shippable#estimateShippingCost() <em>Estimate Shipping Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Estimate Shipping Cost</em>' operation.
	 * @see Ecommerce.Shippable#estimateShippingCost()
	 * @generated
	 */
	EOperation getShippable__EstimateShippingCost();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see Ecommerce.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Payment#getId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Ecommerce.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getPaymentDate <em>Payment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Date</em>'.
	 * @see Ecommerce.Payment#getPaymentDate()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentDate();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see Ecommerce.Payment#getPaymentMethod()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentMethod();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Payment#processPayment() <em>Process Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process Payment</em>' operation.
	 * @see Ecommerce.Payment#processPayment()
	 * @generated
	 */
	EOperation getPayment__ProcessPayment();

	/**
	 * Returns the meta object for class '{@link Ecommerce.OrderItem <em>Order Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Item</em>'.
	 * @see Ecommerce.OrderItem
	 * @generated
	 */
	EClass getOrderItem();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.OrderItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see Ecommerce.OrderItem#getQuantity()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.OrderItem#getSubTotal <em>Sub Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Total</em>'.
	 * @see Ecommerce.OrderItem#getSubTotal()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_SubTotal();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.OrderItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see Ecommerce.OrderItem#getProduct()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_Product();

	/**
	 * Returns the meta object for the '{@link Ecommerce.OrderItem#calculateSubTotal() <em>Calculate Sub Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Sub Total</em>' operation.
	 * @see Ecommerce.OrderItem#calculateSubTotal()
	 * @generated
	 */
	EOperation getOrderItem__CalculateSubTotal();

	/**
	 * Returns the meta object for class '{@link Ecommerce.PhysicalProduct <em>Physical Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Product</em>'.
	 * @see Ecommerce.PhysicalProduct
	 * @generated
	 */
	EClass getPhysicalProduct();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.PhysicalProduct#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see Ecommerce.PhysicalProduct#getWeight()
	 * @see #getPhysicalProduct()
	 * @generated
	 */
	EAttribute getPhysicalProduct_Weight();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.PhysicalProduct#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see Ecommerce.PhysicalProduct#getDimensions()
	 * @see #getPhysicalProduct()
	 * @generated
	 */
	EAttribute getPhysicalProduct_Dimensions();

	/**
	 * Returns the meta object for the '{@link Ecommerce.PhysicalProduct#calculateShipping() <em>Calculate Shipping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Shipping</em>' operation.
	 * @see Ecommerce.PhysicalProduct#calculateShipping()
	 * @generated
	 */
	EOperation getPhysicalProduct__CalculateShipping();

	/**
	 * Returns the meta object for class '{@link Ecommerce.DigitalProduct <em>Digital Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Product</em>'.
	 * @see Ecommerce.DigitalProduct
	 * @generated
	 */
	EClass getDigitalProduct();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.DigitalProduct#getDownloadLink <em>Download Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Link</em>'.
	 * @see Ecommerce.DigitalProduct#getDownloadLink()
	 * @see #getDigitalProduct()
	 * @generated
	 */
	EAttribute getDigitalProduct_DownloadLink();

	/**
	 * Returns the meta object for the '{@link Ecommerce.DigitalProduct#generateLink() <em>Generate Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Link</em>' operation.
	 * @see Ecommerce.DigitalProduct#generateLink()
	 * @generated
	 */
	EOperation getDigitalProduct__GenerateLink();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Downloadable <em>Downloadable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Downloadable</em>'.
	 * @see Ecommerce.Downloadable
	 * @generated
	 */
	EClass getDownloadable();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Downloadable#provideDownloadLink() <em>Provide Download Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provide Download Link</em>' operation.
	 * @see Ecommerce.Downloadable#provideDownloadLink()
	 * @generated
	 */
	EOperation getDownloadable__ProvideDownloadLink();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see Ecommerce.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Review#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see Ecommerce.Review#getRating()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Rating();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Review#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Ecommerce.Review#getComment()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Review#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Date</em>'.
	 * @see Ecommerce.Review#getReviewDate()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_ReviewDate();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Review#updateReview() <em>Update Review</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Review</em>' operation.
	 * @see Ecommerce.Review#updateReview()
	 * @generated
	 */
	EOperation getReview__UpdateReview();

	/**
	 * Returns the meta object for class '{@link Ecommerce.StateMachine28 <em>State Machine28</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine28</em>'.
	 * @see Ecommerce.StateMachine28
	 * @generated
	 */
	EClass getStateMachine28();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcommerceFactory getEcommerceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Ecommerce.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.UserImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___REGISTER = eINSTANCE.getUser__Register();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___LOGIN = eINSTANCE.getUser__Login();

		/**
		 * The meta object literal for the '<em><b>Update Profile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATE_PROFILE = eINSTANCE.getUser__UpdateProfile();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.CustomerImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Shipping Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__SHIPPING_ADDRESS = eINSTANCE.getCustomer_ShippingAddress();

		/**
		 * The meta object literal for the '<em><b>Billing Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BILLING_ADDRESS = eINSTANCE.getCustomer_BillingAddress();

		/**
		 * The meta object literal for the '<em><b>Loyalty Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LOYALTY_POINTS = eINSTANCE.getCustomer_LoyaltyPoints();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ORDER = eINSTANCE.getCustomer_Order();

		/**
		 * The meta object literal for the '<em><b>Shoppingcart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__SHOPPINGCART = eINSTANCE.getCustomer_Shoppingcart();

		/**
		 * The meta object literal for the '<em><b>Place Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___PLACE_ORDER = eINSTANCE.getCustomer__PlaceOrder();

		/**
		 * The meta object literal for the '<em><b>Get Loyality Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_LOYALITY_POINTS = eINSTANCE.getCustomer__GetLoyalityPoints();

		/**
		 * The meta object literal for the '<em><b>View Order History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___VIEW_ORDER_HISTORY = eINSTANCE.getCustomer__ViewOrderHistory();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.OrderImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ID = eINSTANCE.getOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_DATE = eINSTANCE.getOrder_OrderDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__STATUS = eINSTANCE.getOrder_Status();

		/**
		 * The meta object literal for the '<em><b>Ordered Products</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ORDERED_PRODUCTS = eINSTANCE.getOrder_OrderedProducts();

		/**
		 * The meta object literal for the '<em><b>Calculate Total</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___CALCULATE_TOTAL = eINSTANCE.getOrder__CalculateTotal();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___UPDATE_STATUS = eINSTANCE.getOrder__UpdateStatus();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ProductImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Stock Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__STOCK_QUANTITY = eINSTANCE.getProduct_StockQuantity();

		/**
		 * The meta object literal for the '<em><b>Discounted Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DISCOUNTED_PRICE = eINSTANCE.getProduct_DiscountedPrice();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CATEGORY = eINSTANCE.getProduct_Category();

		/**
		 * The meta object literal for the '<em><b>Update Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___UPDATE_STOCK = eINSTANCE.getProduct__UpdateStock();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___SET_PRICE = eINSTANCE.getProduct__SetPrice();

		/**
		 * The meta object literal for the '<em><b>Get Total Sold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___GET_TOTAL_SOLD = eINSTANCE.getProduct__GetTotalSold();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.CategoryImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__ID = eINSTANCE.getCategory_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESCRIPTION = eINSTANCE.getCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Total Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TOTAL_PRODUCTS = eINSTANCE.getCategory_TotalProducts();

		/**
		 * The meta object literal for the '<em><b>Add Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___ADD_PRODUCT = eINSTANCE.getCategory__AddProduct();

		/**
		 * The meta object literal for the '<em><b>Remove Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___REMOVE_PRODUCT = eINSTANCE.getCategory__RemoveProduct();

		/**
		 * The meta object literal for the '<em><b>Get Top Selling Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___GET_TOP_SELLING_PRODUCT = eINSTANCE.getCategory__GetTopSellingProduct();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ShoppingCartImpl <em>Shopping Cart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ShoppingCartImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getShoppingCart()
		 * @generated
		 */
		EClass SHOPPING_CART = eINSTANCE.getShoppingCart();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_CART__TOTAL = eINSTANCE.getShoppingCart_Total();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_CART__PRODUCT = eINSTANCE.getShoppingCart_Product();

		/**
		 * The meta object literal for the '<em><b>Add Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHOPPING_CART___ADD_ITEM = eINSTANCE.getShoppingCart__AddItem();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHOPPING_CART___REMOVE_ITEM = eINSTANCE.getShoppingCart__RemoveItem();

		/**
		 * The meta object literal for the '<em><b>Clear Cart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHOPPING_CART___CLEAR_CART = eINSTANCE.getShoppingCart__ClearCart();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.AdminImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__DEPARTMENT = eINSTANCE.getAdmin_Department();

		/**
		 * The meta object literal for the '<em><b>Manage Inventory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___MANAGE_INVENTORY = eINSTANCE.getAdmin__ManageInventory();

		/**
		 * The meta object literal for the '<em><b>Generate Reports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___GENERATE_REPORTS = eINSTANCE.getAdmin__GenerateReports();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.VIPCustomerImpl <em>VIP Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.VIPCustomerImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getVIPCustomer()
		 * @generated
		 */
		EClass VIP_CUSTOMER = eINSTANCE.getVIPCustomer();

		/**
		 * The meta object literal for the '<em><b>Discount Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIP_CUSTOMER__DISCOUNT_RATE = eINSTANCE.getVIPCustomer_DiscountRate();

		/**
		 * The meta object literal for the '<em><b>Apply Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIP_CUSTOMER___APPLY_DISCOUNT = eINSTANCE.getVIPCustomer__ApplyDiscount();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.InventoryImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Low Stock Products</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__LOW_STOCK_PRODUCTS = eINSTANCE.getInventory_LowStockProducts();

		/**
		 * The meta object literal for the '<em><b>Update Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVENTORY___UPDATE_STOCK = eINSTANCE.getInventory__UpdateStock();

		/**
		 * The meta object literal for the '<em><b>Check Availability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVENTORY___CHECK_AVAILABILITY = eINSTANCE.getInventory__CheckAvailability();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ShippableImpl <em>Shippable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ShippableImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getShippable()
		 * @generated
		 */
		EClass SHIPPABLE = eINSTANCE.getShippable();

		/**
		 * The meta object literal for the '<em><b>Estimate Shipping Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHIPPABLE___ESTIMATE_SHIPPING_COST = eINSTANCE.getShippable__EstimateShippingCost();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.PaymentImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__ID = eINSTANCE.getPayment_Id();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '<em><b>Payment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_DATE = eINSTANCE.getPayment_PaymentDate();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_METHOD = eINSTANCE.getPayment_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Process Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___PROCESS_PAYMENT = eINSTANCE.getPayment__ProcessPayment();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.OrderItemImpl <em>Order Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.OrderItemImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getOrderItem()
		 * @generated
		 */
		EClass ORDER_ITEM = eINSTANCE.getOrderItem();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__QUANTITY = eINSTANCE.getOrderItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sub Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SUB_TOTAL = eINSTANCE.getOrderItem_SubTotal();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__PRODUCT = eINSTANCE.getOrderItem_Product();

		/**
		 * The meta object literal for the '<em><b>Calculate Sub Total</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER_ITEM___CALCULATE_SUB_TOTAL = eINSTANCE.getOrderItem__CalculateSubTotal();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.PhysicalProductImpl <em>Physical Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.PhysicalProductImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getPhysicalProduct()
		 * @generated
		 */
		EClass PHYSICAL_PRODUCT = eINSTANCE.getPhysicalProduct();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PRODUCT__WEIGHT = eINSTANCE.getPhysicalProduct_Weight();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PRODUCT__DIMENSIONS = eINSTANCE.getPhysicalProduct_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Calculate Shipping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PHYSICAL_PRODUCT___CALCULATE_SHIPPING = eINSTANCE.getPhysicalProduct__CalculateShipping();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.DigitalProductImpl <em>Digital Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.DigitalProductImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getDigitalProduct()
		 * @generated
		 */
		EClass DIGITAL_PRODUCT = eINSTANCE.getDigitalProduct();

		/**
		 * The meta object literal for the '<em><b>Download Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_PRODUCT__DOWNLOAD_LINK = eINSTANCE.getDigitalProduct_DownloadLink();

		/**
		 * The meta object literal for the '<em><b>Generate Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIGITAL_PRODUCT___GENERATE_LINK = eINSTANCE.getDigitalProduct__GenerateLink();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.DownloadableImpl <em>Downloadable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.DownloadableImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getDownloadable()
		 * @generated
		 */
		EClass DOWNLOADABLE = eINSTANCE.getDownloadable();

		/**
		 * The meta object literal for the '<em><b>Provide Download Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOWNLOADABLE___PROVIDE_DOWNLOAD_LINK = eINSTANCE.getDownloadable__ProvideDownloadLink();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ReviewImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__RATING = eINSTANCE.getReview_Rating();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__COMMENT = eINSTANCE.getReview_Comment();

		/**
		 * The meta object literal for the '<em><b>Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__REVIEW_DATE = eINSTANCE.getReview_ReviewDate();

		/**
		 * The meta object literal for the '<em><b>Update Review</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REVIEW___UPDATE_REVIEW = eINSTANCE.getReview__UpdateReview();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.StateMachine28Impl <em>State Machine28</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.StateMachine28Impl
		 * @see Ecommerce.impl.EcommercePackageImpl#getStateMachine28()
		 * @generated
		 */
		EClass STATE_MACHINE28 = eINSTANCE.getStateMachine28();

	}

} //EcommercePackage
