package p11_deadlock;

import java.util.LinkedList;

public class Processor {
	private LinkedList<Integer> list = new LinkedList<>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() {
		int value = 0;
		while (true) {
			synchronized (lock) {
				if (list.size() == LIMIT) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				list.add(value++);
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				lock.notify();
			}
		}
	}

	public void consume() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (true) {
			synchronized (lock) {
				if (list.size() == 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int value = list.removeFirst();
				System.out.println(list);
				System.out.println("Value removed: " + value);

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lock.notify();
			}

		}
	}
}
