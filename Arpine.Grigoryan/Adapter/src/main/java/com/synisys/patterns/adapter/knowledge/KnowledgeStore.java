package com.synisys.patterns.adapter.knowledge;

import com.synisys.patterns.adapter.knowledge.impl.KnowledgeCategoryImpl;
import com.synisys.patterns.adapter.knowledge.impl.KnowledgeKnowledgeCategoryPropertyImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KnowledgeStore {
    Map<String, KnowledgeCategory> categories;

    public KnowledgeStore() {
        if (this.categories == null) {
            initCategories();
        }
    }

    private void initCategories() {
        //load from db or read from xml ....
        this.categories = new HashMap();
        KnowledgeKnowledgeCategoryPropertyImpl cat1prop = new KnowledgeKnowledgeCategoryPropertyImpl(Arrays.asList("p1", "p2"));
        KnowledgeKnowledgeCategoryPropertyImpl cat2prop = new KnowledgeKnowledgeCategoryPropertyImpl(Arrays.asList("p1", "p2"));
        this.categories.put("1", new KnowledgeCategoryImpl("Category1", "Column1", cat1prop));
        this.categories.put("2", new KnowledgeCategoryImpl("Category2", "Column2", cat2prop));
    }

    public Map<String, KnowledgeCategory> getCategories() {
        return categories;
    }
}
