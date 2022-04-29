package p9_callable_arraylist;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class ArrayListTask implements Callable<List<Integer>>{
	
	private static List<Integer> list;
	
	public ArrayListTask(List<Integer> list) {
		this.list = list;
	}

	@Override
	public List<Integer> call() throws Exception {
		Random rand = new Random();
		for(int i = 0; i < 1000; i++) {
			list.add(rand.nextInt(100));
		}
		return list;
	}

	
}
