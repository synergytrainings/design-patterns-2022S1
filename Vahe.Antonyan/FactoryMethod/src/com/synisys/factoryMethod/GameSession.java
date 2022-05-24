package com.synisys.factoryMethod;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;

public class GameSession {
    private final Duration duration;
    private final BigDecimal money;
    private final BigDecimal moneyDurationRatio = BigDecimal.valueOf(1.0 / 12);

    public static GameSession createFromTime(Duration duration) {
        return new GameSession(duration, BigDecimal.ZERO);
    }

    public static GameSession createFromMoney(BigDecimal money) {
        return new GameSession(Duration.ZERO, money);
    }

    private GameSession(Duration duration, BigDecimal money) {
        if(duration.isZero()){
            duration = this.getDurationFromMoney(money);
        }
        if(money.compareTo(BigDecimal.ZERO) == 0){
            money = this.getMoneyFromDuration(duration);
        }
        this.duration = duration;
        this.money = money;
    }

    private BigDecimal getMoneyFromDuration(Duration duration) {
        return BigDecimal.valueOf(duration.getSeconds()).multiply(this.moneyDurationRatio).setScale(0, RoundingMode.HALF_UP);
    }

    private Duration getDurationFromMoney(BigDecimal money) {
        return Duration.ofSeconds(money.divide(this.moneyDurationRatio,0, RoundingMode.HALF_UP).longValue());
    }

    @Override
    public String toString() {
        return "GameSession{" +
                "duration=" + duration.toString().substring(2).replaceAll("(\\d[HMS])(?!$)", "$1 ").toLowerCase() +
                ", money=" + money +
                '}';
    }
}