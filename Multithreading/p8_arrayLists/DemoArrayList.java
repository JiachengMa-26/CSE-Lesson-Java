package p8_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		Thread t1 = new Thread(new ListThread(list));
		Thread t2 = new Thread(new ListThread(list));
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
	}

}
