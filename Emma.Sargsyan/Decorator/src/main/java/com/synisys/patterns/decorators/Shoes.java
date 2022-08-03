package com.synisys.patterns.decorators;

import com.synisys.patterns.Person;
import com.synisys.patterns.PersonDecorator;

/**
 * Created by emma.sargsyan
 */
public class Shoes extends PersonDecorator {

    private String color;

    public Shoes(Person order, String color) {
        super(order);
        this.color = color;
    }

    @Override
    public String decorate() {
        return String.format("%s with %s shoes", super.decorate(), color);
    }

}