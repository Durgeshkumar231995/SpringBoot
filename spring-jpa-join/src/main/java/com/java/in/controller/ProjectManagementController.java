package com.java.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.java.in.bo.ProjectEngineerResponseBO;
import com.java.in.entity.Engineer;
import com.java.in.entity.Project;
import com.java.in.service.ProjectManagementService;

import java.util.List;

@RestController
public class ProjectManagementController {

    @Autowired
    private ProjectManagementService service;

    @PostMapping("/projects")
    public Project addNewProject(@RequestBody Project project) {
        return service.saveProject(project);
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return service.getProjects();
    }

    @GetMapping("/engineers")
    public List<Engineer> getEngineers() {
        return service.getEngineers();
    }

    @DeleteMapping("/project/{projectId}")
    public String deleteProject(@PathVariable int projectId) {
        return service.deleteProject(projectId);
    }

    @GetMapping("/join/sql")
    public List<ProjectEngineerResponseBO> getProjectSpecificInfoSQL(){
        return service.getProjectSpecificInfoSQL();
    }
    @GetMapping("/join/jpql")
    public List<ProjectEngineerResponseBO> getProjectSpecificInfoJPQL(){
        return service.getProjectSpecificInfoJPQL();
    }


}
