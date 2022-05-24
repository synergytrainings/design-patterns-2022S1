package synisys.training.designPatterns.builder.example2;

import synisys.training.designPatterns.builder.example2.builders.HouseBuilder;
import synisys.training.designPatterns.builder.example2.product.House;

/**
 * @author harut.arakelyan
 */
public class ConstructionDirector {
    private HouseBuilder houseBuilder;
    public ConstructionDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();
    }
}
