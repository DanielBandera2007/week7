public class PayPalPayment implements Payment, Authorization {
    public void processPayment(double amount) {

        System.out.println("Processing PayPal payment of $" + amount);
    }

    public void AuthorizationToken (String thisToken){
        System.out.println("Here is the authorization token: " + thisToken);
    }
}