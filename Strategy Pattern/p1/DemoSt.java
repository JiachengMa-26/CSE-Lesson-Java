package p1;

public class DemoSt {

	public static void main(String[] args) {
		MallardDuck2 mallardDuck = new MallardDuck2();
		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehavior(new Quack());
		
		mallardDuck.performFlyBehavior();
		mallardDuck.performQuackBehavior();
		System.out.println("Level up..");
		mallardDuck.setQuackBehavior(new Squeak());
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFlyBehavior();
		mallardDuck.performQuackBehavior();
		
		System.out.println("\nChange to fly with legs...");
		mallardDuck.setFlyBehavior(new FlyWithLegs());
		mallardDuck.performFlyBehavior();
		mallardDuck.performQuackBehavior();
		
	}

}
