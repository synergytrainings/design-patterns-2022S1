package com.synisys.patterns.toys;

/**
 * Created by emma.sargsyan
 */
public class StuffedCrocodile extends StuffedToy  {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public StuffedCrocodile(String color){
        this.color = color;
    }

    @Override
    public String makeVoice() {
        return color + " stuffed crocodile says hi!";
    }

}