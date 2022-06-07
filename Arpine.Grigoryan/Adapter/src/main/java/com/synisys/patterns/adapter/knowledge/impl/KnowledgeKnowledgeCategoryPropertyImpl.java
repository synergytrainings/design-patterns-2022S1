package com.synisys.patterns.adapter.knowledge.impl;

import com.synisys.patterns.adapter.knowledge.KnowledgeCategoryProperty;

import java.util.List;

public class KnowledgeKnowledgeCategoryPropertyImpl implements KnowledgeCategoryProperty {
    private List<String> values;

    public KnowledgeKnowledgeCategoryPropertyImpl(List<String> values) {
        this.values = values;
    }

    public List<String> getValues() {
        return values;
    }

    public void setProperty(List<String> property) {
        this.values = property;
    }
}
