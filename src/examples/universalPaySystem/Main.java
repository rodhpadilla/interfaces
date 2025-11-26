package examples.universalPaySystem;

public class Main {
    public static void main(String[] args) {
        double myTotalMoney = 100.00;
        CheckoutService checkoutService = new CheckoutService();

        System.out.println("Currency: " + PaymentProcessor.DEFAULT_CURRENCY);
        if (!PaymentProcessor.isValid(myTotalMoney)) {
            System.out.println("Amount is invalid!");
        } else {
            double halfMoney = myTotalMoney / 2;

            // customer1: PayPal
            PaymentProcessor paypal = new PayPalProcessor();
            checkoutService.checkout(paypal, halfMoney);
            paypal.printReceipt(halfMoney);

            // customer2: Credit Card
            PaymentProcessor creditCard = new CreditCardProcessor();
            checkoutService.checkout(creditCard, halfMoney);
            creditCard.printReceipt(halfMoney);
        }



    }
}
