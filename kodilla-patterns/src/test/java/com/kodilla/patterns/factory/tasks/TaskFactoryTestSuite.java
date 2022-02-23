package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.setDone(true);
        //Then
        assertEquals("Food", shopping.getTaskName());
        assertEquals("I'm doing shopping", shopping.executeTask());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        painting.setDone(true);
        //Then
        assertEquals("Flat painting", painting.getTaskName());
        assertEquals("I'm doing the painting job", painting.executeTask());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        driving.setDone(true);
        //Then
        assertEquals("Drive1", driving.getTaskName());
        assertEquals("I'm going into Cracow by Car", driving.executeTask());
        assertTrue(true);
    }
}
