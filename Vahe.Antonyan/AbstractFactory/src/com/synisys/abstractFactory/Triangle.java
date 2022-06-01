package com.synisys.abstractFactory;

public class Triangle implements TwoDimensionalShape {
    private final double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        System.out.println("Triangle area is: " + Math.sqrt(3.0) / 4.0 * this.side * this.side);
    }
}
