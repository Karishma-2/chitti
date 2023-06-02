package loops;

import java.util.Scanner;

public class SumOfEvenNumbers {

	private Scanner scan;
	public SumOfEvenNumbers()
	{
		scan=new Scanner(System.in);
	}
	public int ScanIntValue(String type)
	{
		System.out.println(type);
		return scan.nextInt();
	}
	public int displayEvenNumbers(int lw,int up)
	{
		System.out.println("Even Number:");
		int sum=0;
		for(int i=lw;i<=up;i++)
		{
			if(i%2==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		return sum;
	}
	public void displaySumOfEvenNumbers(int sum)
	{
		System.out.println("sum of above EvenNumbers:"+sum);
	}
	public static void main(String[] args) {
	SumOfEvenNumbers obj=new SumOfEvenNumbers();
	int lw=obj.ScanIntValue("EnterLowerLimit:");
	int up=obj.ScanIntValue("EnterUpperLimit:");
	int sum=obj.displayEvenNumbers(lw, up);
	obj.displayEvenNumbers(sum, sum);
	}

	}


