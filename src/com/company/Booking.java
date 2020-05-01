package com.company;

import java.util.List;

public class Booking {
    int bookigId;
    int paxCount;
    String  date;
    String timeSlot;

    public Booking(){

    }

    public Booking(int bookigId, int paxCount, String date, String  timeSlot){
        this.bookigId = bookigId;
        this.paxCount = paxCount;
        this.date = date;
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookigId=" + bookigId +
                ", paxCount=" + paxCount +
                ", date='" + date + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    //get all the bookings
    public List<Booking> getAllBookings(List<Booking> booking){
        return booking;
    }

    //get a booking bt id
    public Booking getBoookingById(int bId, List<Booking> booking){

        Booking x = null;
//                new Booking();
//        logic
        for (int i=0; i<booking.size(); i++){
            if(bId == booking.get(i).bookigId){
                x = booking.get(i);

            }//else System.out.println(bId + " is not matching");
        }
        System.out.println(bId + " Succsses");
        return x;
    }
}
