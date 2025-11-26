package examples.universalPaySystem;

public class BitcoinProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(final double amount) {
        System.out.println("Redirecting to Bitcoin payment system... Charging $" + amount);
        return false;
    }
}
