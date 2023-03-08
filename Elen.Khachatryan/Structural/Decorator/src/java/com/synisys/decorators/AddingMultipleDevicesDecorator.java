package com.synisys.decorators;

import com.synisys.Decorator;
import com.synisys.Subscription;

public class AddingMultipleDevicesDecorator implements Decorator {

    private static final double PRICE_PER_DEVICE = 20;

    private Subscription subscription;
    private int numberOfDevices;

    public AddingMultipleDevicesDecorator(Subscription subscription, int numberOfDevices) {
        this.subscription = subscription;
        this.numberOfDevices = numberOfDevices;
    }

    @Override
    public double price() {
        return (this.numberOfDevices * PRICE_PER_DEVICE) + this.subscription.price();
    }

    @Override
    public void pay() {
        this.subscription.pay();
    }

    @Override
    public String subscriptionDescription() {
        return String.format("Adding %s Devices, %s", this.numberOfDevices, this.subscription.subscriptionDescription());
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public int getNumberOfDevices() {
        return numberOfDevices;
    }

    public void setNumberOfDevices(int numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
    }
}
