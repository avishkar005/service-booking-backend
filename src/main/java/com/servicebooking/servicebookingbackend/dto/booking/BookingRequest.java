package com.servicebooking.servicebookingbackend.dto.booking;

import lombok.Data;

@Data
public class BookingRequest {

    private String serviceId;
    private String serviceName;
    private String customerId;
    private String date;
    private String status;
    private double price;

    private String paymentMethod;   // upi | card
    private String paymentStatus;   // paid | pending | failed
}
