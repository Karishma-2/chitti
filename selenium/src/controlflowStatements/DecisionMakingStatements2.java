package controlflowStatements;

import java.util.Scanner;

public class DecisionMakingStatements2 {
	public Scanner scan;
	DecisionMakingStatements2()
	{
		System.out.println("Hello Iam Consturctor without parameter");
		scan=new Scanner(System.in);
	}
	DecisionMakingStatements2(Scanner scan)
	{
		System.out.println("Hello Iam Constructor with parameter");
		this.scan=scan;	
	}
public static void main(String[] args) {
	DecisionMakingStatements2 obj=new DecisionMakingStatements2();
      
     
      
}

}



