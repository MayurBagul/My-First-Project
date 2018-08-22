package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import bean.Logbin;

public class Queries {

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
	
	public void Insert(Connection con,Logbin l)
	{
		
		   Statement st=null;
		   
		   
	try {
			st = con.createStatement();
			
			
			//System.out.println("in insert>>>>>>"+con);
		//	System.out.println("R "+l.getFname());
		int j=st.executeUpdate("Insert into signup (fname,lname,mail,uname,password) values('"+l.getFname()+"',' "+l.getLname()+"','"+l.getEid()+"','"+l.getUname()+"','"+l.getPass()+"')");
		
		if(j==1)
		System.out.println("Your Account Has been Created Successfully ! ");
		else 
		System.out.println("Failed to insert");
		}
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		   
	}

}
