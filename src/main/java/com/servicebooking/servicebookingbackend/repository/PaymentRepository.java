package com.servicebooking.servicebookingbackend.repository;

import com.servicebooking.servicebookingbackend.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PaymentRepository extends MongoRepository<Payment, String> {

    List<Payment> findByBookingId(String bookingId);

    List<Payment> findByStatus(String status);
}
