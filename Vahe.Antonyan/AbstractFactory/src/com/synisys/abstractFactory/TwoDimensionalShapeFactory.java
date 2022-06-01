package com.synisys.abstractFactory;

public class TwoDimensionalShapeFactory extends AbstractShapeFactory {
    @Override
    public TwoDimensionalShape createShape(Shape shape, double sideOrRadius) {
        switch (shape) {
            case CIRCLE:
                return new Circle(sideOrRadius);
            case SQUARE:
                return new Square(sideOrRadius);
            case TRIANGLE:
                return new Triangle(sideOrRadius);
            default:
                throw new IllegalArgumentException(String.format("Shape %s is not implemented.", shape));
        }
    }
}
