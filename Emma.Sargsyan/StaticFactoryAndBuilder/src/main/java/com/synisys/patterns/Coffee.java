package com.synisys.patterns;

import com.synisys.patterns.milk.Milk;

/**
 * Created by emma.sargsyan
 */
public class Coffee {

    private final CoffeeEnum coffeeType;
    private final int coffeeShots;
    private final Milk milk;
    private final int sugarInGram;
    private final int caramelInGram;

    private Coffee(CoffeeMaker builder) {
        coffeeType = builder.coffeeType;
        coffeeShots = builder.coffeeShots;
        milk = builder.milk;
        sugarInGram = builder.sugarInGram;
        caramelInGram = builder.caramelInGram;
    }

    @Override
    public String toString() {
        return String.format("%s coffee ready!! Coffee has %d shots, %s%d gram sugar and %d gram caramel.",
                coffeeType, coffeeShots,
                milk == null ? "" : (milk + ", "),
                sugarInGram, caramelInGram);
    }

    public static class CoffeeMaker implements CoffeeBuilders.SweetBuilders,
            CoffeeBuilders.ShotBuilders, CoffeeBuilders.MilkBuilders {

        private final CoffeeEnum coffeeType;
        private int coffeeShots = 0;
        private Milk milk = null;
        private int sugarInGram = 0;
        private int caramelInGram = 0;

        private CoffeeMaker(CoffeeEnum coffeeType, int coffeeShots) {
            this.coffeeType = coffeeType;
            this.coffeeShots = coffeeShots;
        }

        public static CoffeeBuilders.MilkBuilders getCoffeeMaker(CoffeeEnum coffeeType, int coffeeShots) {
            return new CoffeeMaker(coffeeType, coffeeShots);
        }

        @Override
        public CoffeeBuilders.SweetBuilders addMilk(Milk milk) {
            this.milk = milk;
            return this;
        }

        @Override()
        public CoffeeBuilders.ShotBuilders addSugarInGram(int sugarInGram){
            this.sugarInGram = sugarInGram;
            return this;
        }

        @Override()
        public CoffeeBuilders.ShotBuilders addCaramelInGram(int caramelInGram) {
            this.caramelInGram = caramelInGram;
            return this;
        }

        @Override()
        public Coffee build() {
            return new Coffee(this);
        }

    }

}