package Builder.advanced;

import Builder.Address;
import Builder.Person;

import java.util.function.Consumer;

public class AdvancedPersonBuilder {
    public String salutation;
    public String firstName;
    public String middleName;
    public String lastName;
    public Address address;
    public boolean isFemale;
    public boolean isHomeOwner;

    public AdvancedPersonBuilder with(Consumer<AdvancedPersonBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Person createPerson() {
        return new Person(salutation, firstName,lastName,  address, isFemale,isHomeOwner);
    }

    public static class AddressBuilder {
        public String street;
        public String city;
        public String state;
        public String pin;

        public AddressBuilder with(Consumer<AddressBuilder> builderFunction) {
            builderFunction.accept(this);
            return this;
        }

        public Address createAddress() {
            return new Address(street, city, state, pin);
        }

    }


}