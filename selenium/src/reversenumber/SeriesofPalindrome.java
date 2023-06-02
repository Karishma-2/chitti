package reversenumber;

import java.util.Scanner;

public class SeriesofPalindrome extends ReverseNumbers{
	private int lw,up;
	private void ScanRange()
	{
		System.out.println("Enter lw,up values");
		lw=scan.nextInt();
		up=scan.nextInt();
	}

public int displaySeriesofPalindrome() {
	this.ScanRange();
	int count=0;
	for(int i=lw;i<=up;i++)
	{
		int rev1=this.getReverseofNumbers(i);
		boolean status=this.ispalindrome(i, rev1);
        if(status)
        	count++;
        this.displaypalindromeornot(status,rev1);
	}
	return count;
}
public void display(int count)

{
	System.out.println("in a given range i.e "+lw+" "+up+"No.of palindrome : "+count);
}
}
