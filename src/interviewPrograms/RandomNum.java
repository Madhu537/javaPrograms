package interviewPrograms;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {

		Random rand = new Random();
		int ranInt = rand.nextInt(100);
		System.out.println(ranInt);

	}

}
