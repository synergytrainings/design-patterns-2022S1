package main.java.com.synisys.abstractFactory.helper;

public enum Location {

    YEREVAN("Yerevan", 4),
    VANADZOR("Vanadzor", 2),
    GYUMRI("Gyumri", 3);

    public final String name;
    public final Integer includedDistance;

    Location(String name, Integer includedDistance) {
        this.name = name;
        this.includedDistance = includedDistance;
    }

}
