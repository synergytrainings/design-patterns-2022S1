import api.StreamingServiceSubscription;
import impl.BasicSubscriptionPlan;
import impl.NetflixSubscription;
import impl.PremiumSubscriptionPlan;
import impl.SpotifySubscription;

import java.util.ArrayList;
import java.util.List;

public class StreamingServiceSubscriptionDemo {
    public static void main(String args[]) {
        List<StreamingServiceSubscription> userSubscriptions = new ArrayList<>();
        userSubscriptions.add(new NetflixSubscription(new BasicSubscriptionPlan()));
        userSubscriptions.add(new SpotifySubscription(new PremiumSubscriptionPlan()));

        Double monthlySubscriptionsCost = 0.;
        for (StreamingServiceSubscription subscription : userSubscriptions) {
            monthlySubscriptionsCost += subscription.getSubscriptionCost();
            System.out.println(String.format("=======> %s; Subscription cost: %s",
                    subscription.getSubscriptionPlan().getSubscriptionPlanDetails(), subscription.getSubscriptionCost()));
        }
        System.out.println(String.format("Monthly subscription's const: $%s", monthlySubscriptionsCost));
    }
}
