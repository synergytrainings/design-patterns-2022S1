package com.synisys.patterns;

import java.util.List;

/**
 * Created by emma.sargsyan
 */
public interface GraphVertex {

    List<? extends GraphVertex> getSources();
    List<? extends GraphVertex> getDestinations();

}