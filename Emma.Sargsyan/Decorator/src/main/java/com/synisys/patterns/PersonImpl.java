package com.synisys.patterns;

/**
 * Created by emma.sargsyan
 */
public class PersonImpl implements Person {

    private String firstName;
    private String lastName;

    public PersonImpl(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String decorate() {
        return String.format("%s %s is", firstName, lastName);
    }

}
