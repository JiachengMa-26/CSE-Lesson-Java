package p4_lazy;

import p3_eager.Instructor;

public class DemoLazy {
	
	public static void main(String[] args) {
		Instructor instructor1 = Instructor.getInstance("John");
		System.out.println(Instructor.getName());
		Instructor instructor2 = Instructor.getInstance("Joe");
		System.out.println(Instructor.getName());
		System.out.println(instructor1 == instructor2);
	}


}
