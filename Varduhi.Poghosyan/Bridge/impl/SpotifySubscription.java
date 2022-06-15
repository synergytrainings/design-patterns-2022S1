package impl;

import api.StreamingServiceSubscription;
import api.SubscriptionPlan;

public class SpotifySubscription extends StreamingServiceSubscription {


    public SpotifySubscription(SubscriptionPlan subscriptionPlan) {
        super(subscriptionPlan);
    }

    @Override
    protected void setCostBySubscriptionPlan() {
        if (this.subscriptionPlan instanceof BasicSubscriptionPlan) {
            this.subscriptionCost = 0.;
        } else if (this.subscriptionPlan instanceof PremiumSubscriptionPlan) {
            this.subscriptionCost = 9.99;
        } else {
            throw new IllegalStateException("No subscription available for selected plan.");
        }
    }
}
