import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;


public class Insertorders  {									
	
	public void orderinsert() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/Fooddelivery";
		String username = "root";
		String password = "2823";
		String Query = "insert into orders values(?,?,?,?,?)";
		Connection co = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = co.prepareStatement(Query);
		ps.setInt(1,11);
		ps.setInt(2, 12);
		ps.setInt(3, 13);
		ps.setInt(4, 23);
		ps.setNString(5, "preparing");
		
		ps.executeUpdate();
		ps.close();
		
		
	}
	
	
	public static void main(String[]args) throws Exception {
		Insertorders obj = new Insertorders();
		obj.orderinsert(); 
	}
	
}

