package com.intuit.marketplace.repository;

import com.intuit.marketplace.entity.Bid;
import com.intuit.marketplace.entity.Project;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BidRepository   extends MongoRepository<Bid, ObjectId> {
    List<Bid> findAllByProjectId(ObjectId projectId);
}
