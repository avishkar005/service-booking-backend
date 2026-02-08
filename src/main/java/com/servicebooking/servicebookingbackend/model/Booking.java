package com.servicebooking.servicebookingbackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "bookings")
public class Booking {

    @Id
    private String id;

    private String serviceId;
    private String serviceName;
    private String customerId;
    private String date;

    // pending | confirmed | completed | cancelled
    private String status;

    private double price;

    // payment
    private String paymentMethod;   // upi | card
    private String paymentStatus;   // paid | pending | failed
}
