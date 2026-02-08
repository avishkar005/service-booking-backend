package com.servicebooking.servicebookingbackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "payments")
public class Payment {

    @Id
    private String id;

    private String bookingId;
    private double amount;

    // upi | card
    private String method;

    // paid | failed | pending
    private String status;

    private String timestamp;
}
