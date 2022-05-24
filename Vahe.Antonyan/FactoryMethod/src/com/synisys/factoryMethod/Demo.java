package com.synisys.factoryMethod;

import java.math.BigDecimal;
import java.time.Duration;

public class Demo {
    public static void main(String[] args) {
        GameSession gameSession = GameSession.createFromMoney(BigDecimal.valueOf(450));
        GameSession gameSession2 = GameSession.createFromTime(Duration.ofHours(1));

        System.out.println(gameSession);
        System.out.println(gameSession2);
    }
}
