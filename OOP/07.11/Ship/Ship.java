package Ship;

public class Ship {
	private String name, yearBuilt;
	
	public Ship() {
		name = "unknown";
		yearBuilt = "2000";
	}
	
	public Ship(String n, String y) {
		name = n;
		yearBuilt = y;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setYearBuilt(String y) {
		yearBuilt = y;
	}
	
	public String getName() {
		return name;
	}
	
	public String getYearBuilt() {
		return yearBuilt;
	}
	
	public String toString() {
		return getName() + " was built in " + getYearBuilt();
	}

}
