package com.synisys.patterns.abstractFactory.factory;

import com.synisys.patterns.abstractFactory.Furniture;
import com.synisys.patterns.abstractFactory.helper.FurnitureType;
import com.synisys.patterns.abstractFactory.model.classic.ClassicChair;
import com.synisys.patterns.abstractFactory.model.classic.ClassicSofa;
import com.synisys.patterns.abstractFactory.model.classic.ClassicTable;

public class ClassicFurnitureFactory extends FurnitureAbstractFactory {

    public Furniture createFurniture(FurnitureType type, String frameMaterial) {
        switch (type) {
            case Sofa:
                ClassicSofa classicSofa = new ClassicSofa(frameMaterial);
                classicSofa.setLegsCount(4);
                return classicSofa;
            case Chair:
                ClassicChair chair = new ClassicChair(frameMaterial);
                chair.setClassicDetails("Some Classic Details");
                chair.setSeatingAreaMaterial("silk");
                return chair;
            case Table:
                return new ClassicTable(frameMaterial);
            default:
                throw new IllegalArgumentException(
                        String.format("creator for type %s is not implemented.", type));

        }
    }

}
