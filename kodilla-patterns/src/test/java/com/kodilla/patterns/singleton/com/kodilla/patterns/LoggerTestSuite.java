package com.kodilla.patterns.singleton.com.kodilla.patterns;

import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("This is the last log");
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("This is the last log", result);
    }

}
