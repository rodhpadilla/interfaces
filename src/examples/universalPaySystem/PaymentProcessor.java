package examples.universalPaySystem;

public interface PaymentProcessor {
    String DEFAULT_CURRENCY = "USD";

    boolean processPayment(double amount);

    default void printReceipt(double amount) {
        System.out.println("Generic Receipt: Processed " + amount + " " + DEFAULT_CURRENCY);
    }

    static boolean isValid(double amount) {
        return amount > 0;
    }
}
