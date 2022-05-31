package Builder.traditional;

import Builder.Address;
import Builder.Person;

public class PersonBuilder {
    private String salutation;
    private String firstName;
    private String lastName;
    private Address address;
    private boolean isFemale;
    private boolean isHomeOwner;

    public PersonBuilder withSalutation(String salutation) {
        this.salutation = salutation;
        return this;
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    public PersonBuilder withIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
        return this;
    }

    public PersonBuilder withIsHomeOwner(boolean isHomeOwner) {
        this.isHomeOwner = isHomeOwner;
        return this;
    }

    public Person createPerson() {
        return new Person(salutation, firstName, lastName, address, isFemale, isHomeOwner);
    }
}
