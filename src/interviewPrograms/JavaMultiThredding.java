package interviewPrograms;

class Hi extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
}

public class JavaMultiThredding {

	public static void main(String[] args) throws InterruptedException {

		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		Thread.sleep(5);
		obj2.start();

	}

}
