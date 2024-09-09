
import java.sql.*;


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;


public class Getorders  {									
	
	public void ordersget() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/Fooddelivery";
		String username = "root";
		String password = "2823";
		String Query = "Select * from orders";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("order_id"+rs.getInt(1));
			System.out.println("restaurant_id"+rs.getInt(2));
			System.out.println("order_status"+rs.getString(5));
		}
		
		
		con.close();
	
	}
	
	
	public static void main(String[]args) throws Exception {
		Getorders obj = new Getorders();
		obj.ordersget(); 
	}
	
}


