package p2_1_thread_creation;

public class Demo1 {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		Thread t1 = new Thread(r1);
		t1.start();
	
		new Runner().start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
