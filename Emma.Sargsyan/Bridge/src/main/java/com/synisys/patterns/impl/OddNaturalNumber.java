package com.synisys.patterns.impl;

import com.synisys.patterns.NaturalNumber;
import com.synisys.patterns.NumberType;
import java.security.InvalidParameterException;

/**
 * Created by emma.sargsyan
 */
public class OddNaturalNumber extends NaturalNumber {

    private int value;
    private NumberType numberType;

    public OddNaturalNumber(int value, NumberType numberType) {
        super(numberType);
        if(value % 2 != 1 || value < 0) throw new InvalidParameterException(String.format("Number %d must be odd", value));
        this.value = value;
        this.numberType = numberType;
    }

    @Override()
    public void printNumberByType(){
        numberType.printNumber(value, "Odd");
    }

}