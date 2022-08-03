package com.synisys.patterns.decorator.impl;

import com.synisys.patterns.decorator.Building;
import com.synisys.patterns.decorator.HolidayDecorator;

public class ChildrenDayDecorator extends HolidayDecorator {

    public ChildrenDayDecorator(Building building) {
        super(building, "June 1");
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBalloons() ;
    }

    private String decorateWithBalloons() {
        return " decorate with Balloon";
    }

}
