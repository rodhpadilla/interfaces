package examples.universalPaySystem;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Connecting to Visa Network... Charging $" + amount);
        return true;
    }
}
