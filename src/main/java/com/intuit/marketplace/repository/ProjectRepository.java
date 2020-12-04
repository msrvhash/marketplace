package com.intuit.marketplace.repository;

import com.intuit.marketplace.entity.Project;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository  extends MongoRepository<Project, ObjectId> {
}
