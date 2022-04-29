package p2_2_thread_creation;

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		t1.start();
		t2.start();
		
		try {
			t1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main Method is done!");
	}

}
