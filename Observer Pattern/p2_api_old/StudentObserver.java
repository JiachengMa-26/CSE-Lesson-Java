package p2_api_old;

import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer {
	private static int idTracker = 0;
	private int observerId;

	public StudentObserver(Observable student) {
		this.observerId = ++idTracker;
		System.out.println("New Observer added: " + observerId);
		student.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println((String) arg + "! " 
				+ ((Student) o).getName() + ": " + ((Student) o).getGpa());
	}

}
