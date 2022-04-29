package p5_bill_pugh;

public class Instructor {
	private static String name;
	
	private Instructor () {
		
	}

	private static class SingletonHelp {
		private static final Instructor _instructor = new Instructor();
	}
	
	
	public static Instructor getInstance() {
		return SingletonHelp._instructor;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		Instructor.name = name;
	}
	
}
