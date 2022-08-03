package com.synisys.patterns.decorator.impl;

import com.synisys.patterns.decorator.Building;
import com.synisys.patterns.decorator.HolidayDecorator;

public class ChristmasDecorator extends HolidayDecorator {

    public ChristmasDecorator(Building building) {
        super(building, "Dec 25");
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithLights();
    }

    private String decorateWithLights() {
        return " decorate with Lights";
    }

}
