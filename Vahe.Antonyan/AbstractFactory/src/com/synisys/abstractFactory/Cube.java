package com.synisys.abstractFactory;

public class Cube implements ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public void printVolume() {
        System.out.println("Cube volume is: " + side * side * side);
    }
}
