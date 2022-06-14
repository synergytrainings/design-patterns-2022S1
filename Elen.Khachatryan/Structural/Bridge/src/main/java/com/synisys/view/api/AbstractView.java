package com.synisys.view.api;

import com.synisys.source.api.File;

public abstract class AbstractView implements View{

    private File source;
    private String description;
    private double width;
    private double height;

    public AbstractView(File source) {
        this.source = source;
    }


    @Override
    public void updateSize(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public File getSource() {
        return source;
    }

    public void setSource(File source) {
        this.source = source;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0 ){
            throw new IllegalArgumentException("Width must be >= 0");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0 ){
            throw new IllegalArgumentException("Height must be >= 0");
        }
        this.height = height;
    }
}
