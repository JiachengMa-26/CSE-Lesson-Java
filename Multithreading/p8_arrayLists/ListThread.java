package p8_arrayLists;

import java.util.List;
import java.util.Random;

public class ListThread implements Runnable {
	private List<Integer> list;
	private Random rand = new Random();

	public ListThread(List<Integer> list) {
		this.list = list;
	}

	private void add() {
//		synchronized (list) {
			list.add(rand.nextInt(100));
//		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			add();
		}
	}
}
