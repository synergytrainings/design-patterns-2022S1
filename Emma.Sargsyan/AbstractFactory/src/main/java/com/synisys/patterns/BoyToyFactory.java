package com.synisys.patterns;

import com.synisys.patterns.toys.Balloon;
import com.synisys.patterns.toys.BoyBalloon;
import com.synisys.patterns.toys.StuffedCrocodile;
import com.synisys.patterns.toys.StuffedToy;

/**
 * Created by emma.sargsyan
 */
public class BoyToyFactory implements AbstractToyFactory {

    @Override
    public StuffedToy createStuffedToy(String color) {
        return new StuffedCrocodile(color);
    }

    @Override
    public Balloon createBalloon(String color) {
        return new BoyBalloon(color);
    }

}