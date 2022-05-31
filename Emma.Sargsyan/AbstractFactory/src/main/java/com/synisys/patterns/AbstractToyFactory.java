package com.synisys.patterns;

import com.synisys.patterns.toys.Balloon;
import com.synisys.patterns.toys.StuffedToy;

/**
 * Created by emma.sargsyan
 */
public interface AbstractToyFactory {

    public StuffedToy createStuffedToy(String color);

    public Balloon createBalloon(String color);

}