package p1;

public class Robot {
	private RobotColor rc;
	private RobotMetal rm;
	private RobotBody rb;

	public Robot() {
		rc = new RobotColor();
		rm = new RobotMetal();
		rb = new RobotBody();
	}
	
	public Robot(String color, String metal) {
		rc = new RobotColor();
		rc.setColor(color);
		rm = new RobotMetal();
		rm.setMetal(metal);
		rb = new RobotBody();
	}
	
	public void constructRobot(String color, String metal) {
		System.out.println("\nCreation of the robot starts: ");
		rc.setColor(color);
		rm.setMetal(metal);
		rb.createBody();
		System.out.println("Robot creation ends.");
		System.out.println();
	}
}
