package com.synisys.patterns;

/**
 * Created by emma.sargsyan
 */
public interface GraphIterator<T extends GraphVertex> {

    boolean hasNextSources();

    T nextSources();

    boolean hasNextDestinations();

    T nextDestinations();

    boolean hasPreviousSources();

    T previousSources();

    boolean hasPreviousDestinations();

    T previousDestinations();

}