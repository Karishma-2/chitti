package controlflowStatements;

import java.util.Scanner;

public class DecisionMakingStatements1 {
Scanner scan=new Scanner(System.in);
public void checkAisGreater()
{
System.out.println("Enter A,B values");
int a=scan.nextInt(),b=scan.nextInt();
if(a>b)
{
	System.out.println("A is Greater");
}
}
public void checkAorBisGreater()

{
	System.out.println("Enter A,B values");
	int a=scan.nextInt(), b=scan.nextInt();
	if(a>b)
	{
	System.out.println("A is Greater");	
	}
	else if (b>a)
	{
		System.out.println("B is Greater");																																									
		
	}
		else
		{
			System.out.println("A,B, values are equal");
		}
		}
	public static void main(String[] args) {
		DecisionMakingStatements1 obj=new DecisionMakingStatements1();
		obj.checkAisGreater();
		obj.checkAorBisGreater();
	}
}
	

