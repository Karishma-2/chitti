package Patterns;

public class Numberpattern4 {
	public void displayNumberpattern4(int rows)
	{
		for(int i=rows;i>=1;i--)
		{
			for(int space=rows;space>i;space--)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
           System.out.print(j+"");
			}
			System.out.println();
		}
	 }
  
	public static void main(String[] args) {
		Numberpattern4 np=new Numberpattern4();
		np.displayNumberpattern4(5);
	}

}
