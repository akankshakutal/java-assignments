package com.step.assignment.Polymorphism;

public class NonInteractiveWebPage extends WebPage {

    @Override
    public void click() {
        try {
            throw new Exception("Not Supporting");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
