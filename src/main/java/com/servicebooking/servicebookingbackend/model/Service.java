package com.servicebooking.servicebookingbackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "services")
public class Service {

    @Id
    private String id;

    private String vendorId;
    private String title;
    private String description;
    private String category;
    private double price;

    // active | blocked
    private String status;
}
