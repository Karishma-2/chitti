package Arrays;

public class FebonacciSeries {

	public static void main(String[] args) {
		
		int pre= 0;
		int next= 1;
		System.out.print(pre+" "+next);
		for(int i=2;i<7;i++)
		{
			int sum = pre+next;
			System.out.print(sum);
			 pre=next;
			 next=sum;
		}
		
	}

}
