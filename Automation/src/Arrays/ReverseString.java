package Arrays;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	String strn="preethi " , nstr="";
	System.out.println(strn);
	//convert string to char 
	char ch;
	for (int i=0; i<strn.length(); i++)
	{  
	ch= strn.charAt(i);
	nstr= ch+nstr;
	}
	// add each  character infront of existing string
   System.out.println("Reverse word: "+ nstr);  
}
}
