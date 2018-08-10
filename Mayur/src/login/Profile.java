package login;
import java.sql.*;



public class Profile {

	public static void main(String[] args)  {
	
		Connection con=null;
		
		abc a=new abc();
		pqr p=new pqr();
		
		
	try {
			
		con=a.connect();
		

		p.selectFun(con);
		
       } 
	
	 finally
	  
	  {
		  a.close(con);
	  }
	
	}

}
