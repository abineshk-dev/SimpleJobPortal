package com.example.Project_Service.Service;

import com.example.Project_Service.Entity.Project;
import com.example.Project_Service.Repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;


    public Optional<Project> getProject(long id) {

        return projectRepo.findById(id);
    }

    public void addProject(Project project) {

        projectRepo.save(project);


    }
}

