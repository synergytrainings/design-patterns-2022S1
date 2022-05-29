package com.synisys.patterns.abstractFactory.model.modern;

import com.synisys.patterns.abstractFactory.model.Chair;

public class ModernChair extends Chair {


    public ModernChair(String frameMaterial) {
        super(frameMaterial);
    }

    public void drawDesign() {
        System.out.println("drawDesign" + " ModernChair{" +
                "frame material is'" + this.getFrameMaterial() + '\'' +
                ", seating area material is'" + this.getSeatingAreaMaterial() + '\'' +
                '}');
    }

}
