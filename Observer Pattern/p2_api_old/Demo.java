package p2_api_old;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("John Doe", 2.5);
		
		StudentObserver o1 = new StudentObserver(s);
		StudentObserver o2 = new StudentObserver(s);
		s.setGpa(3.5);
		
		StudentObserver o3 = new StudentObserver(s);
		s.setGpa(4.0);
		
		s.deleteObserver(o2);
		System.out.println();
		s.setGpa(3.9);
	}

}
