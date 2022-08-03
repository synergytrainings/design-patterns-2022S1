package com.synisys.patterns.decorators;

import com.synisys.patterns.Person;
import com.synisys.patterns.PersonDecorator;

/**
 * Created by emma.sargsyan
 */
public class Jewelry extends PersonDecorator {

    private String type;

    public Jewelry(Person order, String type) {
        super(order);
        this.type = type;
    }

    @Override
    public String decorate() {
        return String.format("%s with %s", super.decorate(), type);
    }

}