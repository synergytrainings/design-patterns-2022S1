package com.synisys.patterns.api;

public interface MyList {
    void addItem(String s);

    void removeItem(String s);

    String getItem(Integer position);

    Integer getCount();

    Integer getAddOperationCount();

    boolean supportsOrdering();
}
