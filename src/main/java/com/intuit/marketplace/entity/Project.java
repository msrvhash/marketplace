package com.intuit.marketplace.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Document(collection="projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @Field("projectId")
    private ObjectId projectId;

    @Field("projectTitle")
    private String projectTitle;

    @Field("projectDescription")
    private String projectDescription;

    @Field("lTime")
    private Instant lastTimeForBid;

    @Field("creationTime")
    private Instant creationTime;

}
