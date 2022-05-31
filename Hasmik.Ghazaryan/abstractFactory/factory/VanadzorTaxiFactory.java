package main.java.com.synisys.abstractFactory.factory;

import main.java.com.synisys.abstractFactory.Taxi;
import main.java.com.synisys.abstractFactory.helper.Location;
import main.java.com.synisys.abstractFactory.helper.ServiceType;
import main.java.com.synisys.abstractFactory.model.EconomyTaxi;
import main.java.com.synisys.abstractFactory.model.LuxTaxi;
import main.java.com.synisys.abstractFactory.model.StandardTaxi;

public class VanadzorTaxiFactory {

    public Taxi orderTaxi(ServiceType serviceType) {
        switch (serviceType) {
            case ECONOMY:
                Taxi economyTaxi  = new EconomyTaxi();
                economyTaxi.setIncludedDistance(Location.VANADZOR.includedDistance);
                return economyTaxi;
            case STANDARD:
                Taxi standardTaxi  = new StandardTaxi();
                standardTaxi.setIncludedDistance(Location.VANADZOR.includedDistance);
                return standardTaxi;
            case LUX:
                Taxi luxTaxi  = new LuxTaxi();
                luxTaxi.setIncludedDistance(Location.VANADZOR.includedDistance);
                return luxTaxi;
            default:
                throw new IllegalArgumentException(
                        String.format("Service type %s is not supported in Vanadzor", serviceType.name));

        }
    }
}
