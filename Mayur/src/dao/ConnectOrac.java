package dao;

import java.sql.*;

public class ConnectOrac 
{
	Connection con;
	public Connection connect()
	{
	
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Mayur");
		
		System.out.println("Connection Established");
		
		con.close();
		System.out.println("Connection closed");
		
		}
		
	
		catch (ClassNotFoundException e) 
		{
		e.printStackTrace();
		}
	
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		return con;
	
	}

public static void main(String args[])
{
	ConnectOrac c= new ConnectOrac();
	
	c.connect();
}

}

