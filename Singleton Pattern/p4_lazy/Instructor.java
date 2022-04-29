package p4_lazy;

public class Instructor {
	private static Instructor _instructor;
	private static String name;
	
	private Instructor(String name) {
		this.name = name;
	}
	
	public static Instructor getInstance(String name) {
		if(_instructor == null) {
			_instructor = new Instructor(name);
		}
		return _instructor;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		Instructor.name = name;
	}

}
