package com.synisys.patterns.toys;

/**
 * Created by emma.sargsyan
 */
public class BoyBalloon extends Balloon {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BoyBalloon(String color){
        this.color = color;
    }

    @Override
    public String getBalloon() {
        return color + " Boy Balloon";
    }

}