package com.step.assignment.library;

import java.util.HashSet;
import java.util.Set;

public class Reader {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Reader(String name) {
        this.name = name;
    }

    public boolean borrowBook(Book book) {
        return books.add(book);
    }


    public Book returnBook(String bookName) {
        for (Book book: books) {
            if(book.getName().equals(bookName))
                return book;
        }
       return null;
    }


    public String getName() {
        return name;
    }

    public boolean isAlreadyBorrowed(Book book) {
        return books.contains(book);
    }
}