package com.synisys.patterns;

/**
 * Created by emma.sargsyan
 */
public abstract class AbstractKingdom implements Kingdom {

    private String name;
    private boolean chlorophyll;

    public AbstractKingdom(String name, boolean chlorophyll) {
        this.name = name;
        this.chlorophyll = chlorophyll;
    }

    public abstract void printDescription();

}
