package bus_reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookingDetails {
     String passenger_name;
    int booking_Busno;
    Date booking_Date;

    public BookingDetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the passenger name:");
        passenger_name = s.nextLine();
        System.out.println("Enter the bus number you need to book:");
        booking_Busno = s.nextInt();
        System.out.println("Enter the date you need to book in the format of dd-MM-yyyy:");
        String tempDate = s.next();
        SimpleDateFormat dateSDF = new SimpleDateFormat("dd-MM-yyyy");
        try {
            booking_Date = dateSDF.parse(tempDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable() throws SQLException {
        int capacity = 0;
        bookingDBO bookingdbo = new bookingDBO();
        capacity = bookingdbo.getcapacity(booking_Busno);
        
        int booked = 0;
        booked = bookingdbo.bookedcount(booking_Busno, booking_Date);
        
        System.out.println("Capacity: " + capacity);
        System.out.println("Booked: " + booked);
        
        return booked < capacity;
    }

}