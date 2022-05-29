package com.synisys.patterns.abstractFactory.model.classic;

import com.synisys.patterns.abstractFactory.model.Chair;
import com.synisys.patterns.abstractFactory.model.Sofa;

public class ClassicSofa extends Sofa {


    public ClassicSofa(String frameMaterial) {
        super(frameMaterial);
    }

    public void drawDesign() {
        System.out.println( "drawDesign" + " ClassicSofa{" +
                "frame material is '" + this.getFrameMaterial() + '\'' +
                ", legs count is '" + this.getLegsCount() + '\'' +
                '}');
    }

}
