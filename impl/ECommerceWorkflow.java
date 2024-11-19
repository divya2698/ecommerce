package Ecommerce.impl;

public class ECommerceWorkflow {
    public static void main(String[] args) {
        // Step 1: User logs in
        CustomerImpl customerAkbar = new CustomerImpl();
        customerAkbar.setEmail("akbarAli@gmail.com");
        customerAkbar.setId(1001);
        customerAkbar.setUsername("akbar911");
        customerAkbar.setPassword("akbarLol");
        
        customerAkbar.login();

        // Step 2: Browsing and adding products to the cart
        ProductImpl pizza = new ProductImpl();
        pizza.setId(2001);
        pizza.setName("Pizza");
        pizza.setPrice(12.99);
        
        ProductImpl burger = new ProductImpl();
        burger.setId(2002);
        burger.setName("Burger");
        burger.setPrice(8.99);
        
        ProductImpl soda = new ProductImpl();
        soda.setId(3002);
        soda.setName("Soda");
        soda.setPrice(1.99);
        
        ShoppingCartImpl cart = new ShoppingCartImpl();
        cart.addItem(pizza);
        cart.addItem(burger);
        cart.addItem(soda);
        customerAkbar.setShoppingcart(cart);
        
        // Step 3: View cart and proceed to checkout
        System.out.println("Total items in cart: " + cart.getProduct().size());
        System.out.println("Cart total: $" + cart.getTotal());

        // Step 4: Entering customer information
        OrderImpl currOrder = new OrderImpl();
        currOrder.setId(3001);
        currOrder.setOrderedProducts(cart.getProduct());
        customerAkbar.placeOrder(currOrder);
        
     
        // Step 5: Payment processing
        PaymentImpl payment = new PaymentImpl();
        payment.setId(4001);
        payment.setAmount(cart.getTotal());
        
        if (payment.processPayment()) {
            System.out.println("Order successfully processed!");
        } else {
            System.out.println("Order failed due to payment issues.");
        }

        // Step 6: Order confirmation
        System.out.println("Order confirmed. Thank you for shopping!");
    }
}