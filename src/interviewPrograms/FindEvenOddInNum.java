package interviewPrograms;

public class FindEvenOddInNum {

	public static void main(String[] args) {
		
		int num = 12345;
		int evenCnt = 0;
		int Oddcount = 0;
		
		while(num>0)
		{
			int reminder = num%10;
			if(reminder%2==0)
			{
				evenCnt++;
			}
			else
			{
				Oddcount++;
			}
			
			num = num/10;
		}
			System.out.println("EvenNumCnt is: "+evenCnt);
			System.out.println("OddNumCnt is: "+Oddcount);
	}

}
