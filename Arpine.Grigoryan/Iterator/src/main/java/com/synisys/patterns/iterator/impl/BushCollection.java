package com.synisys.patterns.iterator.impl;

import com.synisys.patterns.iterator.Collection;
import com.synisys.patterns.iterator.helper.BushType;
import com.synisys.patterns.iterator.model.Bush;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BushCollection implements Collection {
    private Map<BushType, List<Bush>> bushes;
    private int numberOfPlants = 0;
    private Bush[] bushesArr;


    public BushCollection() {
        this.bushesArr = new Bush[100000];
        this.bushes = new HashMap<>();
        this.numberOfPlants = 0;
    }

    public void plant(Bush bush) {
        if (!bushes.containsKey(bush.getType())) {
            bushes.put(bush.getType(), new ArrayList<>());
        }
        bushes.get(bush.getType()).add(bush);
        bushesArr[numberOfPlants] = bush;
        numberOfPlants = numberOfPlants + 1;
    }

    public BushIterator createIterator() {
        return new BushIterator(bushesArr);
    }
}
