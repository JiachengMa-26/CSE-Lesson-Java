package CommandPattern;
public class SimpleRemoteControl {
	private Command slot;
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
}
