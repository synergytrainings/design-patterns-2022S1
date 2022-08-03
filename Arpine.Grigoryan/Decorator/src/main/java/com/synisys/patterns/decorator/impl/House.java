package com.synisys.patterns.decorator.impl;

import com.synisys.patterns.decorator.Building;

public class House implements Building {
    private String address;

    public House(String address) {
        this.address = address;
    }

    public String decorate() {
        return "House with address " + this.address;
    }
}
