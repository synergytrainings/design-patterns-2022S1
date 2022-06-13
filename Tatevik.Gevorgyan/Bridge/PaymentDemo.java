import abstraction.Payment;
import implementation.CreditCardPayment;
import implementation.DebitCardPayment;
import implementation.PayPalPaymentSystem;
import implementation.StripePaymentSystem;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment order1 = new CreditCardPayment(new StripePaymentSystem());
        order1.makePayment();

        Payment order2 = new DebitCardPayment(new PayPalPaymentSystem());
        order2.makePayment();
    }
}
