package com.synisys.patterns;

import com.synisys.patterns.milk.Milk;
import com.synisys.patterns.milk.MilkEnum;
import com.synisys.patterns.milk.MilkFactory;

/**
 * Created by emma.sargsyan
 */
public class Demo {

    public static void main(String[] args) {

        Milk coconutMilk = MilkFactory.getMilk(MilkEnum.COCONUT);
        Milk cowMilk = MilkFactory.getDefaultMilk();

        System.out.println(coconutMilk);
        System.out.println(cowMilk);


        Coffee coffee = Coffee.CoffeeMaker.getCoffeeMaker(CoffeeEnum.ARABICA, 1)
                .addMilk(coconutMilk)
                .addCaramelInGram(5)
        //      .addSugarInGram(5)   cannot add both sugar and caramel, this will bring to compile time error
                .build();
        System.out.println(coffee);

        Coffee coffeeWithoutMilk = Coffee.CoffeeMaker.getCoffeeMaker(CoffeeEnum.ROBUSTA, 2)
                .addSugarInGram(10)
        //      .addMilk(cowMilk)   cannot add milk after sweets, this will bring to compile time error
                .build();
        System.out.println(coffeeWithoutMilk);

    }

}