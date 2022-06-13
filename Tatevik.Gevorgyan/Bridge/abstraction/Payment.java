package abstraction;

public abstract class Payment {

    protected PaymentSystem paymentSystem;

    protected Payment(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    abstract public void makePayment();
}
