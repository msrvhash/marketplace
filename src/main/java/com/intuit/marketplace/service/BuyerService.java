package com.intuit.marketplace.service;

import com.intuit.marketplace.common.EntityMapper;
import com.intuit.marketplace.dao.BuyerDAO;
import com.intuit.marketplace.dao.ProjectDAO;
import com.intuit.marketplace.dto.BuyerDTO;
import com.intuit.marketplace.entity.Buyer;
import com.intuit.marketplace.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {
    @Autowired
    BuyerDAO buyerDAO;

    @Autowired
    EntityMapper mapper;

    public BuyerDTO postBuyer(BuyerDTO dto) {
        return mapper.entity2DTO(buyerDAO.saveBuyer(mapper.dto2Entity(dto)));
    }
}
