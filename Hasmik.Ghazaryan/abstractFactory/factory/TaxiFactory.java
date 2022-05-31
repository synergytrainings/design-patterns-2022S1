package main.java.com.synisys.abstractFactory.factory;

import main.java.com.synisys.abstractFactory.Taxi;
import main.java.com.synisys.abstractFactory.helper.Location;
import main.java.com.synisys.abstractFactory.helper.ServiceType;

public class TaxiFactory {

    public static void orderTaxi(ServiceType serviceType) {
        Taxi taxi = null;

        // Get location from GPS
        Location location = Location.YEREVAN;

        switch (location) {
            case YEREVAN:
                new YerevanTaxiFactory().orderTaxi(serviceType);
                break;
            case GYUMRI:
                new GyumriTaxiFactory().orderTaxi(serviceType);
                break;
            case VANADZOR:
                new VanadzorTaxiFactory().orderTaxi(serviceType);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("Service is not supported in %s", location.name));
        }
    }
}
