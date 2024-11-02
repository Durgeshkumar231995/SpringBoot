package com.java.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.in.bo.ProjectEngineerResponseBO;
import com.java.in.entity.Engineer;
import com.java.in.entity.Project;
import com.java.in.repository.EngineerRepository;
import com.java.in.repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectManagementService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EngineerRepository engineerRepository;


    public Project saveProject(Project project){
        return projectRepository.save(project);
    }

    public List<Project> getProjects(){
        return projectRepository.findAll();
    }

    public List<Engineer> getEngineers(){
        return engineerRepository.findAll();
    }

    public String deleteProject(int projectId){
        projectRepository.deleteById(projectId);
        return "project "+projectId+" deleted !!!";
    }


    public List<ProjectEngineerResponseBO> getProjectSpecificInfoSQL(){
        return projectRepository.getProjectSpecificInfoWithSQL();
    }

    public List<ProjectEngineerResponseBO> getProjectSpecificInfoJPQL(){
        return projectRepository.getProjectSpecificInfoWithJPQL();
    }




}
