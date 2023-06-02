package Arrays;

import java.util.Scanner;



public class array1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter values:");
	int size=scan.nextInt();
	int marks[]=new int[size];
	
	
	for(int i=0;i<marks.length;i++)
	{
		//marks[i]=scan.nextInt();
		System.out.println("Array values:"+i);

	}
	//System.out.println("Array values:");
	
	for(int i=0;i<marks.length;i++)
	{
	System.out.println(marks[i]);	
	}
	}

}
