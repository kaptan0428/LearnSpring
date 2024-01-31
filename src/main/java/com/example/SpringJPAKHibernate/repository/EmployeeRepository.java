package com.example.SpringJPAKHibernate.repository;

import com.example.SpringJPAKHibernate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // why we are providing type generics --- <Employee, Integer> ?
    //Ans - to make data persistence so either we will be passing Employee or Integer

    // what is the use of "JpaRepository" ?
    // ans - query methods to interact with the database
    //       provides methods for common CRUD operations
}
