package com.synisys.patterns.impl;

import com.synisys.patterns.ModernArtPainting;

/**
 * Created by emma.sargsyan
 */
public class Impressionism implements ModernArtPainting {

    private String name;
    private String uniqueAspect;
    private String painter;

    public Impressionism(String name, String painter, String uniqueAspect){
        this.name = name;
        this.painter = painter;
        this.uniqueAspect = uniqueAspect;
    }

    @Override
    public String getUniqueAspect() {
        return uniqueAspect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }


}