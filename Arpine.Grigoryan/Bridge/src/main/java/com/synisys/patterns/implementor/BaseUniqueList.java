package com.synisys.patterns.implementor;

import com.synisys.patterns.api.MyList;

public class BaseUniqueList {
    private MyList implementor;

    public BaseUniqueList(MyList implementor) {
        this.implementor = implementor;
    }

    public void addItem(String s) {
        implementor.addItem(s);
    }

    public void removeItem(String s) {
        implementor.removeItem(s);
    }

    public Integer getCount() {
        return implementor.getCount();
    }


    public Integer getAddOperationCount() {
        return implementor.getAddOperationCount();
    }

    public String getFirstItem() {
        return implementor.getItem(0);
    }
}
