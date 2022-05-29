package com.synisys.patterns.abstractFactory.factory;

import com.synisys.patterns.abstractFactory.Furniture;
import com.synisys.patterns.abstractFactory.helper.FurnitureType;
import com.synisys.patterns.abstractFactory.helper.FurnitureVariants;

public abstract class FurnitureAbstractFactory {
    public abstract Furniture createFurniture(FurnitureType type,  String frameMaterial) ;

    public static FurnitureAbstractFactory getInstance(FurnitureVariants variants) {
        switch (variants) {
            case Classic:
                return new ClassicFurnitureFactory();
            case Modern:
                return new ModernFurnitureFactory();
            default:
                throw new IllegalArgumentException(
                        String.format("creator for type %s is not implemented.", variants));

        }
    }

}
