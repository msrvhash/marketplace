package com.intuit.marketplace.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="sellers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller extends Person{

    @Id
    @Field("sellerId")
    private ObjectId sellerId;

    @Field("sellerName")
    private String sellerName;

    @Field("sellerEMail")
    private String sellerEMail;

    @Field("sellerLocation")
    private String sellerLocation;

    @Field("sellerCompany")
    private String sellerCompany;

}
