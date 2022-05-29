package com.synisys.patterns.abstractFactory.model.modern;

import com.synisys.patterns.abstractFactory.model.Chair;
import com.synisys.patterns.abstractFactory.model.Table;

public class ModernTable extends Table {
    private String modernLegsStyle;

    public ModernTable(String frameMaterial) {
        super(frameMaterial);
    }

    public String getLegsStyle() {
        return modernLegsStyle;
    }

    public void setLegsStyle(String modernLegsStyle) {
        this.modernLegsStyle = modernLegsStyle;
    }

    public void drawDesign() {
        System.out.println("drawDesign" + " ModernTable{" +
                "frame material is '" + this.getFrameMaterial() + '\'' +
                ", modern legs style  is '" + this.modernLegsStyle + '\'' +
                '}');
    }


}
