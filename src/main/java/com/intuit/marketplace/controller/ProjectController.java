package com.intuit.marketplace.controller;


import com.intuit.marketplace.common.MarketPlaceException;
import com.intuit.marketplace.dto.ProjectDTO;
import com.intuit.marketplace.entity.Project;
import com.intuit.marketplace.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/market-place/projects")
@Component
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @CrossOrigin(origins = "http://localhost:9000")
    @PostMapping
    public ResponseEntity<ProjectDTO> postTest(@RequestBody ProjectDTO projectdto) {
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(projectService.postProject(projectdto));
        } catch(MarketPlaceException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
