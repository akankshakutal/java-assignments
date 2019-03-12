package com.step.assignment.range;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Range range = new NumberRange(1,100);
        Range range1 = new AlphabatRange('a','z');
        ArrayList<Integer> list = range.getAll();
        ArrayList<Character> list1 = range1.getAll();
        for (Integer item: list) {
            System.out.println(item);
        }
        for (Character item: list1) {
            System.out.println(item);
        }

        System.out.println(list1.contains('a'));
        System.out.println(list.contains(30));
        System.out.println(list.contains(300));

    }
}
