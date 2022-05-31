package main.java.com.synisys.abstractFactory;

import main.java.com.synisys.abstractFactory.factory.TaxiFactory;
import main.java.com.synisys.abstractFactory.helper.ServiceType;

public class Main {
    public static void main(String[] args) {

        TaxiFactory.orderTaxi(ServiceType.STANDARD);

    }
}
