//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.*;


public class Updateorders  {									
	
	public void orderupdate() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/Fooddelivery";
		String username = "root";
		String password = "2823";
		String Query = "Update orders set order_status = 'ready' where order_id = 11 ";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		
		pst.executeUpdate();
		pst.close();
		
		
		
	}
	
	
	public static void main(String[]args) throws Exception {
		Updateorders obj = new Updateorders();
		obj.orderupdate(); 
		
	}
	
}


