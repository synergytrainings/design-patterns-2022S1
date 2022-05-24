package synisys.training.designPatterns.builder.example2.builders;

import synisys.training.designPatterns.builder.example2.product.House;

/**
 * @author harut.arakelyan
 */
public class PrefabricatedHouseBuilder implements HouseBuilder{
    private House house;
    public PrefabricatedHouseBuilder() {
        this.house = new House();
    }
    @Override
    public void buildFoundation() {
        house.setFoundation("Wood, laminate, and PVC flooring");
    }
    @Override
    public void buildStructure(){
        house.setStructure("Structural steels and wooden wall panels");
    }
    @Override
    public void buildRoof(){
        house.setRoof("Roofing sheets");
    }
    @Override
    public void paintHouse(){
        house.setPainted(false);
    }
    @Override
    public void furnishHouse(){
        house.setFurnished(true);
    }
    public House getHouse() {
        return this.house;
    }
}
