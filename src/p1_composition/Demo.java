package p1_composition;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getMotor().getModel());
	}

	
}
