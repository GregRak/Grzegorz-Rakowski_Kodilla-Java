package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book temporaryBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(temporaryBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15,theListOfBooks15.size());
        assertEquals(0,theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    public LibraryUser libraryUsersGenerator (int userNumber) {
        LibraryUser user = new LibraryUser("", "", "");
        for (int n = 1; n <= userNumber; n++) {
            LibraryUser newUser = new LibraryUser("Name" + n, "LastName" + n,
                    "PeselId" + n);
            user = newUser;
        }
        return user;
    }

    @Test
    void testListBooksInHandsOf() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser userWith0Books = libraryUsersGenerator(0);
        LibraryUser userWith1Book = libraryUsersGenerator(1);
        LibraryUser userWith5Books = libraryUsersGenerator(5);
        List<Book> theListOfBook0 = new ArrayList<Book>();
        List<Book> theListOfBook1 = generateListOfNBooks(1);
        List<Book> theListOFBook5 = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(userWith0Books)).thenReturn(theListOfBook0);
        when(libraryDatabaseMock.listBooksInHandsOf(userWith1Book)).thenReturn(theListOfBook1);
        when(libraryDatabaseMock.listBooksInHandsOf(userWith5Books)).thenReturn(theListOFBook5);
        //When
        List<Book> resultListWith0Books = bookLibrary.listBooksInHandsOf(userWith0Books);
        List<Book> resultListWith1Book = bookLibrary.listBooksInHandsOf(userWith1Book);
        List<Book> resultListWith5Books = bookLibrary.listBooksInHandsOf(userWith5Books);
        //Then
        assertEquals(0, resultListWith0Books.size());
        assertEquals(1, resultListWith1Book.size());
        assertEquals(5, resultListWith5Books.size());
    }
}
