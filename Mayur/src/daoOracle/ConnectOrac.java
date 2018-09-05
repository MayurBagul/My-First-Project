package daoOracle;

import java.sql.*;

public class ConnectOrac 
{
	Connection con;
	public Connection connect()
	{
	
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Mayur","MayurBagul");
		
		System.out.println("Connection Established");
		
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
	
	
	public void insert()
	{
		try
		{
		PreparedStatement p=con.prepareStatement("Insert into signup(?,?,?,?,?,?)");
		p.setInt(1, 1);
		p.setString(2, "fname");
		p.setString(3, "lname");
		p.setString(4, "email");
		p.setString(5, "username");
		p.setString(6, "password");
		
		int i=p.executeUpdate();
		
		if(i==1)
			System.out.println("Record Has been inserted Successfully");
		else
			System.out.println("Record Insertion Failed");
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
	
	
	public void close()
	{
		try 
		{
			con.close();
			System.out.println("Connection closed");
		}
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
		
	}
	
public static void main(String args[])
{
	ConnectOrac c= new ConnectOrac();
	c.connect();
	c.insert();
	c.close();
	
}


}

