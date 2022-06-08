package com.synisys.adapter;

import java.math.BigDecimal;

public class PaypalAdapter implements PaymentSystem {

    private final Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(BigDecimal amount) {
        this.paypal.sendPayment(amount);
    }
}