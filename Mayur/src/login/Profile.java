package login;
import java.sql.*;



public class Profile {

	public static void main(String[] args)  {
	
		Connection con=null;
		
		ConnectDb a=new ConnectDb();
		Queries p=new Queries();
				
		con=a.connect();
	
		p.selectFun(con);
		
		a.close(con);
	 
	
	}

}
