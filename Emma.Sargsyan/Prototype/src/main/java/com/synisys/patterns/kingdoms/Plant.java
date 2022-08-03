package com.synisys.patterns.kingdoms;

import com.synisys.patterns.AbstractKingdom;
import com.synisys.patterns.Kingdom;

/**
 * Created by emma.sargsyan
 */
public class Plant extends AbstractKingdom {

    private String type;

    public Plant(String type) {
        super("Plant", true);
        this.type = type;
    }

    @Override
    public void printDescription() {
        System.out.println("Plant with " + type + "cell walls");
    }

    public String produceOxygen() {
        return "Oxygen";
    }

    @Override
    public Kingdom doClone() throws CloneNotSupportedException {
        return new Plant(type);
    }

}