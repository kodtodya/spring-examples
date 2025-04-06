package com.kodtodya.practice.service;

import com.kodtodya.practice.App;
import com.kodtodya.practice.model.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingService {

    private Booking booking;

    public void printBooking() {
        System.out.println("Booking Details are: " + booking);
    }
}
