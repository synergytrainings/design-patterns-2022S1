package com.synisys.patterns.abstractFactory.model.classic;

import com.synisys.patterns.abstractFactory.model.Table;

public class ClassicTable extends Table {


    public ClassicTable(String frameMaterial) {
        super(frameMaterial);
    }


    public void drawDesign() {
        System.out.println( "drawDesign" + " ClassicTable{" +
                "frame material is '" + this.getFrameMaterial() + '\'' +
                ", shape is'" + this.getShape() + '\'' +
                '}');
    }
}
