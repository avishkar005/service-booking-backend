package com.servicebooking.servicebookingbackend.service;

import com.servicebooking.servicebookingbackend.model.Booking;
import com.servicebooking.servicebookingbackend.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public List<Booking> getByCustomer(String customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }
}
