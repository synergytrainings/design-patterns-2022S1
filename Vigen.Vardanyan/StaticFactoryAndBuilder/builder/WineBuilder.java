package builder;

public class WineBuilder {

    private Wine wine = new Wine();

    public Crumple crumpleGrapes() {
        return new Crumple();
    }

    public class Crumple {
        private Crumple() {
//        Step 1: Crumple grapes
        }

        public Pot fillInPot() {
            return new Pot();
        }
    }

    public class Pot {
        private Pot() {
//        Step 2: Fill in grape juice in pot
        }

        public Filter filterWine() {
            return new Filter();
        }
    }

    public class Filter {
        private Filter() {
//        Step 3: After 4 weeks filter
        }

        public Bottle toBottle() {
            return new Bottle();
        }
    }

    public class Bottle {
        private Bottle() {
//        Step 4: Fill wine into bottles
        }

        public Wine build() {
            return wine;
        }
    }
}
