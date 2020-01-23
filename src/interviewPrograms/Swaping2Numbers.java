package interviewPrograms;

public class Swaping2Numbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Before swaplping :"+a+" "+b);
		
		a = a+b; //30
		b = a-b; //10
		a = a-b; //20
		
		System.out.println("After swapping: "+a+ " "+b);
		
	}
}
