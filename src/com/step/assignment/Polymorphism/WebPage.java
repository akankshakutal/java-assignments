package com.step.assignment.Polymorphism;

public class WebPage implements Displayable,Returnable{

    @Override
    public void display(String text) {
        System.out.println(text);
    }

    @Override
    public String getText() {
        return "Some Text";
    }

    public void click(){
        System.out.println("Clicked on Page");
    }

}
