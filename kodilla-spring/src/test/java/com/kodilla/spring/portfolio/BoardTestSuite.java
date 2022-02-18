package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testBeansExist() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean toDoListBean = context.containsBean("toDoList");
        boolean inProgressListBean = context.containsBean("inProgressList");
        boolean doneListBean = context.containsBean("doneList");
        boolean boardBean = context.containsBean("getBoard");
        //Then
        assertEquals(true, toDoListBean);
        assertEquals(true, inProgressListBean);
        assertEquals(true, doneListBean);
        assertEquals(true, boardBean);
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        String task1 = "Task to do";
        String task2 = "Task in progress";
        String task3 = "Task done";
        Board board = (Board) context.getBean("getBoard");
        //When
        TaskList toDoList = board.getToDoList();
        toDoList.getTasks().add(task1);
        TaskList taskInProgress = board.getInProgressList();
        taskInProgress.getTasks().add(task2);
        TaskList taskDone = board.getDoneList();
        taskDone.getTasks().add(task3);
        //Then
        board.getToDoList().getTasks().stream()
                        .forEach(System.out::println);
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Task done", board.getDoneList().getTasks().get(0));
    }
}
