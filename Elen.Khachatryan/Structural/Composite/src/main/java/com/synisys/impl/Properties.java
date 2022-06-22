package src.main.java.com.synisys.impl;

import src.main.java.com.synisys.api.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Properties implements Property {
    private List<Property> properties;

    public Properties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Property> getProperties() {
        return properties;
    }

    @Override
    public Property findFirstMatch(String key) {
        key = Objects.requireNonNull(key);
        Optional<Property> property = this.find(key).stream().findFirst();
        return property.orElse(null);
    }

    @Override
    public List<Property> find(String key) {
        List<Property> properties = new ArrayList<>();

        for (Property property : this.properties) {
            properties.addAll(property.find(key));
        }

        return properties;
    }

    @Override
    public String toString() {
        return "{" +
                properties +
                "}";
    }
}
