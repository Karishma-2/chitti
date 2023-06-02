package reversenumber;

import java.util.Scanner;

public class ReverseNumbers {
	public Scanner scan;
	public ReverseNumbers()
	{
		scan=new Scanner(System.in);
	}
	public int scanNvalue()
	{
		System.out.println("Enter n value");
		int n=scan.nextInt();
		return n;
	}
	public int getReverseofNumbers(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public void displayReverse(int n,int rev)
	{
		System.out.println("Reverse of"+n+":"+rev);
	}
	public boolean ispalindrome(int n,int rev)
	{
		return n==rev;
	}
	public void displaypalindromeornot(boolean status, int rev1)
	{
		if (status)
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
	}
}

