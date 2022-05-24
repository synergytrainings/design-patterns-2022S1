package com.company.builder.person.traditional;

import com.company.builder.person.Address;
import com.company.builder.person.Person;
import com.company.builder.person.advanced.AdvancedPersonBuilder;
import com.company.builder.student.Student;
import com.company.builder.student.StudentStepBuilder;

public class TestBuilder {
    public static void main(String[] args) {
        /**
         *
         *  Creating Person with traditional way
         * */
        Address address = new AddressBuilder()
                .withCity("Claymont")
                .withPin("19703")
                .withStreet("950 Ridge RD C25")
                .withState("DE")
                .createAddress();
        Person traditionalPerson = new PersonBuilder()
                .withAddress(address)
                .withFirstName("John")
                .withLastName("Doe")
                .withIsFemale(false)
                .withIsHomeOwner(true)
                .withSalutation("Mr.")
                .createPerson();
        System.out.println(traditionalPerson);

        /**
         *
         *  Creating Person with advanced way
         * */

        Address mockAddress = new Address("950 Ridge RD C25","Claymont","Delaware","19703");
        Person mockPerson = new Person("Mr.","John","Doe",mockAddress,false,true);


        Person person = new AdvancedPersonBuilder()
                .with($ -> {
                    $.salutation = "Mr.";
                    $.firstName = "John";
                    $.middleName = "Mark";
                    $.lastName  = "Doe";
                    $.isFemale = false;
                })
                .with($ -> $.isHomeOwner = true)
                .with($ -> {
                    $.address =
                            new AdvancedPersonBuilder.AddressBuilder()
                                    .with($_address -> {
                                        $_address.street = "950 Ridge RD C25";
                                        $_address.city = "Claymont";
                                        $_address.state = "Delaware";
                                        $_address.pin = "19703";
                                    }).createAddress();
                }).createPerson();
        System.out.println(mockPerson);
        System.out.println(person);

        /**
         * Creating Student step by step
         * There is no way to set name without setting ID or set mobile without setting name ant etc.
         * */
        Student student = StudentStepBuilder
                .newBuilder()
                .setId(4)
                .setName("John")
                .setMobile("1 302 4148567")
                .setSalary(800000)
                .build();
        System.out.println(student);
    }
}
