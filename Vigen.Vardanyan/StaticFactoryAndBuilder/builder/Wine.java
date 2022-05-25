package builder;

import factory.EnumDegree;
import factory.EnumSweetness;

public class Wine implements AlcoholicDrink {

    @Override
    public EnumDegree degree() {
        return null;
    }

    @Override
    public EnumSweetness sweetness() {
        return null;
    }

    @Override
    public void drink() {

    }

    @Override
    public void prepare() {
        new WineBuilder().crumpleGrapes().fillInPot().filterWine().toBottle().build();
    }

}
