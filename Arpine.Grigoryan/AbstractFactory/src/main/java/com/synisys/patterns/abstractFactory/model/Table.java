package com.synisys.patterns.abstractFactory.model;

import com.synisys.patterns.abstractFactory.Furniture;

public class Table implements Furniture {
    private  String frameMaterial;
    private String shape;

    public Table(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void drawDesign() {
        System.out.println( "drawDesign" + this.toString());
    }

    @Override
    public String toString() {
        return "Table{" + super.toString() +
                "shape='" + shape + '\'' +
                '}';
    }
}
