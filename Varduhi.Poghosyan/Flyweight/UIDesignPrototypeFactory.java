package Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UIDesignPrototypeFactory {

    private static final Map<String, UIDesignPrototype> keyToPrototype = new HashMap<>();

    public static UIDesignPrototype getUIPrototypeByKey(String key) {
        Objects.requireNonNull(key);
        return UIDesignPrototypeFactory.keyToPrototype.computeIfAbsent(
                key,
                absentKey -> new UIDesignPrototypeImpl(String.format("https://github.com/all-prototypes/%s", key))
        );
    }
}
