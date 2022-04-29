package p2_singleton;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Bag<Book> bookBag = BookBagSingleton.getInstance(10);
		bookBag.insert(new Book("Java", 22));
		bookBag.insert(new Book("Javascript", 33));
		bookBag.insert(new Book("HTML & CSS", 22));
		Book[] arr = bookBag.remove(Book.class, (b) -> b.getPrice() == 22);
//		System.out.println(Arrays.toString(arr));
//		bookBag.display();
		
		
//		displayBookBag();
//		BackupRestoreHelper.backupBookBag("BookBag.dat");
//		
		Bag<Name> nameBag = NameBagSingleton.getInstance(5);
		nameBag.insert(new Name("A", "A"));
		nameBag.insert(new Name("B", "B"));
		nameBag.insert(new Name("A", "A"));
		nameBag.display();
		
		nameBag = NameBagSingleton.getInstance(5);
		nameBag.insert(new Name("John", "Doe"));
		nameBag.display();
	}

	private static void displayBookBag() {
		Bag<Book> bookBag = BookBagSingleton.getInstance(1000);
		bookBag.display();
	}

}
