package p1;

public class Mocha extends CondimentDecorator {
private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	
	@Override
	public double cost() {
		return beverage.cost() + 0.49;
	}

	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

}
