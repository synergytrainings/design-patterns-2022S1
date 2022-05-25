package builder;

import factory.EnumDegree;
import factory.EnumSweetness;

public class Whiskey implements AlcoholicDrink {

    @Override
    public EnumDegree degree() {
        return EnumDegree.DEGREE_40;
    }

    @Override
    public EnumSweetness sweetness() {
        return null;
    }

    @Override
    public void drink() {
        System.out.println("Drinking whiskey");
    }

    @Override
    public void prepare() {
        new WhiskeyBuilder().prepareAlcohol().toBottle().build();
    }

}
