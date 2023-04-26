package com.company.handler;

public class CuttingHandler extends CookingHandler {
    @Override
    public void handle() {
        System.out.println("Cutting ingredients");
        this.handleNextStep();
    }
}
