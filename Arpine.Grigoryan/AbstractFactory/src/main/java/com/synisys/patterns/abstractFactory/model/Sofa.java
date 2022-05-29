package com.synisys.patterns.abstractFactory.model;

import com.synisys.patterns.abstractFactory.Furniture;

public class Sofa implements Furniture {
    private int legsCount;
    private String frameMaterial;

    public Sofa(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public String getFrameMaterial() {
        return this.frameMaterial;
    }

    public void drawDesign() {
        System.out.println("drawDesign" + this.toString());
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public String toString() {
        return "Sofa{" + super.toString() +
                "legsCount=" + legsCount +
                '}';
    }
}
