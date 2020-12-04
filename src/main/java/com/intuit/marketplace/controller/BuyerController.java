package com.intuit.marketplace.controller;

import com.intuit.marketplace.common.MarketPlaceException;
import com.intuit.marketplace.dto.BuyerDTO;
import com.intuit.marketplace.entity.Buyer;
import com.intuit.marketplace.entity.Project;
import com.intuit.marketplace.service.BuyerService;
import com.intuit.marketplace.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/market-place/buyers")
@Component
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @CrossOrigin(origins = "http://localhost:9000")
    @PostMapping
    public ResponseEntity<BuyerDTO> postBuyer(@RequestBody BuyerDTO buyer) {
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(buyerService.postBuyer(buyer));
        } catch(MarketPlaceException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
