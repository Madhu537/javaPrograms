package interviewPrograms;

import java.util.Arrays;

public class AnagramChecker {

	public boolean isAnagram(String s1, String s2) {
		
		char[] Str1 = s1.toCharArray();
		Arrays.sort(Str1);
		char[] Str2 = s2.toCharArray();
		Arrays.sort(Str2);
			
		return Arrays.equals(Str1, Str2);
		
	}
	public static void main(String[] args) {
		AnagramChecker AC = new AnagramChecker();
		System.out.println(AC.isAnagram("MADHU BABU", "DHUMA BUBA"));
	}
}
