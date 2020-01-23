package interviewPrograms;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range: ");
		int num = sc.nextInt();
		int f1=0;
		int f2 = 1;
		int f3 = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(f3+ " ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;

		}

	}

}
