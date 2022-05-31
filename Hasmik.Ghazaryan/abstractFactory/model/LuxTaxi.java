package main.java.com.synisys.abstractFactory.model;

import main.java.com.synisys.abstractFactory.Taxi;
import main.java.com.synisys.abstractFactory.helper.ServiceType;

public class LuxTaxi extends Taxi {

    public LuxTaxi() {
        super(ServiceType.LUX);
        orderTaxi();
    }

    @Override
    protected void orderTaxi() {
        setMinFare(1000);
        setMinYearManufactured(2018);
        sendNotification();
    }

}
