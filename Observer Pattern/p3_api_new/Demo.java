package p3_api_new;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("John Doe", 2.5);
		
		StudentObserver l1 = new StudentObserver();
		StudentObserver l2 = new StudentObserver();
		
		s.addPropertyChangeListener(l1);
		s.addPropertyChangeListener(l2);
		
		s.setGpa(3.0);
		System.out.println();
		s.removePropertyChangeListener(l2);
		s.setGpa(4.0);
		
	}

}
