package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends LibraryPrototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book currentBook : books) {
            clonedLibrary.getBooks().add(currentBook);
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        return "Library{" + "\n" +
                "name = '" + name + "'\n" +
                "  books:\n" + books +
                "}\n";
    }
}
