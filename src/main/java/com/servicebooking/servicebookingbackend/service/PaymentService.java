package com.servicebooking.servicebookingbackend.service;

import com.servicebooking.servicebookingbackend.model.Payment;
import com.servicebooking.servicebookingbackend.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
