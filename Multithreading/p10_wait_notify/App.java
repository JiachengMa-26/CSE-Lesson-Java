package p10_wait_notify;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Object lock = new Object();
		
		Thread t1 = new Thread(() -> {
			synchronized(lock) {
				System.out.println("t1 got the lock.");
				try {
					lock.wait(); // relinguish the lock
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t1 regained the lock.");
			}
		});
		
		Thread t2 = new Thread(() -> {
			Scanner scanner = new Scanner(System.in);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(lock) {
				System.out.println("t2 gained the lock.");
				System.out.println("Waiting for the return key to be pressed:");
				scanner.nextLine();
				System.out.println("The return key was pressed.");
				lock.notify();
				System.out.println("t2 is losing the lock.");
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
