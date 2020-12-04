package com.intuit.marketplace.controller;

import com.intuit.marketplace.common.MarketPlaceException;
import com.intuit.marketplace.dto.BidDTO;
import com.intuit.marketplace.dto.BuyerDTO;
import com.intuit.marketplace.entity.Bid;
import com.intuit.marketplace.entity.Buyer;
import com.intuit.marketplace.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/demo/market-place/bids")
@Component
public class BidController {
    @Autowired
    BidService bidService;

    @CrossOrigin(origins = "http://localhost:9000")
    @PostMapping
    public ResponseEntity<BidDTO> postBid(@RequestBody BidDTO bid) {
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(bidService.placeBid(bid));
        } catch(MarketPlaceException ex) {
            return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<BuyerDTO> getBidWinner(@PathVariable("id") String projectId) {
        try {
            return ResponseEntity.ok(bidService.getBidWinner(projectId));
        } catch(MarketPlaceException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
