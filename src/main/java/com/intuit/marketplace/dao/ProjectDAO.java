package com.intuit.marketplace.dao;

import com.intuit.marketplace.common.MarketPlaceException;
import com.intuit.marketplace.entity.Project;
import com.intuit.marketplace.repository.ProjectRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProjectDAO {

    @Autowired
    ProjectRepository projectRepository;


    public Project saveProject(Project project) {
        try{
            return projectRepository.save(project);
        } catch(Exception ex) {
            throw new MarketPlaceException(ex.getMessage());
        }
    }

    public Project getProjectById(String id) {
        Optional<Project> c = projectRepository.findById(new ObjectId(id));
        if (c.isPresent()) return c.get();
        else throw new MarketPlaceException("Project with id " + id + " not found");
    }

}
