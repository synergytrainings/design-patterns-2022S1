package com.synisys.products.impl;

import com.synisys.helper.Size;
import com.synisys.products.api.Drink;

public class Tea extends Drink {
    private boolean isHot;

    public Tea(Size size, boolean isHot) {
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
        return "Tea{" +
                super.toString() +
                ", " +
                "isHot=" + isHot +
                '}';
    }
}
