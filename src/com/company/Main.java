package com.company;

import javafx.css.converter.LadderConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Access to Booking class methods, attributes
        Booking booking = new Booking();

        //Booking data objects
//        Booking b1 = new Booking(001, 2, "2020/03/31", "12:15");
//        Booking b2 = new Booking(002, 2, "2020/04/09", "14:15");
//        Booking b3 = new Booking(003, 4, "2020/03/17", "16:00");
//        Booking b4 = new Booking(004, 6, "2020/04/21", "20:15");
//        Booking b5 = new Booking(005, 7, "2020/04/20", "17:15");


        //convert the booking objects to a booking list method 1
//        List<Booking> bookings = new ArrayList<>();
//        bookings.add(b1);
//        bookings.add(b2);
//        bookings.add(b3);
//        bookings.add(b4);
//        bookings.add(b5);

        //convert the booking objects to a booking list method 2
//        List<Booking> bookings = new ArrayList<>(
//                Arrays.asList(
//                          new Booking(001, 2, "2020/03/31", "12:15"),
//                            new Booking(002, 2, "2020/04/09", "14:15"),
//                            new Booking(003, 4, "2020/03/17", "16:00"),
//                            new Booking(004, 6, "2020/04/21", "20:15"),
//                            new Booking(005, 7, "2020/04/20", "17:15")
//                )
//        );

        //convert the booking objects to a booking list method 3
        List<Booking> bookings = Arrays.asList(
                new Booking(001, 2, "2020/03/31", "12:15"),
                new Booking(002, 2, "2020/04/09", "14:15"),
                new Booking(003, 4, "2020/03/17", "16:00"),
                new Booking(004, 6, "2020/04/21", "20:15"),
                new Booking(005, 7, "2020/04/20", "17:15")
        );

        //get all bookings
        List<Booking> allResult;
        allResult=  booking.getAllBookings(bookings);
        System.out.println(allResult);

        //get booking byId
        Booking resultById;
        resultById = booking.getBoookingById(002, bookings);
        System.out.println(resultById);

    }
}
