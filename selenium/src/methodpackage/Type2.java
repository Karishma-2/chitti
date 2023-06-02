package methodpackage;

import java.util.Scanner;

public class Type2{
	//Type 2: with return type without parameter
	public int product()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		int c=a*b;	
		return c;
	}
		public static void main(String args[]) {
			Type2 obj2=new Type2();
	     int c= obj2.product();
		System.out.println("Type2 product:"+c);
		System.out.println(c+100);
		}
	}

