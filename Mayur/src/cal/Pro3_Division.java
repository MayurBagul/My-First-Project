package cal;

public class Pro3_Division  {

	int a,b;
	float div=0.0f;
	
	void division(Pro1_Input p1,Pro3_Division p3)
	{
		System.out.println("\n\tHere You Can Do Division Operation ! \n");
		
		p1.input();
		
		div=p1.a/p1.b;
		
		System.out.println("\n\tDivision Of Number "+p1.a+"  and  Number  "+p1.b+"  is = \t"+p3.div);
		
	}
	
	public static void main(String[] args)  {

		
		Pro1_Input p1=new Pro1_Input();
		
		Pro3_Division p3=new Pro3_Division();
		
		p3.division(p1,p3);
		
	
	}

}
