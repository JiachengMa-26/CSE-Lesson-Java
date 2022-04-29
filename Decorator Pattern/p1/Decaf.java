package p1;

public class Decaf extends Beverage {

	@Override
	public double cost() {
		return 1.49;
	}

	public String getDescription() {
		return "Decaf";
	}
}
