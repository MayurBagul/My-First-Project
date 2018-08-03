
public class Pro8_Remainder {

	int rem=0;
	
	void remainder(Pro1_Input p1,Pro8_Remainder p8)
	{
		p1.input();
		
		rem=(int)p1.a%(int)p1.b;
		
		System.out.println("Remainder of Number =\t"+p1.a+
				"and  Number "+p1.b+"is  \t= "+p8.rem);
	}
	
	
	public static void main(String[] args) {
		

		Pro1_Input p1=new Pro1_Input();
		
		Pro8_Remainder p8=new Pro8_Remainder();
		
		p8.remainder(p1, p8);
		
		
	}

}
