package src.main.java.com.synisys.impl;

import src.main.java.com.synisys.api.Property;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleProperty<T> implements Property {
    private final String key;
    private T value;

    public SingleProperty(String key, T value) {
        this.key = Objects.requireNonNull(key);
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public Property findFirstMatch(String key) {
        key = Objects.requireNonNull(key);
        return this.key.equals(key) ? this : null;
    }

    @Override
    public List<Property> find(String key) {
        Property property = this.findFirstMatch(key);
        return property != null ? Stream.of(property).collect(Collectors.toList()) : Collections.emptyList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleProperty<?> that = (SingleProperty<?>) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "{" +
                "\"" + key + "\":\t" + value +
                '}';
    }
}
