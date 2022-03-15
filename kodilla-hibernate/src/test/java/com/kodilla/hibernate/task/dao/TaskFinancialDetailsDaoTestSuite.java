package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    void testFindByPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails =
                new TaskFinancialDetails(new BigDecimal("213"), true);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(true);
        //Then
        assertEquals(1, resultList.size());
        //CleanUp
        int id = resultList.get(0).getId();
        taskFinancialDetailsDao.deleteById(id);
    }
}
