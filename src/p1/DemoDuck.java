package p1;

public class DemoDuck {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		
		System.out.println("The Duck says...");
		mallardDuck.quack();
		mallardDuck.fly();
		
		System.out.println("The Turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		System.out.println("\nNow the Turkey adapter: ");
		System.out.println("The TurkeyAdapter says...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
	}

}
