package loops;

import controlflowStatements.Calculator;

public class NewCalculator extends Calculator{
	public void Square(int a) {
		System.out.println("square= "+(a*a));
	}
public static void main(String args[])
{
	NewCalculator cal3=new NewCalculator();
	cal3.add(6, 7);
	cal3.Square(5);
}
}