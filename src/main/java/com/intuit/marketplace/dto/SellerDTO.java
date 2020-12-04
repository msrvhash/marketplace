package com.intuit.marketplace.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SellerDTO {

    private String sellerId;

    private String sellerName;

    private String sellerEMail;

    private String sellerLocation;

    private String sellerCompany;
}
