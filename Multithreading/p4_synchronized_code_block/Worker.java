package p4_synchronized_code_block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	Object lock1 = new Object();
	Object lock2 = new Object();

	public void stageOne() {
		synchronized (lock1) {
			list1.add(random.nextInt(100));
			System.out.println(Thread.currentThread().getName());
		}
	}

	public void stageTwo() {
		synchronized (lock2) {
			list2.add(random.nextInt(100));
			System.out.println(Thread.currentThread().getName());
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void mainTask() {
		System.out.println("Starting main task:");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		Thread t1 = new Thread(() -> {
			Thread.currentThread().setPriority(9);
			process();
		});

		Thread t2 = new Thread(() -> {
			Thread.currentThread().setPriority(10);
			process();
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("List1: " + list1.size() + "; list2: " + list2.size());
	}

}
