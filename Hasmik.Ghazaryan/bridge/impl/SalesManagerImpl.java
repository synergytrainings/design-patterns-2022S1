package impl;

import api.SalesManager;
import api.SalesManagerImplementor;

public class SalesManagerImpl implements SalesManager {

    private final SalesManagerImplementor salesManager;

    public SalesManagerImpl(SalesManagerImplementor implementor) {
        super();
        this.salesManager = implementor;
    }

    @Override
    public void notifyClients(String message)
    {
        salesManager.sendNotification(message);
    }

    @Override
    public boolean placeOrder(String itemCode, Client clientInfo)
    {
        return salesManager.receiveOrder(itemCode, clientInfo);
    }
}
