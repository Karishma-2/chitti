package com.Drb;

public class childclass
{
	
	int a=10;
	static int b=20;
	public static void main(String args[])
	{
		childclass obj=new childclass();
		//System.out.println(b);
		
		System.out.println(obj.a);
		
		parentclass	dr=new parentclass();
		dr.Brother();
		
		parentclass.friend();
		
		
		//obj.add();
		
		sum();
	}
	
	
	
	public void add()
	{
	
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("hello im from add");
	}
	public static void sum()
	{
		childclass obj=new childclass();

		System.out.println(obj.a);
		System.out.println("hello im from static method");
		
		mul();
		
	}
	public static void mul() 
	{
		System.out.println("im from mul method this is static");
	}

}
