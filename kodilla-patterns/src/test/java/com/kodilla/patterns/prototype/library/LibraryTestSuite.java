package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

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

        System.out.println(library1 + "\n");
        System.out.println(library2);
        System.out.println(library3);
        //When
        //Then
        assertEquals(20, library1.getBooks().size());
        assertEquals(20, library2.getBooks().size());
    }
}
