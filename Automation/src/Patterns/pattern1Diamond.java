package Patterns;

public class pattern1Diamond {

	public static void gotonextLine(int k, int i,  int p)
	{
		if (k == i)
		
			return;
		System.out.print("* ");
		gotonextLine(k + p, i, p);
		
	}
	
	static void addblankSpaceInDiamond(int j,int i,int p)
	{
		if(j == i)
			return;
		System.out.print(" ");
		addblankSpaceInDiamond(j + p, i, p);
	}
	static void upperDiamond(int row, int i)
	{
		if(i > row)
			return;
		addblankSpaceInDiamond(row, i, -1);
		gotonextLine(0, i, 1);
		System.out.print("\n");
		upperDiamond(row, i + 1);
	}
	static void lowerDiamond(int row, int i)
	{
		if (i > row)
			return;
		addblankSpaceInDiamond(0, i, 1);
		gotonextLine(row, i, -1);
		System.out.print("\n");
		lowerDiamond(row, i+1);
	}
	public static void main(String[] args)
	{
		int row=5;
		upperDiamond(row, 0);
		lowerDiamond(row, 1);
	}
		
	


}

