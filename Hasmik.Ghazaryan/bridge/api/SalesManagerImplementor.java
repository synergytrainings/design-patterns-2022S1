package api;

import impl.Client;

public interface SalesManagerImplementor {

    void sendNotification(String message);
    boolean receiveOrder(String code, Client clientInfo);
}
