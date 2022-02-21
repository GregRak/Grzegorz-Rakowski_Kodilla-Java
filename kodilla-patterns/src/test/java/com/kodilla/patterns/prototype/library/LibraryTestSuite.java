package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library1 = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(n -> library1.getBooks().add(new Book("Book " + n, "Author 1" + n, LocalDate.of(1990 + n, 1, 1))));

        //Shallow copy of object Library
        Library library2 = null;
        try {
            library2 = library1.shallowCopy();
            library2.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Deep copy of object Library
        Library library3 = null;
        try {
            library3 = library1.deepCopy();
            library3.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        library1.getBooks().add(new Book("Additional Book(Shallow)", "Author 123", LocalDate.of(2021, 1, 1)));
        library3.getBooks().add(new Book("Additional Book(Deep)", "Author 123", LocalDate.of(2021, 1, 1)));
        library3.getBooks().add(new Book("Additional Book(Deep)2", "Author 1234", LocalDate.of(2022, 1, 1)));
        System.out.println(library1 + "Number of books: " + library1.getBooks().size() + "\n");
        System.out.println(library2 + "Number of books: " + library2.getBooks().size() + "\n");
        System.out.println(library3 + "Number of books: " + library3.getBooks().size() + "\n");
        //Then
        assertEquals(21, library1.getBooks().size());
        assertEquals(21, library2.getBooks().size());
        assertEquals(22, library3.getBooks().size());
        assertEquals(library1.getBooks().size(), library2.getBooks().size());
        assertNotEquals(library1.getBooks().size(), library3.getBooks().size());
    }
}
