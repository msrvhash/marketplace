package com.intuit.marketplace.dao;

import com.intuit.marketplace.common.MarketPlaceException;
import com.intuit.marketplace.entity.Buyer;
import com.intuit.marketplace.entity.Project;
import com.intuit.marketplace.repository.BuyerRepository;
import com.intuit.marketplace.repository.ProjectRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuyerDAO {


    @Autowired
    BuyerRepository buyerRepository;

    public Buyer getBuyerById(String id) {
        Optional<Buyer> c = buyerRepository.findById(new ObjectId(id));
        if (c.isPresent()) return c.get();
        else throw new MarketPlaceException("Buyer with id " + id + " not found");
    }

    public Buyer saveBuyer(Buyer buyer) {
        try{
            return buyerRepository.save(buyer);
        } catch(Exception ex) {
            throw new MarketPlaceException(ex.getMessage());
        }
    }


}
