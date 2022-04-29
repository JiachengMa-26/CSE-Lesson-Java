package p5_bill_pugh;

public class DemoBillPugh {
	public static void main(String[] args) {
		Instructor instructor1 = Instructor.getInstance();
		Instructor.setName("John");
		Instructor instructor2 = Instructor.getInstance();
		System.out.println(Instructor.getName());
		System.out.println(instructor1 == instructor2);
	}

}
