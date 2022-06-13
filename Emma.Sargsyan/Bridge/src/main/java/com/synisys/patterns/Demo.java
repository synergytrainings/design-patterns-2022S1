package com.synisys.patterns;

import com.synisys.patterns.impl.BinaryNumber;
import com.synisys.patterns.impl.DecimalNumber;
import com.synisys.patterns.impl.EvenNaturalNumber;
import com.synisys.patterns.impl.OddNaturalNumber;

/**
 * Created by emma.sargsyan
 */
public class Demo {

    public static void main(String[] args) {

        NaturalNumber evenDecimal = new EvenNaturalNumber(6, new DecimalNumber());
        NaturalNumber oddBinary = new OddNaturalNumber(3, new BinaryNumber());

        evenDecimal.printNumberByType();
        oddBinary.printNumberByType();

    }

}