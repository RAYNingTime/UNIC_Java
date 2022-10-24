public class Distance {
	private	double speed;
	private	int hours;
		
	// Constructor
	public Distance(double userSpeed, int userHours) {
		speed = userSpeed;
		hours = userHours;
	}
	
	// This method sets speed to store it in class
	public void setSpeed(double userSpeed) {
		speed = userSpeed;
	}
	
	// This method sets hours to store them in class
	public void setHours(int userHours) {
		hours = userHours;
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
