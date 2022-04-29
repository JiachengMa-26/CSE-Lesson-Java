package p1;

public class Expresso extends Beverage {

	@Override
	public double cost() {
		return 2.99;
	}
	
	public String getDescription() {
		return "Expresso";
	}

}
