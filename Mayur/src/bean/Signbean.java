package bean;

public class Signbean {
	
	private String fname,lname,uname,pass,emid ;
	int id;
	
	public String getFname()
	{
		return fname;
	}
	
	public String getLname()
	{
		return lname;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getUname()
	{
		return uname;
	}
	
	public String getPass()
	{
		return pass;
	}
	
	public String getEmid()
	{
		return emid;
	}
	
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	
	public void setLname(String lname)
	{
		this.lname=lname;
	}
	
	public void setEid(int id)
	{
		this.id=id;
	}
	
	public void setUname(String uname)
	{
		this.uname=uname;
	}
	
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	
	
	public void setEmid(String emid)
	{
		this.emid=emid;
	}

}
