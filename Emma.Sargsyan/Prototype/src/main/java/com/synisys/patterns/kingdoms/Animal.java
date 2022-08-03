package com.synisys.patterns.kingdoms;

import com.synisys.patterns.AbstractKingdom;
import com.synisys.patterns.Kingdom;

/**
 * Created by emma.sargsyan
 */
public class Animal extends AbstractKingdom {

    private String type;

    public Animal(String type) {
        super("Animal", false);
        this.type = type;
    }

    @Override
    public void printDescription() {
        System.out.println("Animal with " + type + " type");
    }

    @Override
    public Kingdom doClone() throws CloneNotSupportedException {
        return new Animal(type);
    }

    public void useOxygen(String oxygen) {
    }

}