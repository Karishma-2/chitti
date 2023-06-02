package reversenumber;

import org.junit.Assert;
import org.junit.Test;

public class SeriesOfPalindromeTest {
@Test
	public void main() {
	try {
		SeriesofPalindrome obj=new SeriesofPalindrome();
		int count=obj.displaySeriesofPalindrome();
		obj.display(count);
		Assert.assertTrue(false);
	}
	catch(Throwable e)
	{
		System.out.println("Welcome");
	}
	
	}

}
