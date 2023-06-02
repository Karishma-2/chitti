package loops;

import java.util.Scanner;

public class SumOfOddNumbers {
	private Scanner scan;
	public SumOfOddNumbers()
	{
		scan=new Scanner(System.in);
	}
	public int ScanIntValue(String type)
	{
		System.out.println(type);
		return scan.nextInt();
	}
	public int displayOddNumbers(int lw,int up)
	{
		System.out.println("Odd Number:");
		int sum=0;
		for(int i=lw;i<=up;i++)
		{
			if(i%2==1) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		return sum;
	}
	public void displaySumOfOddNumbers(int sum, String type)
	{
		System.out.println("sum of above OddNumbers:"+sum);
	}
	public static void main(String[] args) {
		SumOfOddNumbers obj=new SumOfOddNumbers();
		int lw=obj.ScanIntValue("EnterLowerLimit:");
		int up=obj.ScanIntValue("EnterUpperLimit:");
		int sum=obj.displayOddNumbers(lw, up);
		obj.displayOddNumbers(sum,sum);

	}

}
