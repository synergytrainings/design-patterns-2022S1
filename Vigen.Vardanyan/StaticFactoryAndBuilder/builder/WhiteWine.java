package builder;

import factory.EnumDegree;
import factory.EnumSweetness;

public class WhiteWine extends Wine {
    @Override
    public EnumDegree degree() {
        return EnumDegree.DEGREE_11;
    }

    @Override
    public EnumSweetness sweetness() {
        return EnumSweetness.SLIGHTLY_SWEET;
    }

    @Override
    public void drink() {
        System.out.println("Drinking white and slightly sweet wine");
    }

}
