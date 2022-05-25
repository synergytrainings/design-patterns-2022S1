package builder;

import factory.EnumDegree;
import factory.EnumSweetness;

public interface AlcoholicDrink {

    EnumDegree degree();

    EnumSweetness sweetness();

    void drink();

    void prepare();

}
