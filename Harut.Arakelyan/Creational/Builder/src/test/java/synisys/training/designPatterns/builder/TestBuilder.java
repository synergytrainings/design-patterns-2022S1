package synisys.training.designPatterns.builder;

import org.junit.Test;
import synisys.training.designPatterns.builder.example1.Bakery;
import synisys.training.designPatterns.builder.example1.BakeryType;
import synisys.training.designPatterns.builder.example2.ConstructionDirector;
import synisys.training.designPatterns.builder.example2.builders.ConcreteHouseBuilder;
import synisys.training.designPatterns.builder.example2.builders.HouseBuilder;
import synisys.training.designPatterns.builder.example2.builders.PrefabricatedHouseBuilder;
import synisys.training.designPatterns.builder.example2.product.House;

/**
 * @author harut.arakelyan
 */

public class TestBuilder {

    @Test
    public void testBakeryBuilder(){
        Bakery bread = new Bakery.BakeryBuilder(BakeryType.BREAD, 10, 2)
                .addSalt(0.5)
                .addBakingSoda(0.2)
                .addYeast(2)
                .addFlavorings("Some Flavorings")
                .build();

        Bakery cookie = new Bakery.BakeryBuilder(BakeryType.COOKIE, 5, 1)
                .addSugar(0.8)
                .addEggs(4)
                .addDairy(2)
                .addSpices("Some species")
                .addFlavorings("Some Flavorings")
                .build();

        System.out.println(bread);
        System.out.println(cookie);
    }

    @Test
    public void testHouseBuilder() {

        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionDirector director1 = new ConstructionDirector(concreteHouseBuilder);
        House concreteHouse = director1.constructHouse();
        System.out.println("House is: "+ concreteHouse);


        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionDirector director2 = new ConstructionDirector(prefabricatedHouseBuilder);
        House prefabricatedHouse = director2.constructHouse();
        System.out.println("House is: "+prefabricatedHouse);
    }
}
