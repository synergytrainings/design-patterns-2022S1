package Builder;

import java.util.Objects;

public class Person {
    private final String salutation;
    private final String firstName;
    private final String lastName;
    private final Address address;
    private final boolean isFemale;
    private final boolean isHomeOwner;


    public Person(String salutation, String firstName, String lastName, Address address, boolean isFemale, boolean isHomeOwner) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.isFemale = isFemale;
        this.isHomeOwner = isHomeOwner;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isHomeOwner() {
        return isHomeOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isFemale == person.isFemale && isHomeOwner == person.isHomeOwner && salutation.equals(person.salutation) && firstName.equals(person.firstName) && lastName.equals(person.lastName) && address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutation, firstName, lastName, address, isFemale, isHomeOwner);
    }

    @Override
    public String toString() {
        return "Person{" +
                "salutation='" + salutation + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address.toString() +
                ", isFemale=" + isFemale +
                ", isHomeOwner=" + isHomeOwner +
                '}';
    }
}
