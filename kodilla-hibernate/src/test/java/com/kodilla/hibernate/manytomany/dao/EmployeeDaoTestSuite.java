package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testNamedQuery() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaSmith = new Employee("Linda", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaSmith);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaSmith);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaSmith.getCompanies().add(dataMasters);
        lindaSmith.getCompanies().add(greyMatter);

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(lindaSmith);
        int lindaSmithId = lindaSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();

        //When
        List<Employee> listWithSmiths = employeeDao.givenLastNameEmployees("Smith");
        List<Employee> listWithClarksons = employeeDao.givenLastNameEmployees("Clarckson");
        List<Employee> listWithNovacs = employeeDao.givenLastNameEmployees("Novac");

        //Then
        assertEquals(2, listWithSmiths.size());
        assertEquals(1, listWithClarksons.size());
        assertEquals(0, listWithNovacs.size());

        //CleanUp
        try {
            employeeDao.deleteById(johnSmithId);
            employeeDao.deleteById(lindaSmithId);
            employeeDao.deleteById(stephanieClarcksonId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
