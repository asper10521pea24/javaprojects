
import java.sql.*;

public class Getbyidorders {
	
	public void getbyid()throws Exception {
		
	String url ="jdbc:mysql://127.0.0.1:3306/Fooddelivery";
	String username ="root";
	String password ="2823";
	String Query = "select*from orders where order_id = 11 ";
	Connection connect = DriverManager.getConnection(url,username,password);
	Statement state = connect.createStatement();
	ResultSet res = state.executeQuery(Query);
	while (res.next()){
		System.out.println("order_id"+res.getInt(1));
		System.out.println("customer_id"+res.getInt(2));
		System.out.println("ordre_status"+res.getString(5));
		
	}connect.close();
}

	public static void main (String[]args) throws Exception {
		
		Getbyidorders object = new Getbyidorders();
		object.getbyid();
		
	}
}