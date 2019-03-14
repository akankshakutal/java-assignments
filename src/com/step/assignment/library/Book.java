package com.step.assignment.library;

public class Book {

    private String name;
    private int id;
    private static int count=0;

    public Book(String name) {
        this.name = name;
        this.id = count;
        count++;
    }

    public String getName() {
        return name;
    }
}
