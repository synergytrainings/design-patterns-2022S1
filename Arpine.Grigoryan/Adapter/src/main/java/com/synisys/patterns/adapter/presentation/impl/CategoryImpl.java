package com.synisys.patterns.adapter.presentation.impl;

import com.synisys.patterns.adapter.presentation.Category;

import java.util.Map;

public class CategoryImpl implements Category {
    private String name;
    private boolean isVisible;
    private Map<String, String> properties;
    private Integer id;

    public CategoryImpl(String name, boolean isVisible, Map<String, String> properties, Integer id) {
        this.name = name;
        this.isVisible = isVisible;
        this.properties = properties;
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }
}
