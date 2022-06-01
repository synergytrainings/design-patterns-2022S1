package com.synisys.abstractFactory;

public abstract class AbstractShapeFactory {
    public abstract NDimensionalShape createShape(Shape shape, double sideOrRadius);

    public static AbstractShapeFactory getFactory(Dimension dimension) {
        switch (dimension) {
            case Two:
                return new TwoDimensionalShapeFactory();
            case Three:
                return new ThreeDimensionalShapeFactory();
            default:
                throw new IllegalArgumentException(String.format("Dimension %s is not implemented.", dimension));
        }
    }
}
