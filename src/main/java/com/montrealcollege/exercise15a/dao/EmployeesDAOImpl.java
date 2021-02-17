package com.montrealcollege.exercise15a.dao;

import com.montrealcollege.exercise15a.model.Employees;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO {

    private JdbcTemplate jdbcTemplate;

    public void setDatasource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int newEmployee(Employees employee) {
        String sql = "INSERT ALL INTO EMPLOYEES VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        return jdbcTemplate.update(sql, employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),
                employee.getEmail(), employee.getPhoneNumber(), employee.getHireDate(), employee.getJobId(),
                employee.getSalary(), employee.getCommissionPct(), employee.getManagerId(), employee.getDepartmentId());
    }
}
