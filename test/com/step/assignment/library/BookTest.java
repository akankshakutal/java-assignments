package com.step.assignment.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

     Book book = new Book("Java");

    @Test
    void getName() {
        assertEquals("Java",book.getName());
    }
}