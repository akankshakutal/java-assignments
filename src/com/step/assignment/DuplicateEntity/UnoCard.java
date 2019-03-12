package com.step.assignment.DuplicateEntity;

public class UnoCard implements Duplicable<DuplicateUnoCard> {
    private String symbol;
    private String color;

    public UnoCard(String symbol, String color) {
        this.symbol = symbol;
        this.color = color;
    }

    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard(this.symbol, this.color);
    }

}


