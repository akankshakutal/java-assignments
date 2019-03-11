package com.step.assignment;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListIteratorTest {

    @Test
    void hasNext() {
        List<Integer> list = new ArrayList<>();
        ListIterator listIterator = new ListIterator(list);
        listIterator.add(3);
        listIterator.add(4);
        listIterator.add(5);
        listIterator.add(6);
        listIterator.add(7);
        listIterator.add(8);
        assertEquals(3,listIterator.next());
        assertEquals(4,listIterator.next());
        assertEquals(5,listIterator.next());
        assertEquals(6,listIterator.next());
        assertEquals(7,listIterator.next());
        assertEquals(8,listIterator.next());
        assertEquals(false,listIterator.hasNext());
    }
}