package com.intuit.marketplace.repository;


import com.intuit.marketplace.entity.Bid;
import com.intuit.marketplace.entity.Buyer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BuyerRepository  extends MongoRepository<Buyer, ObjectId> {

}
