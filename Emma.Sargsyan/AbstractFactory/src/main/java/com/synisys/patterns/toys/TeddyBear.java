package com.synisys.patterns.toys;

/**
 * Created by emma.sargsyan
 */
public class TeddyBear extends StuffedToy  {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TeddyBear(String color){
        this.color = color;
    }

    @Override
    public String makeVoice() {
        return color + " teddy bear says hey!";
    }

}