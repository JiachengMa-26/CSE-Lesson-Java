package p2_singleton;

import java.io.Serializable;

public class Book implements Serializable{
	private String title;
	private double price;

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//		return title.compareTo(((Book)o).title);
//	}

}
