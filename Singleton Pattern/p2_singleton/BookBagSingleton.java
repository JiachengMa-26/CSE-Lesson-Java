package p2_singleton;

public class BookBagSingleton {
	private static Bag<Book> bag;
	
	private BookBagSingleton(int maxSize) {
		bag = new Bag<>(Book.class, maxSize);
	}
	
	public static Bag getInstance(int maxSize) {
		if(bag == null) {
			new BookBagSingleton(maxSize);
		} 
		return bag;
	}

}
