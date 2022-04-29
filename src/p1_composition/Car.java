package p1_composition;

public class Car {
	private final Motor motor;
	
	public Car() {
		motor = new Motor("V4.0");
	}

	public Motor getMotor() {
		return motor;
	}

	@Override
	public String toString() {
		return "Car [motor=" + motor + "]";
	}
	
}
