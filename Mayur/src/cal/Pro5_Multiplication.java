package cal;

public class Pro5_Multiplication extends Pro1_Input{

		int mul=0;

		void multiplication(Pro1_Input p1, Pro5_Multiplication p5)
		{
			System.out.println("\n\tHere You can do Multiplication !\n");
			
			p1.input();
			
			mul=(int)p1.a*(int)p1.b;
			
			System.out.println("\n\tMultiplication of Number "+p1.a+" and Number "+p1.b
					+" is\t"+p5.mul);
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pro1_Input p1=new Pro1_Input();
		
		Pro5_Multiplication p5=new Pro5_Multiplication();
		
		p5.multiplication(p1,p5);
		
		
	}

}
