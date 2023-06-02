package reversenumber;

public class ReverseNumberTest {

	public static void main(String[] args) {
		ReverseNumbers obj=new ReverseNumbers();
		int n=obj.scanNvalue();
		int rev=obj.getReverseofNumbers(n);
		obj.displayReverse(n, rev);
		boolean status=obj.ispalindrome(n, rev);
	    obj.displaypalindromeornot(status, rev);
	}
}





