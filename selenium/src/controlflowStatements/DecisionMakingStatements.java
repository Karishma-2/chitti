package controlflowStatements;

import java.util.Scanner;

public class DecisionMakingStatements {
	public void checkAisGreater()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt();
		int	b=scan.nextInt();
		if(a>b)
		{
			System.out.println("A is Greater");
		}
	else
	{
	System.out.println("B is Greater");
	}
	}
	public static void main(String[] args) {
		DecisionMakingStatements obj=new DecisionMakingStatements();
		obj.checkAisGreater();
	}
}


