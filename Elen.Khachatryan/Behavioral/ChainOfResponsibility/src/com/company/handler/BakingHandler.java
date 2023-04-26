package com.company.handler;

public class BakingHandler extends CookingHandler{
    @Override
    public void handle() {
        System.out.println("It's time to bake. It will take some time....");
        this.handleNextStep();
    }
}
