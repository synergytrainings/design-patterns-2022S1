package com.synisys.patterns;

/**
 * Created by emma.sargsyan
 */
public abstract class NaturalNumber {

    private NumberType numberType;

    public NaturalNumber(NumberType numberType) {
        this.numberType = numberType;
    }

    public abstract void printNumberByType();

}