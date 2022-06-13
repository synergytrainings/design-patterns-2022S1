package implementation;

import abstraction.Payment;
import abstraction.PaymentSystem;

public class DebitCardPayment extends Payment {

    public DebitCardPayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void makePayment() {
        paymentSystem.processPayment("Debit Card Payment");
    }
}
