package com.synisys.patterns.impl;

import com.synisys.patterns.api.MyList;

import java.util.*;

public class UniqueListImpl implements MyList {
    Integer addOperationCount = 0;
    Set<String> items = new HashSet();

    public void addItem(String s) {
        addOperationCount++;
        if (!items.contains(s)) items.add(s);
    }


    public void removeItem(String s) {
        if (items.contains(s)) {
            items.remove(s);
        }
    }

    public String getItem(Integer position) {
        if (position > items.size()) {
            throw new IndexOutOfBoundsException("Invalid position ");
        }
        return String.valueOf(Arrays.asList(items).get(position));
    }

    public String getItem(String s) {
        if (items.contains(s)) {
            for (String obj : items) {
                if (obj.equals(s))
                    return obj;
            }
        }
        return null;
    }

    public Integer getCount() {
        return items.size();
    }

    public Integer getAddOperationCount() {
        return addOperationCount;
    }

    public boolean supportsOrdering() {
        return false;
    }
}
