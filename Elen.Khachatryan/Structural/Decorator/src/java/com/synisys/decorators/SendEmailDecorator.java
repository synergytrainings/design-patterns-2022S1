package com.synisys.decorators;

import com.synisys.Decorator;
import com.synisys.Subscription;

public class SendEmailDecorator implements Decorator {

    private Subscription subscription;

    public SendEmailDecorator(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public double price() {
        return 5 + this.subscription.price();
    }

    @Override
    public void pay() {
        this.subscription.pay();
    }

    @Override
    public String subscriptionDescription() {
        return String.format("Sending emails, %s", this.subscription.subscriptionDescription());
    }

    public Subscription getSubscription() {
        return subscription;
    }
}
