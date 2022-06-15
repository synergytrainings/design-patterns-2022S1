package api;
import java.util.Objects;

public abstract class StreamingServiceSubscription {

    protected SubscriptionPlan subscriptionPlan;
    protected Double subscriptionCost;

    public StreamingServiceSubscription(SubscriptionPlan subscriptionPlan) {
        Objects.requireNonNull(subscriptionPlan);
        this.subscriptionPlan = subscriptionPlan;
        this.setCostBySubscriptionPlan();
    }

    protected abstract void setCostBySubscriptionPlan();

    public Double getSubscriptionCost() {
        return this.subscriptionCost;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        return this.subscriptionPlan;
    }
}
