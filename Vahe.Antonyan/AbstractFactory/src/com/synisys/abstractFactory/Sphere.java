package com.synisys.abstractFactory;

public class Sphere implements ThreeDimensionalShape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void printVolume() {
        System.out.println("Sphere volume is: " + 4.0 / 3.0 * Math.PI * radius * radius * radius);
    }
}
