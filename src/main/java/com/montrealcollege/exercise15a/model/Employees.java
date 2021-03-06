package com.montrealcollege.exercise15a.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Component
public class Employees {
    @NotNull(message="Required")
    @Min(value=2, message="Id must be greater than 1")
    @Max(value=99, message="Id must be greater than 1")
    private Integer employeeId;
    @NotNull(message="Required")
    private String firstName;
    @NotNull(message="Required")
    private String lastName;
    @NotNull(message="Required")
    private String email;
    private String phoneNumber;
//    @NotNull(message="Required")
    private Date hireDate;
    @NotNull(message="Required")
    private String jobId;
    private Double salary;
    private Float commissionPct;
    private Integer managerId;
    private Integer departmentId;

    public Employees() {
        hireDate = new Date();
    }
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Float getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Float commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
