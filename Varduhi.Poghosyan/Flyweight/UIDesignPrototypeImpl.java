package Flyweight;

import java.util.Objects;
import java.util.UUID;

public class UIDesignPrototypeImpl implements UIDesignPrototype {


    private final UUID uuid;
    private final String implementationUrl;

    public UIDesignPrototypeImpl(String implementationUrl) {
        Objects.requireNonNull(implementationUrl);
        this.uuid = UUID.randomUUID();
        this.implementationUrl = implementationUrl;
    }

    @Override
    public void useImplementation(String user) {
        System.out.printf(
                "PROTOTYPE ID - %s: %s is using implementation of the prototype from [%s].%n",
                this.uuid.toString(),
                user,
                this.implementationUrl
        );
    }
}
