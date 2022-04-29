package p1;

import java.util.Arrays;

public class DemoSig{

	public static void main(String[] args) throws ClassNotFoundException {
		Bag<Book> bag = new Bag<>(Book.class, 10);
		bag.insert(new Book("A", 100.0));
		bag.insert(new Book("B", 60.0));
		bag.insert(new Book("A", 40.0));
		bag.insert(new Book("C", 20.0));
		
		bag.display();
		Book[] arr = bag.remove(Book.class, (Book a) -> {
			return a.getPrice()>=60.0;
		});
		System.out.println();
//		System.out.println(Arrays.toString(arr));
		bag.display();
		
		
	}

}
