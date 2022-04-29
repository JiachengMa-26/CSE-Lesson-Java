package p9_callable_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoArrayList {

	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		ArrayListTask t1 = new ArrayListTask(list);
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<List<Integer>> future1 = executor.submit(t1);
		Future<List<Integer>> future2 = executor.submit(t1);
		executor.shutdown();
		
		try {
			List<Integer> list1 = future1.get();
			List<Integer> list2 = future2.get();
			System.out.println(list1.size() + " --- " + list2.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}

}
