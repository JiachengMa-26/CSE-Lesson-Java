package p2_1_thread_creation;

public class Runner extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hi " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}

}
