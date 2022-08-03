package com.synisys.patterns.prototype;

import java.util.Objects;

public abstract class Shape {
    private int area;
    private String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.area = target.area;
            this.color = target.color;
        }
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return  shape2.area == area && Objects.equals(shape2.color, color);
    }

}
