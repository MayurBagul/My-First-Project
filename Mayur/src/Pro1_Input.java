import java.util.Scanner;

 public class Pro1_Input {

	
	float a,b;
	
	public void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your First Number = \t");
		
		a=s.nextFloat();
		
		
		
		System.out.print("Enter Your Second Number = \t");
		
		b=s.nextFloat();
		
		s.close();
		
	
	}
	
	
	public static void main(String[] args) {
			
		System.out.println("Helllo");
	
		System.out.println("Give Your Input Here !");
		
		Pro1_Input p=new Pro1_Input();
		
		p.input();
	
		
	}

}
