package Arrays;

import java.util.Scanner;

public class array5 {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scan.nextInt();
		
		String a[]=new String[size];
		System.out.println("Enter array values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.next();
		}
		System.out.println("Array values");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[%d]=%dn"+a[i]);
		}
	}

}
