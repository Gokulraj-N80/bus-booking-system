package com.gokul.busbooking.controller;

import com.gokul.busbooking.entity.Booking;
import com.gokul.busbooking.service.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking bookTicket(@RequestBody Booking booking) {
        return bookingService.bookTicket(booking);
    }
}