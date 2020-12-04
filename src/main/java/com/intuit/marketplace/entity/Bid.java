package com.intuit.marketplace.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Document(collection="bids")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bid {

    @Id
    @Field("bidId")
    private ObjectId bidId;

    @Field("projectId")
    private String projectId;

    @Field("bidPrice")
    private int bidPrice;

    @Field("buyerId")
    private String buyerId;

    @Field("sellerId")
    private String sellerId;

    @Field("bidTime")
    private Instant bidTime;
}
