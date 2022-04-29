package p2_2_thread_creation;

public class Runner implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hi " + i + ": " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		System.out.println(Thread.currentThread().getName());
	}

}
