package implementation;

import abstraction.PaymentSystem;

public class PayPalPaymentSystem implements PaymentSystem {
    @Override
    public void processPayment(String payment) {
        System.out.println("Using PayPal payment gateway for " + payment);
    }
}
