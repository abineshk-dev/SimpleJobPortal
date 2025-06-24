package com.microservice.Employee.Repo;

import com.microservice.Employee.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplyeeRepo extends JpaRepository<Employee,Long> {
}
