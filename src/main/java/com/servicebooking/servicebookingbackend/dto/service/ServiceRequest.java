package com.servicebooking.servicebookingbackend.dto.service;

import lombok.Data;

@Data
public class ServiceRequest {

    private String vendorId;
    private String title;
    private String description;
    private String category;
    private double price;
    private String status; // active | blocked
}
