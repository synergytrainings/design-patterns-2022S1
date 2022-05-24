package synisys.training.designPatterns.builder.example2.builders;

import synisys.training.designPatterns.builder.example2.product.House;

/**
 * @author harut.arakelyan
 */
public class ConcreteHouseBuilder implements HouseBuilder{
    private House house;
    public ConcreteHouseBuilder() {
        this.house = new House();
    }
    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete, brick, and stone");
    }
    @Override
    public void buildStructure(){
        house.setStructure("Concrete, mortar, brick, and reinforced steel");
    }
    @Override
    public void buildRoof(){
        house.setRoof("Concrete and reinforced steel");
    }
    @Override
    public void paintHouse(){
        house.setPainted(true);
    }
    @Override
    public void furnishHouse(){
        house.setFurnished(true);
    }
    public House getHouse() {
        return this.house;
    }
}
