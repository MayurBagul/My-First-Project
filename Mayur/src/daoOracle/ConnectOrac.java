package daoOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.LogBean;
import bean.Signbean;
import servletprograms.Checklog;

public class ConnectOrac 
{
	Connection con;
	boolean verified=false;
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
	
	
	public void insert(Signbean l)
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
	
	
	public boolean loginFetch(LogBean lb)
	{
		try
		{
	
			ArrayList <String> login_fetch=new ArrayList<>();
			
			login_fetch.add(lb.getUser_name());
			
			login_fetch.add(lb.getPassword());
			
			String qry="select username, password from signup where username=? and password=?";
			
			PreparedStatement p=con.prepareStatement(qry);
			
			p.setString(1, login_fetch.get(0));
			
			p.setString(2, login_fetch.get(1));
			
			
			ResultSet rs=p.executeQuery();
			
			
			while(rs.next())
			{
				if(rs.getString(1).equals(lb.getUser_name())&&rs.getString(2).equals(lb.getPassword()))
				{
					
					verified=true;
					
					//System.out.println("\tWelcome To TechMayur.com ");
				}
			
			//System.out.println(rs.getString(1)+""+rs.getString(2));
			}
		
			
			
		
			
		//	signup_fetch.add(rs.getString(1));
			
		
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return verified;
		
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
	
	
	/*public static void main(String args[])
	{
		ConnectOrac o=new ConnectOrac();
	
	}	*/

}

