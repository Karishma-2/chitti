package methodpackage;
import java.util.Scanner;
public class Type1 {
	//Type1:without return type without parameter

	public static void product() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
	
	System.out.println("Type1 static product: "+(a*b));
}
public static void main(String args[]) {
	Type1.product();
}
}
	

