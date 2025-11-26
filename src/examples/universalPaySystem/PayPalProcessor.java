package examples.universalPaySystem;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(final double amount) {
        System.out.println("Connecting to PayPal API... Charging $" + amount);
        return false;
    }
}
