package com.montrealcollege.exercise15a.controller;

import com.montrealcollege.exercise15a.model.Employees;
import com.montrealcollege.exercise15a.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService service;

    @Autowired
    private Employees employee;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employees());
        return "WEB-INF/views/employeeForm";
    }

    @PostMapping("/create")
    public String createEmployee(@ModelAttribute("employee") @Valid Employees employee, BindingResult errors, Model model) {
        if(errors.hasErrors()) {
            return "WEB-INF/views/employeeForm";
        }
        service.addEmployee(employee);
        model.addAttribute("name", employee.getFirstName() + " " + employee.getLastName());
        return "WEB-INF/views/result";
    }
}
