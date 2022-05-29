package com.synisys.patterns.abstractFactory.model.classic;

import com.synisys.patterns.abstractFactory.model.Chair;

public class ClassicChair extends Chair {
    private String classicDetails;

    public ClassicChair(String frameMaterial) {
        super(frameMaterial);
    }

    public void setClassicDetails(String classicDetails) {
        this.classicDetails = classicDetails;
    }

    public String getClassicDetails() {
        return classicDetails;
    }

    @Override
    public String getSeatingAreaMaterial() {
        return super.getSeatingAreaMaterial();
    }

    public void drawDesign() {
        System.out.println( "drawDesign" + " ClassicChair{" +
                "frame material is '" + this.getFrameMaterial() + '\'' +
                ", seating area material is '" + this.getSeatingAreaMaterial() + '\'' +
                ", classic details are '" + this.classicDetails + '\'' +
                '}');
    }

}
