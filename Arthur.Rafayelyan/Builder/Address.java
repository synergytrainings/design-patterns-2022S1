package Builder;

import java.util.Objects;

public class Address {
    private final String street;
    private final String city;
    private final String state;
    private final String pin;

    public Address(String street, String city, String state, String pin) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(pin, address.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, pin);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
