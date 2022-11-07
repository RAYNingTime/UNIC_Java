package Horse;


public class Horse {
	private String name, color;
	private int birthYear;
	
	public Horse() {
		System.out.println("I am the default constructor of the class Horse");
	}
	
	// Set Section
	public void setName(String newName) {
		name = newName;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setBirthYear(int year) {
		birthYear = year;
	}
	
	// Get Section
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void MethodHorse() {
		System.out.println("I am methodHorse int the Horse class");
	}
	

}
