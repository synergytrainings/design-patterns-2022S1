package com.synisys.patterns.implementor;

import com.synisys.patterns.api.MyList;

public class BaseOrderedList {
    private MyList implementor;

    public BaseOrderedList(MyList implementor) {
        this.implementor = implementor;
    }

    public String getFirstItem() {
        return implementor.getItem(0);
    }

    public Integer getAddOperationCount() {
        return implementor.getAddOperationCount();
    }


    public void removeItem(String s) {
        implementor.removeItem(s);
    }

    public Integer getCount() {
        return implementor.getCount();
    }

}
