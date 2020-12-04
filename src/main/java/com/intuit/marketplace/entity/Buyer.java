package com.intuit.marketplace.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="buyers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Buyer extends Person{

    @Id
    @Field("buyerId")
    private ObjectId buyerId;

    @Field("buyerName")
    private String buyerName;

    @Field("sellerEMail")
    private String buyerEmail;

    @Field("buyerLocation")
    private String buyerLocation;

    @Field("sellerCompany")
    private String sellerCompany;
}
