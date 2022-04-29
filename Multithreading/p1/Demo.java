package p1;

public class Demo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hi " + i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println(Thread.currentThread().getName());
	}

}
