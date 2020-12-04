package com.intuit.marketplace.service;

import com.intuit.marketplace.common.EntityMapper;
import com.intuit.marketplace.common.MarketPlaceException;
import com.intuit.marketplace.dao.BidDAO;
import com.intuit.marketplace.dao.BuyerDAO;
import com.intuit.marketplace.dto.BidDTO;
import com.intuit.marketplace.dto.BuyerDTO;
import com.intuit.marketplace.dto.ProjectDTO;
import com.intuit.marketplace.entity.Bid;
import com.intuit.marketplace.entity.Buyer;
import com.intuit.marketplace.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BidService {

    @Autowired
    ProjectService projectService;

    @Autowired
    BidDAO bidDAO;

    @Autowired
    EntityMapper mapper;

    @Autowired
    BuyerDAO buyerDAO;
    public BidDTO placeBid(BidDTO biddto) {

        ProjectDTO project=projectService.getProjectById(biddto.getProjectId());
        if(project.getLastTimeForBid().compareTo(biddto.getBidTime())>0) {

            return mapper.entity2DTO(bidDAO.placeBid(mapper.dto2Entity(biddto)));
        }
        else throw new MarketPlaceException("Bid Time is over.");
    }

    public BuyerDTO getBidWinner(String projectId) {
        List<Bid> bids=bidDAO.getAllBidsByProjectId(projectId);
        Bid minBid = bids
                .stream()
                .min(Comparator.comparing(Bid::getBidPrice))
                .orElseThrow(NoSuchElementException::new);
        return mapper.entity2DTO(buyerDAO.getBuyerById(minBid.getBuyerId()));

    }
}
