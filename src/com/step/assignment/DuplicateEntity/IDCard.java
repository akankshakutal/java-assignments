package com.step.assignment.DuplicateEntity;

public class IDCard implements Duplicable<DuplicateID>{
    private String name;
    private int id;

    public IDCard(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public DuplicateID duplicate() {
        return new DuplicateID(this.name,this.id);
    }
}
