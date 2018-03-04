package examples;

public class Robot {
	// Instance Variable
	private int maxSpeed;
	
	// Constructors
	public Robot() {
		this.maxSpeed = 1;
	}
	
	public Robot(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	// Getter method to get instance variable
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	// Setter method to set instance variable
	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed >= 0) {
			this.maxSpeed = maxSpeed;
		} else {
			this.maxSpeed = 0;
		}
	}
	
	// Method to perform a task
	public void travel() {
		System.out.println("The robot moves a distance of " + maxSpeed + " units.");
	}

}
