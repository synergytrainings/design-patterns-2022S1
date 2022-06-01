package com.synisys.abstractFactory;

public class Tetrahedron implements ThreeDimensionalShape {
    private final double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public void printVolume() {
        System.out.println("Tetrahedron volume is: " + Math.sqrt(2.0) / 12.0 * this.side * this.side * this.side);
    }
}
