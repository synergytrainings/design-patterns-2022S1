package impl;

import api.StreamingServiceSubscription;
import api.SubscriptionPlan;

public class NetflixSubscription extends StreamingServiceSubscription {

    public NetflixSubscription(SubscriptionPlan subscriptionPlan) {
        super(subscriptionPlan);
    }

    @Override
    protected void setCostBySubscriptionPlan() {
        if (this.subscriptionPlan instanceof BasicSubscriptionPlan) {
            this.subscriptionCost = 11.99;
        } else if (this.subscriptionPlan instanceof PremiumSubscriptionPlan) {
            this.subscriptionCost = 15.99;
        } else {
            throw new IllegalStateException("No subscription available for selected plan.");
        }
    }
}
