package com.step.assignment.library;


public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public boolean equals(Librarian o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return name.equals(o.name);
    }

}
