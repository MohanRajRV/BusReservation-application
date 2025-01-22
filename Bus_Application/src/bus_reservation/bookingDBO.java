package bus_reservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.*;

public class bookingDBO {
  public int getcapacity(int booking_Busno)throws SQLException {
	  int capacity = 0;
	  try {
  		
			Connection con = DBconnection.getConnection();
			Statement stm = con.createStatement();
			String query = "SELECT bus_capacity FROM businfo WHERE bus_no = " + booking_Busno;

			ResultSet rs = stm.executeQuery(query);
			rs.next();
			capacity = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  return capacity;
  }
  
  public int bookedcount(int booking_Busno, Date date) throws SQLException {
	    int count = 0;
	    try {
	        Connection con = DBconnection.getConnection();
	        String query = "SELECT count(Passenger_Name) FROM bookingdetails WHERE date_booked = ? AND Booked_bus_no = ?";
	        PreparedStatement stm = con.prepareStatement(query);
	        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	        stm.setDate(1, sqlDate);
	        stm.setInt(2, booking_Busno);
	        
	        ResultSet rs = stm.executeQuery();
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return count;
	}


  public void addbooking( BookingDetails booking)throws SQLException  {
	  try {
	  String q1 = "insert into bookingdetails values(?,?,?)";
	  
		Connection con = DBconnection.getConnection();
		PreparedStatement pre = con.prepareStatement(q1);
		pre.setString(1,booking.passenger_name);
		pre.setInt(2,booking.booking_Busno);
		java.sql.Date sqldate = new java.sql.Date( booking.booking_Date.getTime());
		pre.setDate(3, sqldate);
		int rs = pre.executeUpdate();
		 
	} catch (SQLException e) {
		e.printStackTrace();
	} 
	 
  }
}