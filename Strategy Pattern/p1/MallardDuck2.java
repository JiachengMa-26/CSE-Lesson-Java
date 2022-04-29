package p1;

public class MallardDuck2 extends Duck2 {
	
	public MallardDuck2(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		setFlyBehavior(flyBehavior);
		setQuackBehavior(quackBehavior);
	}
	
	public MallardDuck2() {}

	@Override
	public void display() {
		System.out.println("Display mallard duck...");
	}

}
