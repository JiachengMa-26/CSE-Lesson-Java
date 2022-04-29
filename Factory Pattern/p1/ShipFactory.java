package p1;

public class ShipFactory {
	
	public Ship createShip(String shipType) {
		switch (shipType.toLowerCase()) {
		case "large":
			return new LargeShip();
		case "small":
			return new SmallShip();
		default:
			return null;
		}
	}
}
