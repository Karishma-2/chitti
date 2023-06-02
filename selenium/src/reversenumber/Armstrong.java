package reversenumber;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values");
		int n = scan.nextInt();
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}

		if (sum == n) {
			System.out.println(" Armstrong Number");

		} else {
			System.out.println(" Not an armstrong number");
		}
	}

}
