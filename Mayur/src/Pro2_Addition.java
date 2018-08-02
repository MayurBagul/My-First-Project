
public class Pro2_Addition extends Pro1_Input{

	int a,b,sum=0;
	
	public void Addtion(Pro1_Input p1)
	{
	
		a=(int)p1.a;
		
	    b=(int)p1.b;
	    
		sum=a+b;
		
	}
	
	
	public static void main(String[] args) {

		Pro1_Input p1=new Pro1_Input();
		
		Pro2_Addition p2=new Pro2_Addition();
		
	//	p1.input();
		p2.Addtion(p1);
		
		System.out.println("\nAddtion Of Number "+p2.a+"  and  Number  "+p2.b+"  "
				+ "is =\t"+p2.sum);
		                            
	}                                      

}
