package p2_3_thread_creation;

public class Demo {

	public static void main(String[] args) {
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i = 0; i < 10; i++) {
//					System.out.println("Hi " + i + ": " + Thread.currentThread().getName());
//					try {
//						Thread.sleep(20);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		});
//		
//		t1.start();
//		
//		Thread t2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i = 0; i < 10; i++) {
//					System.out.println("Bye " + i + ": " + Thread.currentThread().getName());
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		});
//		
//		t2.start();
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				System.out.println("Hi " + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				System.out.println("bye " + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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
		System.out.println("The main thread is finished!");
	}

}
