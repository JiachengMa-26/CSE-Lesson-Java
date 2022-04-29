package p1;

public abstract class Ship {
	private String name;
	private int maxSpeed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void display() {
		System.out.println("Display on the screen!");
	}
}
