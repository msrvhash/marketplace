package com.intuit.marketplace.service;

import com.intuit.marketplace.common.EntityMapper;
import com.intuit.marketplace.dao.ProjectDAO;
import com.intuit.marketplace.dto.ProjectDTO;
import com.intuit.marketplace.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    ProjectDAO projectDAO;

    @Autowired
    EntityMapper mapper;

    public ProjectDTO postProject(ProjectDTO dto) {
        return mapper.entity2DTO(projectDAO.saveProject(mapper.dto2Entity(dto)));
    }

    public ProjectDTO  getProjectById(String projectId) {
        return mapper.entity2DTO(projectDAO.getProjectById(projectId));
    }
}
