package p1_basic_jackson_marshalling;

public class Car {
	private String color;
	private String type;

	public Car(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", type=" + type + "]";
	}

}
