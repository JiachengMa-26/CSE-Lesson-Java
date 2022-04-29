package p1;

public abstract class Duck2 {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performFlyBehavior() {
		flyBehavior.fly();
	}
	
	public void performQuackBehavior() {
		quackBehavior.quack();
	}
	
	public abstract void display();

	public void swim() {
		System.out.println("The Duck swims...");
	}

}
