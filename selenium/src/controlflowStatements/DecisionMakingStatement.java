package controlflowStatements;

import java.util.Scanner;

public class DecisionMakingStatement {
	public void  checkBisGreater()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		if(b>a)
		{
			System.out.println("B is Greater");
		}
	}
	public static void main(String[] args) {
		DecisionMakingStatement obj=new DecisionMakingStatement();
	obj.checkBisGreater();
		
	}
	}
	
