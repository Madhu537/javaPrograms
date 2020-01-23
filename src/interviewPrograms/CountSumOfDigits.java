package interviewPrograms;

public class CountSumOfDigits {

	public static void main(String[] args) {
			
		
		int sum = 0;
		int num = 12345;
		
		while(num>0)
		{
			sum = sum+num%10;
			num = num/10;
		}
		
		System.out.println("Total count of a num is: "+sum);

	}

}
