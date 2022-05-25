package builder;

public class WhiskeyBuilder {

    private Whiskey whiskey = new Whiskey();

    public Barrel prepareAlcohol() {
        return new Barrel();
    }

    public class Barrel {
        private Barrel() {
//        Step 1: Prepare alcohol and fill in barrel for whiskey
        }

        public Bottle toBottle() {
            return new Bottle();
        }
    }

    public class Bottle {
        private Bottle() {
//        Step 2: After 3 months fill into the bottles
        }

        public Whiskey build() {
            return whiskey;
        }
    }
}
