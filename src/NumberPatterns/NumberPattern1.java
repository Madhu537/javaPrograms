package NumberPatterns;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your limit: ");
		int limit = sc.nextInt();
		for (int i = 1; i <=limit; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(i+" ");
				
			}
			
			System.out.println();
			
		}

	}

}
