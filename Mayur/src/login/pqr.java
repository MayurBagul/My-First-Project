package login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pqr {

	
	
	void selectFun(Connection con)
	{
		try
		{
			
		
         Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("Select * from login");
		
		while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getInt(3));
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	void Insert(Connection con)
	{
		
		   Statement st=null;
		   
		   
	try {
			st = con.createStatement();
		int j=st.executeUpdate("Insert into login values(3,'Sandip',123)");
		
		if(j==1)
		System.out.println("Record Inserted Successfully ! ");
		}
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		   
		
        

	}
	
	
	
	
}
