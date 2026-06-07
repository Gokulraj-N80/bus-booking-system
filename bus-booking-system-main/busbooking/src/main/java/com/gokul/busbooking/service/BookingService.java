package com.gokul.busbooking.service;

import com.gokul.busbooking.entity.Booking;
import com.gokul.busbooking.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking bookTicket(Booking booking) {
        return bookingRepository.save(booking);
    }
}