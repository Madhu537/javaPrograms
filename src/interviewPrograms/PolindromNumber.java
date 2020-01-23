package interviewPrograms;

import java.util.Scanner;

public class PolindromNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your nuber: ");
		int num = sc.nextInt();
		int OriginalNum = num;

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (OriginalNum == rev) {
			System.out.println("Enter number is polindrom");
		}

		else {
			System.out.println("Enter num is NOT a polindrom");
		}

	}

}
