package p2_singleton;

public class NameBagSingleton {
	private static Bag<Name> bag;
	
	private NameBagSingleton(int maxSize) {
		bag = new Bag<>(Name.class, maxSize);
	}
	
	public static Bag getInstance(int maxSize) {
		if(bag == null) {
			new NameBagSingleton(maxSize);
		} 
		return bag;
	}
}
