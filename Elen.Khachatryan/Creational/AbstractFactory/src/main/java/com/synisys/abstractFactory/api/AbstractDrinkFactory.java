package com.synisys.abstractFactory.api;

import com.synisys.abstractFactory.impl.ColdDrinkFactory;
import com.synisys.abstractFactory.impl.HotDrinkFactory;
import com.synisys.helper.Categories;
import com.synisys.helper.DrinkType;
import com.synisys.helper.Size;
import com.synisys.products.api.Drink;

public abstract class AbstractDrinkFactory {
    public abstract Drink orderDrink(DrinkType type, Size size) ;

    public static AbstractDrinkFactory getInstance(Categories category) {
        switch (category) {
            case HOT: {
                return new HotDrinkFactory();
            }
            case COLD:{
                return new ColdDrinkFactory();
            }
            case UNKNOWN: default:
                throw new IllegalArgumentException(String.format("No such Category %s. Please check your input.", category));

        }
    }
}
