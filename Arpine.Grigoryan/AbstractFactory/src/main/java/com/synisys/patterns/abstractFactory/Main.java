package com.synisys.patterns.abstractFactory;

import com.synisys.patterns.abstractFactory.factory.FurnitureAbstractFactory;
import com.synisys.patterns.abstractFactory.helper.FurnitureType;
import com.synisys.patterns.abstractFactory.helper.FurnitureVariants;

public class Main {


    public static void main(String[] args) {

        FurnitureAbstractFactory classicFurniture = FurnitureAbstractFactory.getInstance(FurnitureVariants.Classic);
        Furniture chair = classicFurniture.createFurniture(FurnitureType.Chair, "Wood");
        chair.drawDesign();
        Furniture sofa = classicFurniture.createFurniture(FurnitureType.Sofa, "Wood");
        sofa.drawDesign();


        FurnitureAbstractFactory modernFurniture = FurnitureAbstractFactory.getInstance(FurnitureVariants.Modern);
        Furniture table = modernFurniture.createFurniture(FurnitureType.Table, "Metal");
        table.drawDesign();
    }
}
