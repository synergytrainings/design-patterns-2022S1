package com.synisys.abstractFactory;

public class Circle implements TwoDimensionalShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        System.out.println("Circle area is: " + Math.PI * radius * radius);
    }
}
