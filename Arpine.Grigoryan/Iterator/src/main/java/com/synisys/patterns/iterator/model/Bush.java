package com.synisys.patterns.iterator.model;

import com.synisys.patterns.iterator.helper.BushType;

public class Bush extends Plant {
    private final BushType type;

    public Bush(String name, BushType type) {
        super(name);
        this.type = type;
    }

    public BushType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + getName() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
