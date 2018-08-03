import java.util.Scanner;

public class Pro7_Table {

	int num,limit=0;
	
	void table(Scanner s)
	{
		
	System.out.println("\n\tEnter Number for getting its table = \t");
	
	num=s.nextInt();
	
	System.out.println("\n\tEnter Limit Number for getting table upto which  = \t");
	
	limit=s.nextInt();
	
	for(int i=1;i<=limit;i++)
	{
		System.out.print("\n\t"+num*i);
	}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pro7_Table p7=new Pro7_Table();
		
		Scanner s=new Scanner(System.in);
		
		p7.table(s);
		
	}

}
