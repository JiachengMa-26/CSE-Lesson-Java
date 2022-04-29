package p1;

public class Milk extends CondimentDecorator {

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	
	@Override
	public double cost() {
		return beverage.cost() + 0.25;
	}

	
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
}
