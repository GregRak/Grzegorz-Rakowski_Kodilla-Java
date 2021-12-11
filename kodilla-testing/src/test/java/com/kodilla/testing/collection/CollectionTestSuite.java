package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

    @BeforeEach
    public void before () {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after () {
        System.out.println("Test Case: end \n");
    }

    @DisplayName
            ("When we create a empty list " +
                    "then the exterminate should return a new empty list"
            )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddExecutor = new OddNumbersExterminator();
        List<Integer> theEmptyList = new ArrayList<>();
        //When
        List<Integer> temporaryList = oddExecutor.exterminate(theEmptyList);
        System.out.println("The size of the list containing even numbers after use exterminate method: "
                + temporaryList.size() + "\n We expected: 0");
        //Then
        Assertions.assertTrue(temporaryList.isEmpty());
    }

    @DisplayName
            ("When we create a list containing only odd numbers " +
                    "then the exterminate should return a new empty list"
            )

    @Test
    void testOddNumbersExterminatorListWithOddNumbers() {
        //Given
        OddNumbersExterminator oddExecutor = new OddNumbersExterminator();
        List<Integer> theOddNumbersList = Arrays.asList(3, 7, 101, 457);
        System.out.println("The number of items in the given list: " + theOddNumbersList.size());
        //When
        List<Integer> temporaryList = oddExecutor.exterminate(theOddNumbersList);
        System.out.println("The size of the list containing even numbers after use exterminate method: "
                + temporaryList.size() + "\n We expected: 0");
        //Then
        Assertions.assertTrue(temporaryList.isEmpty());
    }

    @DisplayName
            ("When we create a list of random numbers " +
                    "then the exterminate should return a new list containing only even numbers"
            )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddExecutor = new OddNumbersExterminator();
        List<Integer> theList = new ArrayList<>();
        theList.add(23);
        theList.add(20);
        theList.add(101);
        theList.add(450);
        theList.add(2);
        theList.add(5);
        theList.add(11);
        theList.add(322);
        System.out.println("The number of items in the given list: " + theList.size());
        //When
        List<Integer> temporaryList = oddExecutor.exterminate(theList);
        List<Integer> expectedList = Arrays.asList(20,450,2,322);
        System.out.println("The size of the list containing even numbers after use exterminate method: " + temporaryList.size()
                + "\n We expected: " + expectedList.size());
        //Then
        Assertions.assertFalse(temporaryList.isEmpty());
        Assertions.assertEquals(expectedList.size(),temporaryList.size());
        Assertions.assertTrue(expectedList.equals(temporaryList));
    }

    @DisplayName
            ("When we create a table and convert it to the list " +
                    "then the exterminate should return a new list containing only even numbers"
            )

    @Test
    void testOddNumbersExterminatorTableToList() {
        //Given
        OddNumbersExterminator oddExecutor = new OddNumbersExterminator();
        Integer table[] = new Integer[] {1,2,4,5,6,7,8};
        List<Integer> list = Arrays.asList(table);
        System.out.println("The number of items in the given list: " + list.size());
        //When
        List<Integer> temporaryList = oddExecutor.exterminate(list);
        List<Integer> expectedList = Arrays.asList(2,4,6,8);
        System.out.println("The size of the list containing even numbers after use exterminate method: " + temporaryList.size()
                + "\n We expected: " + expectedList.size());

        //Then
        Assertions.assertFalse(temporaryList.isEmpty());
        Assertions.assertEquals(expectedList.size(), temporaryList.size());
        Assertions.assertTrue(expectedList.equals(temporaryList));
    }

}
