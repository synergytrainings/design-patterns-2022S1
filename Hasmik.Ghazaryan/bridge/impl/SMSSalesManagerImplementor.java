package impl;

import api.SalesManagerImplementor;

public class SMSSalesManagerImplementor implements SalesManagerImplementor {

    @Override
    public void sendNotification(String message) {
        System.out.println("Send notification via SMS" + message);
    }

    @Override
    public boolean receiveOrder(String code, Client clientInfo) {
        // Check in which store item with @code is available and order there
        // List of stores is dynamic could be added or changed anytime
        return true;
    }
}
