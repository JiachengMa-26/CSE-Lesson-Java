package p5_volatile;

public class Processor extends Thread {
	private volatile boolean flag = true;
	
	@Override
	public void run() {
		while(flag) {
			System.out.println("Hi");
		}
	}
	
	public void shutdown() {
		flag = false;
	}

}
