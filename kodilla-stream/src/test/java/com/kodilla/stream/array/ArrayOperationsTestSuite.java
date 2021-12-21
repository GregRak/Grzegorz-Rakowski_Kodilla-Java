package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
       int table[] = {10,2,39,46,5,6,75,8,94,10,11,12,13,14,15,16,17,18,19,120};
        //When
        double calculate = ArrayOperations.getAverage(table);
        //Then
        assertEquals(27.5, calculate);
    }
}
