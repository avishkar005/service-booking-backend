package com.servicebooking.servicebookingbackend.repository;

import com.servicebooking.servicebookingbackend.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {

    List<Booking> findByCustomerId(String customerId);

    List<Booking> findByServiceId(String serviceId);

    List<Booking> findByStatus(String status);
}
