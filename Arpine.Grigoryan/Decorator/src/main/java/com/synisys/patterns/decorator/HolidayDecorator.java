package com.synisys.patterns.decorator;

import com.synisys.patterns.decorator.Building;

import java.util.Date;

public abstract  class HolidayDecorator implements Building {
    private Building building;
    private String holidayDate;

    public HolidayDecorator(Building building, String holidayDate)  {
       this.building = building;
       this.holidayDate = holidayDate;
    }

    public String decorate() {
        return building.decorate() + " on " + this.holidayDate ;
    }
}
