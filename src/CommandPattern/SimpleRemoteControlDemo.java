package CommandPattern;
public class SimpleRemoteControlDemo {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		
		remote.setCommand(lightOnCommand);
		remote.buttonWasPressed();
		remote.setCommand(lightOffCommand);
		remote.buttonWasPressed();
		remote.setCommand(garageDoorOpenCommand);
		remote.buttonWasPressed();
		remote.setCommand(garageDoorCloseCommand);
		remote.buttonWasPressed();
		
	}

}
