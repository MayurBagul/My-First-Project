package cal;

public class Pro2_Addition extends Pro1_Input{

	int a,b,sum=0;
	
	public void Addtion(Pro1_Input p1,Pro2_Addition p2)
	{
	
		System.out.println("\n\tWelcome to Project Calculator!\n\n\tHere You Can Do Additon Operation \n");
		
		p1.input();
		
		a=(int)p1.a;
		
	    b=(int)p1.b;
	    
	    
		sum=a+b;
		
		System.out.println("\n\tAddtion Of Number "+p2.a+"  and  Number  "+p2.b+"  "
				+ "is =\t"+p2.sum);
		
	}
	
	
	public static void main(String[] args) {

		Pro1_Input p1=new Pro1_Input();
		
		Pro2_Addition p2=new Pro2_Addition();
		
		
		p2.Addtion(p1,p2);
		
	
		                            
	}                                      

}
