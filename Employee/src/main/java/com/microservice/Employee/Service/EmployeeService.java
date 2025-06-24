package com.microservice.Employee.Service;


import com.microservice.Employee.Model.Employee;
import com.microservice.Employee.Repo.EmplyeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmplyeeRepo emplyeeRepo;


    public void addEmployee(Employee employee) {

        emplyeeRepo.save(employee);
    }

    public Optional<Employee> getEmployee(Long id) {

        return emplyeeRepo.findById(id);
    }
}
