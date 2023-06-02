package reversenumber;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr Number");
		int n=scan.nextInt();
		int rev=0;
		int temp=n;
		while (n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse :"+rev);
		if(temp==rev)
		System.out.println(" is palindrome");
		else
			System.out.println(" is not palindrome");
	}

}
