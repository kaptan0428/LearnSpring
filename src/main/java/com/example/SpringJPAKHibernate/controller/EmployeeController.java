package com.example.SpringJPAKHibernate.controller;


import com.example.SpringJPAKHibernate.model.Employee;
import com.example.SpringJPAKHibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/signup")
    public Employee saveEmployee(@RequestBody Employee emp){
        Employee req = employeeRepository.save(emp);

        return req;
    }
}
