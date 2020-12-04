package com.intuit.marketplace.common;

import com.intuit.marketplace.dto.BidDTO;
import com.intuit.marketplace.dto.BuyerDTO;
import com.intuit.marketplace.dto.ProjectDTO;
import com.intuit.marketplace.dto.SellerDTO;
import com.intuit.marketplace.entity.Bid;
import com.intuit.marketplace.entity.Buyer;
import com.intuit.marketplace.entity.Project;
import com.intuit.marketplace.entity.Seller;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityMapper {
    Buyer dto2Entity(BuyerDTO buyerdto);

    BuyerDTO entity2DTO( Buyer customer);

    Seller dto2Entity(SellerDTO sellerdto);

    SellerDTO entity2DTO( Seller seller);

    Bid dto2Entity(BidDTO biddto);

    BidDTO entity2DTO( Bid bid);

    Project dto2Entity(ProjectDTO projectdto);

    ProjectDTO entity2DTO( Project project);

    default ObjectId stringToObjectId(String id) {
        return id==null ? null : new ObjectId(id);
    }

    default String objectIdTOString(ObjectId id) {
        return id==null ? null : id.toString();
    }

}
