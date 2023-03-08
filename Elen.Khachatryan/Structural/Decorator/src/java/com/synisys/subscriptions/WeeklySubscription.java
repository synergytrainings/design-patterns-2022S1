package com.synisys.subscriptions;

import com.synisys.Account;
import com.synisys.Subscription;
import com.synisys.User;

public class WeeklySubscription implements Subscription {

    private User user;

    public WeeklySubscription(User user) {
        this.user = user;
    }

    @Override
    public double price() {
        return 45.50;
    }

    @Override
    public void pay() {
        Account account = this.user.getBankAccount();
        account.setBalance(account.getBalance() - this.price());
    }

    @Override
    public String subscriptionDescription() {
        return "Weekly Subscription";
    }

    public User getUser() {
        return user;
    }

}
