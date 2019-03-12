package com.step.assignment.DuplicateEntity;

public class Main {
    public static void main(String[] args) {
        DuplicateID duplicate = new IDCard("Akanksha",1234).duplicate();
        System.out.println(duplicate.getName());
        System.out.println(duplicate.getId());
    }
}