package impl;

import api.SubscriptionPlan;

public class PremiumSubscriptionPlan implements SubscriptionPlan {
    @Override
    public String getSubscriptionPlanDetails() {
        return "Premium subscription plan is selected";
    }
}
