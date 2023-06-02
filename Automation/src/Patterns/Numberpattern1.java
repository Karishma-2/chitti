package Patterns;

import java.util.regex.Pattern;

public class Numberpattern1 {
	public void displayNumberPatterns(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)      //j=i , j<=i ==> output all '5'  j=1,j<=rows ==> 5555  j=1,j<=i ==> 5 55 555 5555 55555
			{
				// * replace to number 
				System.out.print("*"+" ");
				//System.out.print("5");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Numberpattern1 np=new Numberpattern1();
		np.displayNumberPatterns(5);

	}

}
