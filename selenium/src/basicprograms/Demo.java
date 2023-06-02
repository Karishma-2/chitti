package basicprograms;

import java.util.Scanner;
public class Demo{
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	  System.out.println("Enter Name:");
	String name = scan.nextLine();
	  System.out.println("Enter Age:");
	int age = scan.nextInt();
	  System.out.println("Enter EmailId:");
	String emailId = scan.next();
	  System.out.println("Enter Marks:");
	Long marks = scan.nextLong();
	  System.out.println("Enter Percentage:");
	Float per =scan.nextFloat();
	  System.out.println("Enter Grade:");
	char grade = scan.next().charAt(0);
	  System.out.println("Are you going to warangal");
	Boolean  warangal = scan.nextBoolean();
	 System.out.println("Name:" +name+"\nage: "+age); 
	 System.out.println("EmailId:" +emailId+"\nmarks: "+marks);
	 System.out.println("Percentage:" +per+"\ngrade: "+grade);
	  	
	}
}

