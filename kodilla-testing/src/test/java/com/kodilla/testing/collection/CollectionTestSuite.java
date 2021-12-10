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
        Random generator = new Random();
        for (int n = 0; n<10; n++){
            int number = (generator.nextInt(10)+1);
            theList.add(number);
        }
        System.out.println("Number of list items: " + theList.size());
        //When
        List<Integer> temporaryList = oddExecutor.exterminate(theList);
        System.out.println("The size of the list containing even numbers: " + temporaryList.size());
        //Then
        for (int temporaryNumber: temporaryList) {
            if (temporaryNumber % 2 == 0) {
                System.out.println("The temporary number is: " + temporaryNumber + "; The OddNumbersExterminator test is OK");
            } else {
                System.out.println("The OddNumbersExterminator test is false");
            }
        }
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
        System.out.println(list);
        //When
        List<Integer> temporaryList = oddExecutor.exterminate(list);
        System.out.println("The size of the list containing even numbers: " + temporaryList.size());
        //Then
        for (Integer temporaryNumber : temporaryList) {
            if (temporaryNumber %2 ==0) {
                System.out.println("The temporary number is: " + temporaryNumber + "; The OddNumbersExterminator test is OK");
            } else {
                System.out.println("The temporary number is: " + temporaryNumber + "; The OddNumbersExterminator test is false");
            }
        }
    }

}
