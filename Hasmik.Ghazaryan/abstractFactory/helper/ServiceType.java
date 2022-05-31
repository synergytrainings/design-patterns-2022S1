package main.java.com.synisys.abstractFactory.helper;

public enum ServiceType {

    ECONOMY("Economy"), STANDARD("Standard"), LUX("Lux");

    public final String name;

    ServiceType(String name) {
        this.name = name;
    }

}
