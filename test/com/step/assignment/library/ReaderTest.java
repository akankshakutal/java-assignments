package com.step.assignment.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    Book book = new Book("C");
    Reader akanksha = new Reader("akanksha");

    @Test
    void borrowBook() {
        assertTrue(akanksha.borrowBook(book));
    }

    @Test
    void returnBook() {
        akanksha.borrowBook(book);
        assertEquals("C",akanksha.returnBook("C").getName());
        assertEquals(null,akanksha.returnBook("c++"));
    }


    @Test
    void getName() {
        assertEquals("akanksha",akanksha.getName());
    }

    @Test
    void isAlreadyBorrowed() {
        akanksha.borrowBook(book);
        assertTrue(akanksha.isAlreadyBorrowed(book));
        Book book1 = new Book("c++");
        assertFalse(akanksha.isAlreadyBorrowed(book1));
    }
}