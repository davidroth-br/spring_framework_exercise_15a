package com.montrealcollege.exercise15a.dao;

import com.montrealcollege.exercise15a.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDatasource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addEmployee(Employees employee) {
        String sql = "INSERT INTO EMPLOYEES(employee_id, first_name, last_name, " +
                "email, phone_number, hire_date, job_id, " +
                "salary, commission_pct, manager_id, department_id) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),
                employee.getEmail(), employee.getPhoneNumber(), employee.getHireDate(), employee.getJobId(),
                employee.getSalary(), employee.getCommissionPct(), employee.getManagerId(), employee.getDepartmentId());
    }
}
