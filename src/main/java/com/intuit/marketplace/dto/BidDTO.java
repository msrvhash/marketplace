package com.intuit.marketplace.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Data
@NoArgsConstructor
public class BidDTO {

    private String bidId;

    private String projectId;

    private int bidPrice;

    private String buyerId;

    private String sellerId;

    private Instant bidTime;
}
