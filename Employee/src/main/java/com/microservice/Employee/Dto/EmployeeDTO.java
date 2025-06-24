package com.microservice.Employee.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class EmployeeDTO {

    private Long id;
    private String name;
    private String email;
    private String location;
    private Long assignedProjectId;
    private String projectName;


}
