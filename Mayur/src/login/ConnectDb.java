package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
	
	Connection con=null;
	
	Connection connect()
	{
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayur","Mayur","Mayur1234");
		}
		
		
		catch (ClassNotFoundException e ) {
		
			
			e.printStackTrace();
	
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	
		return con;
		
	}
	
	
	void close(Connection connect)
	{
		try {
			connect.close();
		} 
		
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	

}
