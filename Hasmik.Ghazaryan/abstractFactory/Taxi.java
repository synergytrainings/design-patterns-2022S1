package main.java.com.synisys.abstractFactory;

import main.java.com.synisys.abstractFactory.helper.ServiceType;

public abstract class Taxi {

    private ServiceType serviceType;
    private Integer minFare;
    private Integer minYearManufactured;
    private Integer includedDistance;

    public Taxi(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    protected abstract void orderTaxi();

    protected String sendNotification() {
        //Use builder to construct full notification message
        return "Your taxi is waiting for you.";
    }

    public void setMinFare(Integer minFare) {
        this.minFare = minFare;
    }

    public void setMinYearManufactured(Integer minYearManufactured) {
        this.minYearManufactured = minYearManufactured;
    }

    public void setIncludedDistance(Integer includedDistance) {
        this.includedDistance = includedDistance;
    }

}
