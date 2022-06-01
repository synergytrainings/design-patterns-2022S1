package main.java.com.synisys.iterator.model;

import main.java.com.synisys.iterator.helper.TVChannelCategory;

public class Channel {

    private String name;
    private TVChannelCategory category;

    public Channel(String name, TVChannelCategory category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TVChannelCategory getCategory() {
        return category;
    }
    public void setCategory(TVChannelCategory category) {
        this.category = category;
    }
}
