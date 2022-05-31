package com.synisys.products.impl;

import com.synisys.helper.Size;
import com.synisys.products.api.Drink;

public class Coffee extends Drink {
    private boolean isHot;

    public Coffee(Size size, boolean isHot) {
        super(size);
        this.isHot = isHot;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                super.toString() +
                ", " +
                "isHot=" + isHot +
                '}';
    }
}
