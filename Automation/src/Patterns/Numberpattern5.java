package Patterns;

public class Numberpattern5 {
	 public void displayNumberpattern5(int rows)
	 {
		 for(int i=rows;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(i+"  ");
			 }
			 for(int space=rows;space>i;space--)
			 {
				 System.out.print("  ");
			 }
			 for(int j=i;j>=1;j--)
			 {
				 System.out.print(j+"  ");
			 }
			 System.out.println();
		 }
	 }

	public static void main(String[] args) {
		Numberpattern5 np=new Numberpattern5();
		np.displayNumberpattern5(5);

	}

}
