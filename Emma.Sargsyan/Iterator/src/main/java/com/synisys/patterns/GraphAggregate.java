package com.synisys.patterns;

/**
 * Created by emma.sargsyan
 */
public interface GraphAggregate<T extends GraphVertex> {

    public GraphIterator<T> getIterator();

}