package com.synisys.patterns.decorator;

import com.synisys.patterns.decorator.impl.ChildrenDayDecorator;
import com.synisys.patterns.decorator.impl.ChristmasDecorator;
import com.synisys.patterns.decorator.impl.House;
import com.synisys.patterns.decorator.impl.SaintValentineDecorator;

public class Main {
    public static void main(String[] args) {
        Building building = new House("House1");

        ChildrenDayDecorator childrenDayDecorator = new ChildrenDayDecorator(building);
        System.out.println(childrenDayDecorator.decorate());

        SaintValentineDecorator saintValentineDecorator = new SaintValentineDecorator(building);
        System.out.println(saintValentineDecorator.decorate());

        ChristmasDecorator christmasDecorator = new ChristmasDecorator(building);
        System.out.println(christmasDecorator.decorate());

    }

}
