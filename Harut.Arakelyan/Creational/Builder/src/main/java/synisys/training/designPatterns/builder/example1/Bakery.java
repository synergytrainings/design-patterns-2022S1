package synisys.training.designPatterns.builder.example1;

import synisys.training.designPatterns.builder.example1.bakeryIngredients.*;

import java.util.Objects;

/**
 * @author harut.arakelyan
 */
public class Bakery {

    //required fields
    private final BakeryType bakeryType;
    private final double flour;
    private final double water;

    //optional fields
    private  String spices;
    private  String flavorings;

    private  double salt;
    //fields that will use only after adding salt
    private  double bakingSoda;
    private  double yeast;

    private  double sugar;
    //fields that will use only after adding sugar
    private  double eggs;
    private  double dairy;

    public static class BakeryBuilder implements Salt, Eggs, Dairy, BakingSoda, Sugar, Yeast {

        //required fields
        private final BakeryType bakeryType;
        private final double flour;
        private final double water;

        //optional fields
        private  String spices;
        private  String flavorings;

        private  double salt;
        //fields that will use only after adding salt
        private  double bakingSoda;
        private  double yeast;

        private  double sugar;
        //fields that will use only after adding sugar
        private  double eggs;
        private  double dairy;

        public BakeryBuilder(BakeryType bakeryType, double flour, double water) {
            this.bakeryType = Objects.requireNonNull(bakeryType) ;
            this.flour = Objects.requireNonNull(flour);
            this.water = Objects.requireNonNull(water);
        }

        @Override
        public Yeast addBakingSoda(double soda) {
            this.bakingSoda = soda;
            return this;
        }

        @Override
        public BakeryBuilder addDairy(double dairy) {
            this.dairy = dairy;
            return this;
        }

        @Override
        public Dairy addEggs(double eggs) {
            this.eggs = eggs;
            return this;
        }

        @Override
        public BakingSoda addSalt(double salt) {
            this.salt = salt;
            return this;
        }

        @Override
        public Eggs addSugar(double sugar) {
            this.sugar = sugar;
            return this;
        }

        @Override
        public BakeryBuilder addYeast(double yeast) {
            this.yeast = yeast;
            return this;
        }

        public BakeryBuilder addSpices(String spices){
            this.spices = spices;
            return this;
        }

        public BakeryBuilder addFlavorings(String flavorings){
            this.flavorings = flavorings;
            return this;
        }

        public Bakery build(){
            return new Bakery(this);
        }
    }

    private Bakery(BakeryBuilder bakeryBuilder){
       this.bakeryType = bakeryBuilder.bakeryType;
        this.flour = bakeryBuilder.flour;
        this.water = bakeryBuilder.water;
        this.spices = bakeryBuilder.spices;
        this.flavorings = bakeryBuilder.flavorings;
        this.salt = bakeryBuilder.salt;
        this.bakingSoda = bakeryBuilder.bakingSoda;
        this.yeast = bakeryBuilder.yeast;
        this.sugar = bakeryBuilder.sugar;
        this.eggs = bakeryBuilder.eggs;
        this.dairy = bakeryBuilder.dairy;
    }

    @Override
    public String toString() {
        return "Your bakery is " + bakeryType +
                ", flour=" + flour +
                ", water=" + water +
                ", spices='" + spices + '\'' +
                ", flavorings='" + flavorings + '\'' +
                ", salt=" + salt +
                ", bakingSoda=" + bakingSoda +
                ", yeast=" + yeast +
                ", sugar=" + sugar +
                ", eggs=" + eggs +
                ", dairy=" + dairy ;
    }
}
