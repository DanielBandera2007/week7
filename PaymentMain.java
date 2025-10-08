public class PaymentMain {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        PayPalPayment p3 = new PayPalPayment();
        p1.processPayment(29.99);
        p2.processPayment(42.50);
        p3.AuthorizationToken("asdlkfj3io4uw4");
    }
}