package p1;

public class DemoDe {

	public static void main(String[] args) {
		HouseBlend houseBlend = new HouseBlend();
		System.out.println(houseBlend.getDescription() + ": " + String.format("%5.2f", houseBlend.cost()));
		Milk milk = new Milk(houseBlend);
		System.out.println(milk.getDescription() + ": " + String.format("%5.2f", milk.cost()));
		
		milk = new Milk(milk);
		System.out.println(milk.getDescription() + ": " + String.format("%5.2f", milk.cost()));
		
		Mocha mocha = new Mocha(milk);
		System.out.println(mocha.getDescription() + ": " + String.format("%5.2f", mocha.cost()));
	}

}
