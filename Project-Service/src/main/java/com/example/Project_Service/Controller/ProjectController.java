package com.example.Project_Service.Controller;


import com.example.Project_Service.Entity.Project;
import com.example.Project_Service.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProjectController {


    @Autowired
    private ProjectService projectService;

    @Autowired
    private Environment environment;

    @PostMapping("/project")
    public ResponseEntity<String> addProject(@RequestBody Project project){
        projectService.addProject(project);
        return new ResponseEntity<>("Project added succesfully", HttpStatus.ACCEPTED);
    }

    @GetMapping("/project/{id}")
    public ResponseEntity<Optional<Project>> getProject(@PathVariable long id){

        System.out.println("port number of project-service" + environment.getProperty("local.server.port"));


        Optional<Project> project=projectService.getProject(id);
        return new ResponseEntity<>(project,HttpStatus.ACCEPTED);
    }


}
