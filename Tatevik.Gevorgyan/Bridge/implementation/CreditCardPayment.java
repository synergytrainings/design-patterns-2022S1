package implementation;

import abstraction.Payment;
import abstraction.PaymentSystem;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void makePayment() {
        paymentSystem.processPayment("Credit card Payment");
    }
}
