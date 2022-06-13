package implementation;

import abstraction.PaymentSystem;

public class StripePaymentSystem implements PaymentSystem {
    @Override
    public void processPayment(String payment) {
        System.out.println("Using Stripe payment gateway for " + payment);
    }
}
