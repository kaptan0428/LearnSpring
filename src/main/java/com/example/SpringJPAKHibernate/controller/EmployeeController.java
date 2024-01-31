package com.example.SpringJPAKHibernate.controller;


import com.example.SpringJPAKHibernate.model.Employee;
import com.example.SpringJPAKHibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // to handle HTTP requests
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired // for automatic dependency injection
    EmployeeRepository employeeRepository; // dependency injection
    // why we are doing this (decoupling/loose coupling)

    @PostMapping("/signup") // http post request
    public Employee saveEmployee(@RequestBody Employee emp){
        Employee req = employeeRepository.save(emp);
        // .save() -> to save the entities

        return req;
    }
}
