package bus_reservation;
import java.sql.*;
public class BusDBO {
  public void displayBusDetails() throws SQLException{
	  String query = "select*from businfo";
	  try {
		Connection con = DBconnection.getConnection();
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(query);
		System.out.println("---------------------------------------------------");
		while(rs.next()) {
			System.out.println("the bus number is:"+rs.getInt(1));
			System.out.println("the capacity is:"+rs.getInt(2));
			if(rs.getBoolean(3)) {
				System.out.println("AC : YES");
			}
			else {
				System.out.println("AC : NO");
			}
			
		}
		System.out.println("---------------------------------------------------");
		stm.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
