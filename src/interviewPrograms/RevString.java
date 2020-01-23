package interviewPrograms;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		String rev = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string to reverce");
		String str = sc.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}
		System.out.println("RevStr= " + rev);

	}

}
