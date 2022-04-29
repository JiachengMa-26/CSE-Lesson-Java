package p1_custom_implementation;

public class StudentObserver implements Observer {
	
	private static int observerIdTracker = 0;
	private int observerId;
	
	public StudentObserver(Observable student) {
		observerId = ++observerIdTracker;
		System.out.println("New Observer: " + observerId);
		student.register(this);
	}

	@Override
	public void update(String name, double gpa) {
		System.out.println(name + ": " + gpa);
	}

}
