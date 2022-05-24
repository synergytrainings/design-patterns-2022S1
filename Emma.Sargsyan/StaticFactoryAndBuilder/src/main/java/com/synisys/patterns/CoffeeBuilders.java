package com.synisys.patterns;

import com.synisys.patterns.milk.Milk;

/**
 * Created by emma.sargsyan
 */
public interface CoffeeBuilders {

    interface MilkBuilders {  // We can add milk, sugar and caramel
        SweetBuilders addMilk(Milk milk);

        ShotBuilders addSugarInGram(int sugarInGram);
        ShotBuilders addCaramelInGram(int caramelInGram);
    }

    interface SweetBuilders {  // We can add sugar and caramel. Milk has been added.
        ShotBuilders addSugarInGram(int sugarInGram);
        ShotBuilders addCaramelInGram(int caramelInGram);
    }


    interface ShotBuilders { // Milk and either sugar or caramel have been added.
        Coffee build();
    }

}