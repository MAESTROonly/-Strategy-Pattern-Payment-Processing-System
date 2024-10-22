public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment("1234-5678-9012", "John Doe"));
        cart.checkout(100.00); // Processing credit card payment

        cart.setPaymentStrategy(new PayPalPayment("john@example.com"));
        cart.checkout(200.00); // Processing PayPal payment

        cart.setPaymentStrategy(new CryptoPayment("wallet123xyz"));
        cart.checkout(300.00); // Processing cryptocurrency payment
    }
}
