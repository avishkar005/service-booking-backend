package com.servicebooking.servicebookingbackend.dto.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServiceResponse {

    private String id;
    private String vendorId;
    private String title;
    private String description;
    private String category;
    private double price;
    private String status;
}
