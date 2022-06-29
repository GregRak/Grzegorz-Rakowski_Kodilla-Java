package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Facade {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    @Autowired
    public Facade(final CompanyDao companyDao, final EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> searchCompany(String str) {
        return companyDao.searchCompany("%" + str + "%");
    }

    public List<Employee> searchEmployee(String str) {
        return employeeDao.searchEmployee("%" + str + "%");
    }
}
