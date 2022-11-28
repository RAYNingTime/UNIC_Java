package Ship;

public class CruiseShip extends Ship{
	private int passengers;
	
	public CruiseShip(String n, String y, int p) {
		setName(n);
		setYearBuilt(y);
		passengers = p;
	}
	
	public void setPassengers(int p) {
		passengers = p;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public String toString() {
		return getName() + " can have " + getPassengers() + " passengers";
	}

}
