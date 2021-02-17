package com.montrealcollege.exercise15a.service;

import com.montrealcollege.exercise15a.dao.EmployeesDAO;
import com.montrealcollege.exercise15a.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesDAO employeesDAO;

    public void addEmployee(Employees employee) {
        employeesDAO.newEmployee(employee);
    }
}
