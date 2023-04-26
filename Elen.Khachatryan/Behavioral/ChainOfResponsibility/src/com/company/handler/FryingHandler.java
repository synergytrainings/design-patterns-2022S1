package com.company.handler;

public class FryingHandler extends CookingHandler{
    @Override
    public void handle() {
        System.out.println("Frying ingredients");
        this.handleNextStep();
    }
}
