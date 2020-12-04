package com.intuit.marketplace.dao;

import com.intuit.marketplace.common.MarketPlaceException;
import com.intuit.marketplace.entity.Bid;
import com.intuit.marketplace.entity.Buyer;
import com.intuit.marketplace.entity.Project;
import com.intuit.marketplace.repository.BidRepository;
import com.intuit.marketplace.repository.ProjectRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BidDAO {

    @Autowired
    BidRepository bidRepository;


    public Bid placeBid(Bid bid) {
        try{
            return bidRepository.save(bid);
        } catch(Exception ex) {
            throw new MarketPlaceException(ex.getMessage());
        }
    }

    public List<Bid> getAllBids() {
        try {
            return bidRepository.findAll();
        } catch (Exception ex) {
            throw new MarketPlaceException(ex.getMessage());
        }
    }
    public List<Bid> getAllBidsByProjectId(String id) {
        try {
            return bidRepository.findAllByProjectId(new ObjectId(id));
        }  catch (Exception ex) {
            throw new MarketPlaceException(ex.getMessage());
        }
    }
}


