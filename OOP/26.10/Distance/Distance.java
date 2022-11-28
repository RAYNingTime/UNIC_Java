package Distance;

public class Distance {
	private	double speed;
	private	int hours;
		
	// Constructor
	public Distance(double userSpeed, int userHours) {
		setSpeed(userSpeed);
		setHours(userHours);
	}
	
	// This method sets speed to store it in class
	private void setSpeed(double userSpeed) {
		this.speed = userSpeed;
	}
	
	// This method sets hours to store them in class
	private void setHours(int userHours) {
		this.hours = userHours;
	}
	
	// This method returns speed that have been stored in class
	public double getSpeed() {
		return speed;
	}
	
	// This method returns hours that have been stored in class
	public int getHours() {
		return hours;
	}
	
	// This method returns the distance 
	// traveled in hours at the specified speed
	public double getDistance() {
		return speed*hours;
	}
}
