package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChalengeTestSuite {

    @Test
    void testExceptionHandling() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        double x = 1;
        double y = 2;
        //When & then
        assertDoesNotThrow(() -> exceptionHandling.ExceptionHandling(x,y));
    }

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 1;
        double y = 2;
        //When & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x,y));
    }

    @Test
    void testProbablyIWillThrowExceptionWithX2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 2;
        double y = 1;
        //When & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x,y));
    }

    @Test
    void testProbablyIWillThrowExceptionWithX0_99() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 0.99;
        double y = 0;
        //When & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x,y));
    }

    @Test
    void testProbablyIWillThrowExceptionWithX2AndY1_5() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 2;
        double y = 1.5;
        //When and then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x,y));
    }

    @Test
    void testProbablyIWillThrowExceptionAll() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(10, 10)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 0)),
                () -> assertDoesNotThrow(() -> exceptionHandling.ExceptionHandling(1, 0))
        );
    }

    @Test
    void testProbablyIWillThrowExceptionReturn() throws Exception {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        String expected = "Done!";
        //When & then
        assertEquals(expected, secondChallenge.probablyIWillThrowException(1, 3));
    }
}
