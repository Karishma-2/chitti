package methodpackage;

import java.util.Scanner;

public class Type3 {
//Type 3: without retun type with parameter
	public void product(int a,int b)
	{
		System.out.println("Type3 product:"+(a*b));
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		Type3 obj3=new Type3();
		obj3.product(a,b);
		
	}

}
