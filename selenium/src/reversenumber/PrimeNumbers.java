package reversenumber;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scan.nextInt();
		int factors=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				factors++;
			}
		}
		if(factors==2)
			System.out.println(n+"is Prime Number");
		else
			System.out.println(n+"is not Prime Number");
	}

}
