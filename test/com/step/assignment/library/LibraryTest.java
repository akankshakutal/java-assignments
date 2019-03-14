package com.step.assignment.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Reader reader = new Reader("akanksha");
    Librarian librarian = new Librarian("omkar");
    Book book = new Book("C");
    Librarian librarian1 = new Librarian("tushar");
    Library library = new Library(librarian);

    @BeforeEach
    void setUp() {
        library.addBook(librarian,book);
    }

    @Test
    void addReader() {
        assertTrue(library.addReader(reader));
        assertFalse(library.addReader(reader));

    }

    @Test
    void addBook() {
        assertTrue(library.addBook(librarian, book));
        assertFalse(library.addBook(librarian1, book));

    }

    @Test
    void removeBook() {
        Book book1 = new Book("oop");
        assertTrue(library.removeBook(librarian, "C"));
        assertFalse(library.removeBook(librarian1, "C"));
        assertFalse(library.removeBook(librarian, "c++"));
    }

    @Test
    void lendBook() {
        Reader om = new Reader("om");
        library.addReader(reader);
        library.addBook(librarian, book);
        assertTrue(library.lendBook(reader, "C"));
        assertFalse(library.lendBook(om, "C"));
        assertFalse(library.lendBook(reader,"c++"));
    }

    @Test
    void searchBook() {
        assertEquals("C",library.searchBook("C").getName());
        assertEquals(null,library.searchBook("c++"));
    }

    @Test
    void reacquireBook() {
        library.addReader(reader);
        library.lendBook(reader,"C");
        Reader om = new Reader("om");
        assertTrue(library.reacquireBook(reader,"C"));
        assertFalse(library.reacquireBook(reader,"c++"));
        assertFalse(library.reacquireBook(om,"C"));
    }
}