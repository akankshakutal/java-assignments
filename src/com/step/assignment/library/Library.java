package com.step.assignment.library;

import java.util.*;

public class Library {
    private Set<Book> availableBooks;
    private Librarian librarian;
    private Map<Reader, List<Book>> booksOwnByReader;
    private Map<Book, Reader> borrowBookRecord;


    public Library(Librarian librarian) {
        this.librarian = librarian;
        availableBooks = new HashSet<>();
        booksOwnByReader = new HashMap<>();
        borrowBookRecord = new HashMap<>();
    }

    public boolean addReader(Reader reader) {
        if(booksOwnByReader.containsKey(reader)){
            return false;
        }
       booksOwnByReader.put(reader,new ArrayList<>());
       return true;
    }

    private boolean validateLibrarian(Librarian librarian) {
        return this.librarian.equals(librarian);
    }

    public boolean addBook(Librarian librarian, Book book) {
        if (validateLibrarian(librarian)) {
            availableBooks.add(book);
            borrowBookRecord.put(book,null);
            return true;
        }
        return false;
    }

    public boolean removeBook(Librarian librarian, String bookName) {
        Book book = searchBook(bookName);
        if (validateLibrarian(librarian) && availableBooks.contains(book)) {
            availableBooks.remove(book);
            return true;
        }
        return false;
    }

    public boolean lendBook(Reader reader, String bookName) {
        Book book = searchBook(bookName);
        if ( book != null && booksOwnByReader.keySet().contains(reader)) {
            booksOwnByReader.get(reader).add(book);
            availableBooks.remove(book);
            borrowBookRecord.put(book,reader);
            reader.borrowBook(book);
            return true;
        }
        return false;
    }

    public Book searchBook(String bookName) {
        for (Book book : availableBooks) {
            if (book.getName().equals(bookName))
                return book;
        }
        return null;
    }

    public boolean reacquireBook(Reader reader,String bookName) {
        Book book = reader.returnBook(bookName);
        if(book != null) {
            availableBooks.add(book);
            return true;
        }
        return false;

    }

}