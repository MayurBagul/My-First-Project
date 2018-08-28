package dao;
import java.sql.*;

public class PrepStatem 
{
	
	Connection con=null;
	
	void update()
	{
		PreparedStatement p1;
		try 
		{
			p1 = con.prepareStatement("update emp set name=? where id=?");
			p1.setString(1, "John");
			p1.setInt(2, 1);
			
			int i=p1.executeUpdate();
			
			System.out.println(i+"Record Updated Sucessfully");
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	void insert()
	{
		PreparedStatement p;
		try 
		{
			p = con.prepareStatement("insert into emp values(?,?)");
			
			p.setInt(1, 1);
			
		    p.setString(2, "Mayur");
			
			int i=p.executeUpdate();
			
			System.out.println(i+"Record Inserted Sucessfully");
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	public void delete()
	{
		try 
		{
			PreparedStatement p=con.prepareStatement("delete from emp where id=?");
			
			p.setInt(1,1);
			
			int i=p.executeUpdate();
			
			System.out.println(i+"Record Deleted successfully");
		
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void select()
	{
		PreparedStatement p;
		
		try {
			p = con.prepareStatement("select * from emp");
			
			ResultSet r=p.executeQuery();
			
			while(r.next())
			{
				System.out.println(r.getInt(1)+""+r.getString(2));
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	
	}
	
	Connection connect()
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
	
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayur","Mayur", "Mayur1234"); 
	
		} 
	
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public void close(Connection co)
	{
		try 
		{
			co.close();
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	
	public static void main(String args[])
	{
		PrepStatem p=new PrepStatem();
		Connection con=null;
		p.connect();
		p.delete();
		p.close(con);
		
	}
	
	
	
	
	
}
