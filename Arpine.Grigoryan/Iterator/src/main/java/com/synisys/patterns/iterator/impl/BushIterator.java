package com.synisys.patterns.iterator.impl;

import com.synisys.patterns.iterator.Iterator;
import com.synisys.patterns.iterator.model.Bush;

public class BushIterator implements Iterator {
    Bush[] bushes;
    int position = 0;

    public BushIterator(Bush[] bushes) {

        this.bushes = bushes;
    }

    public boolean hasNext() {
        if (position >= bushes.length ||
                bushes[position] == null) {
            return false;
        } else
            return true;
    }

    public Object next() {
        Bush plant = bushes[position];
        position += 1;
        return plant;
    }
}
