package Vehicle;

public class Vehicle {
	private int wheels;
	private int mpg;
	
	public Vehicle() {
		System.out.println("Vehicle object created");
	}
	
	public Vehicle(int w, int m) {
		wheels = w;
		mpg = m;
	}
	
	public String toString() {
		return "Wheels: " + wheels + "\nMiles Per Gallon: " + mpg;
	}

}
