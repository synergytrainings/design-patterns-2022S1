package com.synisys.patterns.abstractFactory.factory;

import com.synisys.patterns.abstractFactory.Furniture;
import com.synisys.patterns.abstractFactory.helper.FurnitureType;
import com.synisys.patterns.abstractFactory.model.modern.ModernChair;
import com.synisys.patterns.abstractFactory.model.modern.ModernSofa;
import com.synisys.patterns.abstractFactory.model.modern.ModernTable;

public class ModernFurnitureFactory extends FurnitureAbstractFactory {
    public Furniture createFurniture(FurnitureType type, String frameMaterial) {
        switch (type) {
            case Sofa:
                ModernSofa modernSofa = new ModernSofa(frameMaterial);
                modernSofa.setLegsCount(5);
                return modernSofa;
            case Table:
               ModernTable table = new ModernTable(frameMaterial);
               table.setLegsStyle("Some Style");
               return table;
            case Chair:
                return new ModernChair(frameMaterial);
            default:
                throw new IllegalArgumentException(
                        String.format("creator for type %s is not implemented.", type));

        }
    }


}
