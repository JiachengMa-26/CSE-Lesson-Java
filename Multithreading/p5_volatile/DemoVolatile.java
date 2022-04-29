package p5_volatile;

import java.util.Scanner;

public class DemoVolatile {

	public static void main(String[] args) {
		Processor t1 = new Processor();
		t1.start();
		System.out.println("Press the Enter key to pause: ");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		t1.shutdown();
	}

}
