package interviewPrograms;

public class CountNumInString {

	public static void main(String[] args) {
		int count =0;
		String s = "Madhu537";
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i)))
					{
				count++;
					}
			
		}

	}

}
