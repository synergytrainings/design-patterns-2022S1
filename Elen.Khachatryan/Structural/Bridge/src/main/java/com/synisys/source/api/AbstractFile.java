package com.synisys.source.api;

import com.synisys.source.Extension;

public abstract class AbstractFile implements File{
    private int durationInSeconds;
    private Extension extension;
    private String name;
    private String description;

    public AbstractFile(String name, String description, int durationInSeconds, Extension extension) {
        this.name = name;
        this.description = description;
        this.durationInSeconds = durationInSeconds;
        this.extension = extension;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "AbstractFile{" +
                "durationInSeconds=" + durationInSeconds +
                ", extension=" + extension +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
