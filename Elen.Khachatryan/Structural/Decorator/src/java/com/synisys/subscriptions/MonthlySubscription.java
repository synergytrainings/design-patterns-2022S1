package com.synisys.subscriptions;

import com.synisys.Account;
import com.synisys.Subscription;
import com.synisys.User;

public class MonthlySubscription implements Subscription {

    private User user;

    public MonthlySubscription(User user) {
        this.user = user;
    }

    @Override
    public double price() {
        return 85.50;
    }

    @Override
    public void pay() {
        Account account = this.user.getBankAccount();
        account.setBalance(account.getBalance() - this.price());
    }

    @Override
    public String subscriptionDescription() {
        return "Monthly Subscription";
    }

    public User getUser() {
        return user;
    }
}
