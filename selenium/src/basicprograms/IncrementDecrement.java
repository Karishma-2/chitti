package basicprograms;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a=30;
		int b=25;
		int c= a++ + +a;
		int d= +c  + --a;
		int e= ++d - b++;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
