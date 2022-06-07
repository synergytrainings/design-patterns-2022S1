package com.synisys.patterns.adapter.knowledge.impl;

import com.synisys.patterns.adapter.knowledge.KnowledgeCategory;
import com.synisys.patterns.adapter.knowledge.KnowledgeCategoryProperty;

public class KnowledgeCategoryImpl implements KnowledgeCategory {
    private String name;
    private String columnName;
    private KnowledgeCategoryProperty property;

    public KnowledgeCategoryImpl(String name, String columnName, KnowledgeCategoryProperty property) {
        this.name = name;
        this.columnName = columnName;
        this.property = property;
    }

    public String getName() {
        return this.name;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public KnowledgeCategoryProperty getProperty() {
        return this.property;
    }
}
