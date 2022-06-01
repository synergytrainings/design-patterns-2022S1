package com.synisys.abstractFactory;

public class Demo {
    public static void main(String[] args) {
        AbstractShapeFactory twoDimensionalShapeFactory = AbstractShapeFactory.getFactory(Dimension.Two);
        TwoDimensionalShape circle = (TwoDimensionalShape) twoDimensionalShapeFactory.createShape(Shape.CIRCLE, 5.0);
        circle.printArea();

        TwoDimensionalShape square = (TwoDimensionalShape) twoDimensionalShapeFactory.createShape(Shape.SQUARE, 5.0);
        square.printArea();

        TwoDimensionalShape triangle = (TwoDimensionalShape) twoDimensionalShapeFactory.createShape(Shape.TRIANGLE, 5.0);
        triangle.printArea();


        AbstractShapeFactory threeDimensionalShapeFactory = AbstractShapeFactory.getFactory(Dimension.Three);
        ThreeDimensionalShape sphere = (ThreeDimensionalShape) threeDimensionalShapeFactory.createShape(Shape.CIRCLE, 5.0);
        sphere.printVolume();

        ThreeDimensionalShape cube = (ThreeDimensionalShape) threeDimensionalShapeFactory.createShape(Shape.SQUARE, 5.0);
        cube.printVolume();

        ThreeDimensionalShape tetrahedron = (ThreeDimensionalShape) threeDimensionalShapeFactory.createShape(Shape.TRIANGLE, 5.0);
        tetrahedron.printVolume();
    }
}
