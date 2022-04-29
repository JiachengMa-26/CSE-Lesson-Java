package p1_custom_implementation;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("John Doe", 2.5);
		
		StudentObserver o1 = new StudentObserver(s);
		StudentObserver o2 = new StudentObserver(s);
		
		s.setGpa(4.0);
		
		System.out.println("Third observer added\n");
		
		StudentObserver o3 = new StudentObserver(s);
		s.setGpa(3.5);
	}

}
