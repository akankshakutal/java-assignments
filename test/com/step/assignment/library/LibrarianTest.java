package com.step.assignment.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianTest {

    Librarian librarian = new Librarian("Akanksha");
    @Test
    void equals() {
        Librarian akanksha = new Librarian("Akanksha");
        assertTrue(librarian.equals(librarian));
        assertTrue(librarian.equals(akanksha));
    }
}