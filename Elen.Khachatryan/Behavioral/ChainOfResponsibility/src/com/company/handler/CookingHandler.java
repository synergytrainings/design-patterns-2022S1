package com.company.handler;

public abstract class CookingHandler {
    private CookingHandler nextHandler;

    public abstract void handle();

    public void setNextHandler(CookingHandler nextStep) {
        this.nextHandler = nextStep;
    }

    public void handleNextStep() {
        if (this.nextHandler != null) {
            this.nextHandler.handle();
        }
    }
}
