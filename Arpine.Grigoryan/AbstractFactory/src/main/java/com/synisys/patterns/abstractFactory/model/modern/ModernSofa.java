package com.synisys.patterns.abstractFactory.model.modern;

import com.synisys.patterns.abstractFactory.model.Sofa;

public class ModernSofa extends Sofa {


    public ModernSofa(String frameMaterial) {
        super(frameMaterial);
    }


    public void drawDesign() {
        System.out.println( "drawDesign" + " ModernSofa{" +
                "frame material is '" + this.getFrameMaterial() + '\'' +
                ", legs count is'" + this.getLegsCount() + '\'' +
                '}');
    }
}
