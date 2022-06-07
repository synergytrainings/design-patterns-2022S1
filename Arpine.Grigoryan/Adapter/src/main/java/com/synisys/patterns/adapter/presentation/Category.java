package com.synisys.patterns.adapter.presentation;

import java.util.Map;

public interface Category {
    Integer getId();

    String getName();

    boolean isVisible();

    Map<String, String> getProperties();
}
