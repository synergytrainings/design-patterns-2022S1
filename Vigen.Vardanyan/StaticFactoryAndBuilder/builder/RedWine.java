package builder;

import factory.EnumDegree;
import factory.EnumSweetness;

public class RedWine extends Wine {
    @Override
    public EnumDegree degree() {
        return EnumDegree.DEGREE_13;
    }

    @Override
    public EnumSweetness sweetness() {
        return EnumSweetness.DRY;
    }

    @Override
    public void drink() {
        System.out.println("Drinking red and dry wine");
    }

}
