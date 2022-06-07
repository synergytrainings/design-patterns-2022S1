package com.synisys.abstractFactory.impl;

import com.synisys.abstractFactory.api.AbstractDrinkFactory;
import com.synisys.helper.DrinkType;
import com.synisys.helper.Size;
import com.synisys.products.api.Drink;
import com.synisys.products.impl.Coffee;
import com.synisys.products.impl.Tea;

public class ColdDrinkFactory extends AbstractDrinkFactory {
    public Drink orderDrink(DrinkType type, Size size) {
        switch (type) {
            case TEA: {
                return new Tea(size, false);
            }
            case COFFEE: {
                return new Coffee(size, false);
            }
            default: {
                throw new IllegalArgumentException(String.format("No such Category %s. Please check your input.", type));
            }
        }
    }

}
