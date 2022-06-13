package com.synisys.patterns.impl;

import com.synisys.patterns.NumberType;

/**
 * Created by emma.sargsyan
 */
public class DecimalNumber implements NumberType {

    @Override
    public void printNumber(Number number, String type) {
        System.out.println(String.format("%s number is %s", type, Integer.toBinaryString((Integer) number)));
    }

}