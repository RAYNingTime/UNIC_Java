package Ship;

public class CargoShip extends Ship{
	private int tonnage;
	
	public CargoShip(String n, String y, int t) {
		setName(n);
		setYearBuilt(y);
		tonnage = t;
	}
	
	public void setTonnage(int t) {
		tonnage = t;
	}
	
	public int getTonnage() {
		return tonnage;
	}
	
	public String toString() {
		return getName() + " have capacity of " + getTonnage() + " tons";	
	}
}
