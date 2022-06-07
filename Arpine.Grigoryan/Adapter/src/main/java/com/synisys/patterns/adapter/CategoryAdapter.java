package com.synisys.patterns.adapter;

import com.synisys.patterns.adapter.knowledge.KnowledgeCategory;
import com.synisys.patterns.adapter.knowledge.KnowledgeStore;
import com.synisys.patterns.adapter.presentation.Category;

import java.util.HashMap;
import java.util.Map;

public class CategoryAdapter implements Category {
    private KnowledgeCategory knowledgeCategory;
    private boolean isVisible;
    private Map<String, String> properties = new HashMap();
    private Integer id;
    private String name;


    public CategoryAdapter(Context context, String categoryId) {
        assert (context != null);

        KnowledgeStore knowledgeStore = new KnowledgeStore();
        this.knowledgeCategory = knowledgeStore.getCategories().get(categoryId);
        assert (this.knowledgeCategory != null);
        this.id = Integer.parseInt(categoryId);
        this.name = this.knowledgeCategory.getName() + "_" + this.knowledgeCategory.getColumnName();
        this.isVisible = context.getUsersAccessibleCategories().get(context.getCurrentUserId()).contains(this.id);
        this.knowledgeCategory.getProperty().getValues().forEach(s -> this.properties.put(s, context.getCurrentLanguageId()));
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

    @Override
    public String toString() {
        return "CategoryAdapter{" +
                "knowledgeCategory=" + knowledgeCategory +
                ", isVisible=" + isVisible +
                ", properties=" + properties +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
