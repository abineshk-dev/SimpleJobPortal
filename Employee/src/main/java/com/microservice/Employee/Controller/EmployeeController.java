package com.microservice.Employee.Controller;

import com.microservice.Employee.Dto.EmployeeDTO;
import com.microservice.Employee.Model.Employee;
import com.microservice.Employee.Model.Project;
import com.microservice.Employee.Service.EmployeeService;
import com.microservice.Employee.feign.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectInterface projectInterface;

    @PostMapping("/employee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee){

        Optional<Project> project=projectInterface.getProject(employee.getAssignedProjectId()).getBody();

        if(project.isEmpty()){
            return new ResponseEntity<>("unable to find project", HttpStatus.BAD_REQUEST);
        }

        employeeService.addEmployee(employee);

        return new ResponseEntity<>("employee added succesfully",HttpStatus.ACCEPTED);
    }



    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Long id){

        Optional<Employee> employee=employeeService.getEmployee(id);

        Optional<Project> project=projectInterface.getProject(employee.get().getAssignedProjectId()).getBody();

        EmployeeDTO employeeDTO=new EmployeeDTO();

         if(project.isEmpty()){
            employeeDTO.setId(employee.get().getId());
            employeeDTO.setName(employee.get().getName());
            employeeDTO.setEmail(employee.get().getEmail());
            employeeDTO.setLocation(employee.get().getLocation());
            return new ResponseEntity<>(employeeDTO,HttpStatus.BAD_REQUEST);
         }

        else
            employeeDTO.setId(employee.get().getId());
            employeeDTO.setName(employee.get().getName());
            employeeDTO.setEmail(employee.get().getEmail());
            employeeDTO.setLocation(employee.get().getLocation());
            employeeDTO.setAssignedProjectId(employee.get().getAssignedProjectId());
            employeeDTO.setProjectName(employee.get().getName());
            return new ResponseEntity<>(employeeDTO,HttpStatus.ACCEPTED);

    }



}
