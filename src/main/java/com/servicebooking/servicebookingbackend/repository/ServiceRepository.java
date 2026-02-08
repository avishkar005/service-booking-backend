package com.servicebooking.servicebookingbackend.repository;

import com.servicebooking.servicebookingbackend.model.Service; // ✅ YOUR Service
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServiceRepository extends MongoRepository<Service, String> {

    List<Service> findByVendorId(String vendorId);

    List<Service> findByStatus(String status);
}
