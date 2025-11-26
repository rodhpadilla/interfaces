package examples.universalPaySystem;

public class CheckoutService {
    public void checkout(PaymentProcessor processor, double total) {
        boolean success = processor.processPayment(total);

        if (success) {
            System.out.println("Order confirmed!");
        }
    }
}
