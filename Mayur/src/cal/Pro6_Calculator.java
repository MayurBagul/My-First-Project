package cal;

import java.util.Scanner;

public class Pro6_Calculator extends Pro2_Addition {

	int mul,sub;
	float div;
	static int ch=0;
	
	void Presenting(Scanner s)
	{
	
		System.out.println("\n\n\t\t WELCOME TO PROJECT CALCULATOR !\n");
		System.out.println("\n\t\t CHOOSE ANY ONE OPTION FROM BELOW MENU TO SOLVE PROBLEM AS PER REQUIREMENT !");
		System.out.println("\n\n\t 1. ADDITION \n");
		System.out.println("\n\t 2. DIVISION \n");
		System.out.println("\n\t 3. MULTIPLICATION \n");
		System.out.print("\n\tPLEASE ENTER YOUR CHOICE = \t");
		
		ch=s.nextInt();
		
	}
	
	public static void main(String[] args) {
		
		
		Pro6_Calculator p6=new Pro6_Calculator();
		
		Pro1_Input p1=new Pro1_Input();
		
		Pro2_Addition p2=new Pro2_Addition();
		
		Pro3_Division p3=new Pro3_Division();
		
		Pro5_Multiplication p5=new Pro5_Multiplication();
		
		Scanner s=new Scanner(System.in);
			
		p6.Presenting(s);
		
		switch(ch)
		{
		case 1: p1.input();
				p2.Addtion(p1,p2);
			
		break;
		
		case 2: p3.division(p1,p3);
			
		break;
		
		case 3: p5.multiplication(p1, p5);
		
		break;
		
		default:
			System.out.println("\n\tSORRY ! \n\t YOU HAVE TO ENTER CORRECT INPUT!\n\t "
					+ "PLEASE SELECT APPROPRIATE OPTION!");
						
		}
		
	}

}
