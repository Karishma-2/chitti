package reversenumber;

import java.util.Scanner;

public class SeriesPalindrome 
{
public static void main(String[] args)
{	
Scanner scan=new Scanner(System.in);
System.out.println("enter range");
  int lw=scan.nextInt();
  int up=scan.nextInt();
  int count=0;
 for(int i=lw; i<=up;i++)
 {
	 int n=i;
     int temp =n;
      int rev=0;
  while(n>0)
  {
	  int rem=n%10;
	  rev=rev*10+rem;
	  n=n/10;
  }
  if(temp==rev)
  
	{
		System.out.println(temp);
		count++;
	}
 }
 if(count==0)
	 System.out.println("is palindrome number:"+count);
 else
	 System.out.println("is not a palindrome number :"+ count);
}
}


