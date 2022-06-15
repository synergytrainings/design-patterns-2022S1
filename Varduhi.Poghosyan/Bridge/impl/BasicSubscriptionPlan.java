package impl;

import api.SubscriptionPlan;

public class BasicSubscriptionPlan implements SubscriptionPlan {
    @Override
    public String getSubscriptionPlanDetails() {
        return "Basic subscription plan is selected";
    }
}
