package com.synisys;

import com.synisys.abstractFactory.api.AbstractDrinkFactory;
import com.synisys.helper.Categories;
import com.synisys.helper.DrinkType;
import com.synisys.helper.Size;
import com.synisys.products.api.Drink;

import java.util.Scanner;

public class Demo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Select one of available categories");
        System.out.println("C - for Cold Drinks");
        System.out.println("H - for Hot Drinks");
        System.out.print("Your input: ");
        String category = scanner.next().toUpperCase();
        scanner.nextLine();
        AbstractDrinkFactory factory;
        switch (category) {
            case "C": {
                factory = AbstractDrinkFactory.getInstance(Categories.COLD);
                break;
            }
            case "H": {
                factory = AbstractDrinkFactory.getInstance(Categories.HOT);
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("You must enter 'C' or 'H', not %s", category));
            }
        }
        System.out.println("Please Select one of available drinks");
        System.out.println("T - for Tea");
        System.out.println("C - for Coffee");
        System.out.print("Your input: ");
        String type = scanner.next().toUpperCase();

        Drink drink = factory.orderDrink(type.equals("T") ? DrinkType.TEA : type.equals("C") ? DrinkType.COFFEE : DrinkType.UNKNOWN, Size.SMALL);
        System.out.println("Your drink please: " + drink);
    }
}
