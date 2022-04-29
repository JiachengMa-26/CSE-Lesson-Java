package p7_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoCallable {

	public static void main(String[] args) {
		FactorialTask t1 = new FactorialTask(3);
		FactorialTask t2 = new FactorialTask(4);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Future<Integer> future1 = executor.submit(t1);
		Future<Integer> future2 = executor.submit(t2);
		executor.shutdown();
		
		try {
			Integer result1 = future1.get();
			int result2 = future2.get().intValue();
			System.out.println("The factorial of 3 is: " + result1);
			System.out.println("The factorial of 4 is: " + result2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread is completed.");
	}

}
