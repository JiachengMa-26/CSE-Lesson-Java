package p1;

public class DemoFact {

	public static void main(String[] args) {
		Ship s1 = new ShipFactory().createShip("large");
		s1.display();
		
		Ship s2 = new ShipFactory().createShip("small");
		s2.display();
		
	}

}
