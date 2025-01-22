package bus_reservation;

import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
    	System.out.println("WELCOME TO THE BUS REGISTRATION SITE");

      try {
        Scanner s = new Scanner(System.in);

        while(true) {
          
          
            	  System.out.println("\nAvailable Buses:");
                  
                  BusDBO busdbo  = new BusDBO();
                  busdbo.displayBusDetails();

                  System.out.println("Enter 1. To Book");
                  System.out.println("Enter 2. To Exit");

                  System.out.print("Enter your choice: ");
                  int userOpt = s.nextInt();
            switch (userOpt) {
                case 1:
                	
                    BookingDetails booking = new BookingDetails();
                    if (booking.isAvailable()) {
                    	bookingDBO bookingobject =  new bookingDBO();
                    	bookingobject.addbooking(booking);
                    	
                        System.out.println("Booking confirmed!");
                    } else {
                        System.out.println("Sorry, the bus is full. Try another bus.");
                    }
                	
                	
                    break;
                case 2:
                    System.out.println("Exiting the system. Thank you!");
                    s.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            }
      }
      catch(SQLException e) {
    	  e.printStackTrace();
      }
    }
}