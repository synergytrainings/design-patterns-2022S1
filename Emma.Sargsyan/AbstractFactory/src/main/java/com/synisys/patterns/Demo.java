package com.synisys.patterns;

import com.synisys.patterns.toys.Balloon;
import com.synisys.patterns.toys.StuffedToy;

/**
 * Created by emma.sargsyan
 */
public class Demo {

    public static void main(String[] args) {
        Balloon girlBalloon = new GirlToyFactory().createBalloon("Red");
        StuffedToy boyToy = new BoyToyFactory().createStuffedToy("Red");
        System.out.println(girlBalloon.getBalloon());
        System.out.println(boyToy.makeVoice());
    }

}