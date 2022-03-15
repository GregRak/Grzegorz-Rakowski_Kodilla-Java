package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    public static final String DESCRIPTION = "Test: default description to task list";
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
}
