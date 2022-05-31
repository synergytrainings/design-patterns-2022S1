package com.synisys.products.api;

import com.synisys.helper.Size;

public abstract class Drink {
    private Size size;

    public Drink(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size=" + size +
                '}';
    }
}
