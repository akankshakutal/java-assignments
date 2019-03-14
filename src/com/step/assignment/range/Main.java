package com.step.assignment.range;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Range range = new NumberRange(1,10);
        Range range1 = new AlphabetRange('a','p');
        ArrayList list = range.getAll();
        ArrayList list1 = range1.getAll();
        for (Object item: list) {
            System.out.println(item);
        }
        for (Object item: list1) {
            System.out.println(item);
        }

        System.out.println(list1.contains('a'));
        System.out.println(list.contains(3));
        System.out.println(list.contains(300));

    }
}
