package com.kodilla.patterns.singleton.com.kodilla.patterns.prototype;

import com.kodilla.patterns.com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.com.kodilla.patterns.prototype.TasksList;
import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTestSuite {

    @Test
    void testToString() {
        //Given
        //creating the TasksList for todos
        TasksList toDoList = new TasksList("To do tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> toDoList.getTasks().add(new Task("To Do Task number " + n)));

        //creating the TaskList for tasks in progress
        TasksList listInProgress = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));

        //creating the TaskList for done tasks
        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("Project 1");
        board.getLists().add(toDoList);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow clone of object board
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(board);
        System.out.println(cloneBoard);
        //When
        //Then
        assertEquals(3, board.getLists().size());
        assertEquals(3, cloneBoard.getLists().size());
    }
}
