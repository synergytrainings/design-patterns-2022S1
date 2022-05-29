package com.synisys.patterns.abstractFactory.model;

import com.synisys.patterns.abstractFactory.Furniture;

public class Chair implements Furniture {
    private  String frameMaterial;
    private String seatingAreaMaterial;

    public Chair(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public void setSeatingAreaMaterial(String seatingAreaMaterial) {
        this.seatingAreaMaterial = seatingAreaMaterial;
    }

    public String getSeatingAreaMaterial() {
        return seatingAreaMaterial;
    }


    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void drawDesign() {
        System.out.println( "drawDesign" + " Chair{" +
                "frameMaterial='" + frameMaterial + '\'' +
                ", seatingAreaMaterial='" + seatingAreaMaterial + '\'' +
                '}');
    }


}
