package interviewPrograms;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		System.out.println("After reverce: " + rev);

	}

}
