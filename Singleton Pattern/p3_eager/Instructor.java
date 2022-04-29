package p3_eager;

public class Instructor {
	private static String name;
	private static Instructor _instructor = new Instructor();
	
	private Instructor() {}
	
	public static Instructor getInstance(String name) {
		Instructor.setName(name);
		return _instructor;
	}
	
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Instructor.name = name;
	}
	

}
