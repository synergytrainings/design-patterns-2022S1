package com.synisys.patterns.impl;

import com.synisys.patterns.ContemporaryArtPainting;

/**
 * Created by emma.sargsyan
 */
public class Actionism implements ContemporaryArtPainting {

    private String name;
    private String socialImplication;
    private String painter;

    public Actionism(String name, String painter, String socialImplication){
        this.name = name;
        this.painter = painter;
        this.socialImplication = socialImplication;
    }

    @Override
    public String getSocialImplication() {
        return socialImplication;
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