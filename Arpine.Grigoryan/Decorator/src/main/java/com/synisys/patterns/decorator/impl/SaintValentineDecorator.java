package com.synisys.patterns.decorator.impl;

import com.synisys.patterns.decorator.Building;
import com.synisys.patterns.decorator.HolidayDecorator;

public class SaintValentineDecorator extends HolidayDecorator {

    public SaintValentineDecorator(Building building) {
        super(building, "Feb 14");
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithHearts();
    }

    private String decorateWithHearts() {
        return " decorate with Heart";
    }

}
