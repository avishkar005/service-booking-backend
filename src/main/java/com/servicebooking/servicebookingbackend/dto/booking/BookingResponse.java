package com.servicebooking.servicebookingbackend.dto.booking;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingResponse {

    private String id;
    private String serviceId;
    private String serviceName;
    private String customerId;
    private String date;
    private String status;
    private double price;

    private String paymentMethod;
    private String paymentStatus;
}
