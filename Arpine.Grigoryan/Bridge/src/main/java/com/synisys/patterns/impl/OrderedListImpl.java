package com.synisys.patterns.impl;

import com.synisys.patterns.api.MyList;

import java.util.ArrayList;
import java.util.List;

public class OrderedListImpl implements MyList {
    List<String> items = new ArrayList();

    public void addItem(String s) {
        items.add(s);
    }

    public void addItem(String s, Integer position) {
        items.add(position, s);
    }

    public void removeItem(String s) {
        if (items.contains(s)) {
            items.remove(s);
        }
    }

    public String getItem(Integer position) {
        if (position < items.size())
            return (String) items.get(position);
        return null;
    }

    public Integer getCount() {
        return items.size();
    }

    public Integer getAddOperationCount() {
        return items.size();
    }

    public boolean supportsOrdering() {
        return true;
    }
}
