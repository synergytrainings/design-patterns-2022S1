package com.synisys.patterns;

/**
 * Created by emma.sargsyan
 */
public abstract class PersonDecorator implements Person{

    private Person person;

    public PersonDecorator(Person person){
        this.person = person;
    }

    @Override
    public String decorate() {
        return person.decorate();
    }

}
