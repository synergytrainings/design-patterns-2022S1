package com.synisys.patterns.prototype.impl;

import com.synisys.patterns.prototype.Shape;

public class Triangle extends Shape {
    private int altitudes;

    public Triangle() {
    }

    public Triangle(Triangle target) {
        super(target);
        if (target != null) {
            this.altitudes = target.altitudes;
        }
    }

    public void setAltitudes(int altitudes) {
        this.altitudes = altitudes;
    }

    @Override
    public Shape clone() {
        return new Triangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Triangle) || !super.equals(object2)) return false;
        Triangle shape2 = (Triangle) object2;
        return shape2.altitudes == altitudes;
    }
}
