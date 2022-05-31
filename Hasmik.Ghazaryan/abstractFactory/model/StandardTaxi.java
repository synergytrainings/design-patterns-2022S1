package main.java.com.synisys.abstractFactory.model;

import main.java.com.synisys.abstractFactory.Taxi;
import main.java.com.synisys.abstractFactory.helper.ServiceType;

public class StandardTaxi extends Taxi {

    public StandardTaxi() {
        super(ServiceType.STANDARD);
        orderTaxi();
    }

    @Override
    protected void orderTaxi() {
        setMinFare(800);
        setMinYearManufactured(2014);
        sendNotification();
    }

}
