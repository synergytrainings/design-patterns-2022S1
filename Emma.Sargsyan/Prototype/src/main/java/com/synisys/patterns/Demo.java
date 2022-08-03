package com.synisys.patterns;

import com.synisys.patterns.kingdoms.Animal;
import com.synisys.patterns.kingdoms.Plant;

/**
 * Created by emma.sargsyan
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        AbstractKingdom dog = new Animal("dog");
        dog.printDescription();
        Kingdom newDog = dog.doClone();

        AbstractKingdom cactus = new Plant("Cactus");
        Plant newCactus = (Plant) cactus.doClone();
        System.out.println(newCactus.produceOxygen());

    }

}
