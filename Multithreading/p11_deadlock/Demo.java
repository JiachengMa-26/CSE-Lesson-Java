package p11_deadlock;

public class Demo {

	public static void main(String[] args) {
		Processor processor = new Processor();
		Thread t1 = new Thread(() -> {
			processor.produce();
		});
		
		Thread t2 = new Thread(() -> {
			processor.consume();
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
