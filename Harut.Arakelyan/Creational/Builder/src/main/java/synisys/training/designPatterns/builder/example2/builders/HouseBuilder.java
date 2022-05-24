package synisys.training.designPatterns.builder.example2.builders;

import synisys.training.designPatterns.builder.example2.product.House;

/**
 * @author harut.arakelyan
 */
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
