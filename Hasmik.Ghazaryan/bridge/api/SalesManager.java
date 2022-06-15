package api;

import impl.Client;

public interface SalesManager {

    void notifyClients(String message);
    boolean placeOrder(String code, Client clientInfo);
}
