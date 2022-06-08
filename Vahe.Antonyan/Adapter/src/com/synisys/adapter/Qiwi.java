package com.synisys.adapter;

import java.math.BigDecimal;

public class Qiwi implements PaymentSystem {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Sending payment via Qiwi.");
    }
}