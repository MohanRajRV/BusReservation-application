package bus_reservation;
import java.sql.*;
public class DBconnection {
    public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bus?characterEncoding= latin1","root","Kingofmp40");
    	
    }
}
