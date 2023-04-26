package com.company.handler;

public class WashingHandler extends CookingHandler {

    @Override
    public void handle() {
        System.out.println("Washing items for cooking");
        super.handleNextStep();
    }
}
