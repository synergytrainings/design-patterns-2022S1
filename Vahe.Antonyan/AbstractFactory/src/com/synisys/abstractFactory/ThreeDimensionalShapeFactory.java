package com.synisys.abstractFactory;

public class ThreeDimensionalShapeFactory extends AbstractShapeFactory {
    @Override
    public ThreeDimensionalShape createShape(Shape shape, double sideOrRadius) {
        switch (shape) {
            case CIRCLE:
                return new Sphere(sideOrRadius);
            case SQUARE:
                return new Cube(sideOrRadius);
            case TRIANGLE:
                return new Tetrahedron(sideOrRadius);
            default:
                throw new IllegalArgumentException(String.format("Shape %s is not implemented.", shape));
        }
    }
}
