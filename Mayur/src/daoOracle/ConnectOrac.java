package daoOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Logbin;
import servletprograms.Checklog;

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
	
	
	public void insert(Logbin l)
	{
		try
		{
		PreparedStatement p=con.prepareStatement("insert into signup values(?,?,?,?,?,?)");
		p.setInt(1,l.getId());
		p.setString(2, l.getFname());
		p.setString(3, l.getLname());
		p.setString(4, l.getEmid());
		p.setString(5, l.getUname());
		p.setString(6, l.getPass());
		
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
	
	
	public void loginFetch()
	{
		try
		{
			
			Checklog c=session.getAttribute();
			
			
			
			
			String qry="select username, password from signup where username=? and password=?";
			
			PreparedStatement p=con.prepareStatement(qry);
			
			ResultSet rs=p.executeQuery();
			
			
			
			
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+""+rs.getString(2));
			}
			
			
		//	ArrayList <String> signup_fetch=new ArrayList<>();
			
		//	signup_fetch.add(rs.getString(1));
			
		
			
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
		ConnectOrac o=new ConnectOrac();
		
		o.loginFetch();
		
	}

}

