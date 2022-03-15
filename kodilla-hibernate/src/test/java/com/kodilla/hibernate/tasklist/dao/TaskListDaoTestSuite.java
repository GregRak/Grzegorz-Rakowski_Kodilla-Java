package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    public static final String DESCRIPTION = "Test: default description to tasks list";
    public static final String TO_DO_LIST = "Tasks to do";

    @Test
    void testTaskListFindByListName() {
        //Given
        TaskList taskList = new TaskList(TO_DO_LIST, DESCRIPTION);
        taskListDao.save(taskList);
        String resultListName = taskList.getListName();
        //When
        List<TaskList> resultList = taskListDao.findByListName(resultListName);
        //Then
        assertEquals(1, resultList.size());
        //CleanUp
        int listId = resultList.get(0).getId();
        taskListDao.deleteById(listId);
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(TO_DO_LIST, DESCRIPTION);
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        assertNotEquals(0, id);
        //CleanUp
        taskListDao.deleteById(id);
    }
}
