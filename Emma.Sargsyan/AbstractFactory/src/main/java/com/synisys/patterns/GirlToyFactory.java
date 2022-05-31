package com.synisys.patterns;

import com.synisys.patterns.toys.*;

/**
 * Created by emma.sargsyan
 */
public class GirlToyFactory implements AbstractToyFactory {

    @Override
    public StuffedToy createStuffedToy(String color) {
        return new TeddyBear(color);
    }

    @Override
    public Balloon createBalloon(String color) {
        return new GirlBalloon(color);
    }

}