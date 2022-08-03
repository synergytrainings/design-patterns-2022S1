package com.synisys.patterns;

import com.synisys.patterns.decorators.Dress;
import com.synisys.patterns.decorators.Jewelry;
import com.synisys.patterns.decorators.Shoes;

/**
 * Created by emma.sargsyan
 */
public class Demo {

    public static void main(String[] args) {
        Person person1 = new Jewelry(new Dress(new PersonImpl("Anna", "Sargsyan"), "white"), "ring");
        System.out.println(person1.decorate());
        Person person2 = new Shoes(new Dress(new PersonImpl("Emma", "Sargsyan"), "red"), "white");
        System.out.println(person2.decorate());
    }

}
