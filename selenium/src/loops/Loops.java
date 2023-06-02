package loops;

import java.util.Scanner;

public class Loops {
	
	Scanner scan;
	public Loops()
	{
		scan=new Scanner(System.in);
	}
	 public void displayNaturalNumbersUsingWhileloop() {
	 {
	  System.out.println("Enter n and max values");
	  int n=scan.nextInt();
	  int max=scan.nextInt();
	  while (n<=max)
	 {
	  System.out.println(n);
	  n++;
	 }
	}
  }
}


			
								
	
	