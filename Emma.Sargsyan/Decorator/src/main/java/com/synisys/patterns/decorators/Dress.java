package com.synisys.patterns.decorators;

import com.synisys.patterns.Person;
import com.synisys.patterns.PersonDecorator;

/**
 * Created by emma.sargsyan
 */
public class Dress extends PersonDecorator {

    private String color;

    public Dress(Person order, String color) {
        super(order);
        this.color = color;
    }

    @Override
    public String decorate() {
        return String.format("%s with %s dress", super.decorate(), color);
    }

}