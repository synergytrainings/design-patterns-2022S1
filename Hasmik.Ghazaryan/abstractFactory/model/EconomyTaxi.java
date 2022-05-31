package main.java.com.synisys.abstractFactory.model;

import main.java.com.synisys.abstractFactory.Taxi;
import main.java.com.synisys.abstractFactory.helper.ServiceType;

public class EconomyTaxi extends Taxi {

    public EconomyTaxi() {
        super(ServiceType.ECONOMY);
        orderTaxi();
    }

    @Override
    protected void orderTaxi() {
        setMinFare(600);
        setMinYearManufactured(2010);
        sendNotification();
    }

}
