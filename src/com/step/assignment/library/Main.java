package com.step.assignment.library;

public class Main {

    public static void main(String[] args) {
        Librarian akanksha = new Librarian("Akanksha");
        Reader chandan = new Reader("Chandan");
        Library library = new Library(akanksha);
        Book c = new Book("C");
        Book java = new Book("Java");
        addBook(library, akanksha, c);
        addBook(library, akanksha, java);
        addReader(library, chandan);

    }

    public static void addBook(Library library, Librarian librarian, Book book) {
        if (library.addBook(librarian, book)) {
            System.out.println("Book Added successfully...!");
            return;
        }
        System.out.println("Somthing went Wrong");
    }

    public static void addReader(Library library, Reader reader) {
        if (library.addReader(reader)) {
            System.out.println("Reader Added successfully...!");
            return;
        }
        System.out.println("Something went wrong");
    }
}