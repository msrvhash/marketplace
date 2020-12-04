package com.intuit.marketplace.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class ProjectDTO {

    private String projectId;

    private String projectTitle;

    private String projectDescription;

    private Instant lastTimeForBid;

}
