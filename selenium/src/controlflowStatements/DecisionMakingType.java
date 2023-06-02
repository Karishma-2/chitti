package controlflowStatements;

import java.util.Scanner;


public class DecisionMakingType {
	public void checkAisGreater()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		if(a>b)
		{
	    System.out.println("A is Greater");
		}
		else if(b>a)
		{
			System.out.println("B is Greater");
		}
		else
		{
			
			System.out.println(" AorB values are equal");
		}
		
	}
}
