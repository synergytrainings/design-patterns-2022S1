package com.synisys.adapter;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        PaypalAdapter paypalAdapter = new PaypalAdapter(new Paypal());
        paypalAdapter.pay(BigDecimal.TEN);

        Qiwi qiwi = new Qiwi();
        qiwi.pay(BigDecimal.ONE);
    }
}
