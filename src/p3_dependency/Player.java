package p3_dependency;

public class Player {

	public void play(Die die) { // coming into a method
		int number = die.roll(); // play method depends on die methods (behavior)
	}
}
 

//  Player ----rolls out -----> Die