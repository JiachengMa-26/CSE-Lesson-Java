package p3_synchronized_method;

public class Demo {
	private int count;
	
	public static void main(String[] args) {
		new Demo().incrementCount();
	}
	
	public synchronized void increment() {
		count++;
	}
	
	public void incrementCount() {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				increment();
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
		
		System.out.println("Total: " + count);
	}

}
