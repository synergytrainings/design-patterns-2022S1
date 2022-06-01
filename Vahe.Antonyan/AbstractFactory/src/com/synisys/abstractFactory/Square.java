package com.synisys.abstractFactory;

public class Square implements TwoDimensionalShape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        System.out.println("Square area is: " + side * side);
    }
}
