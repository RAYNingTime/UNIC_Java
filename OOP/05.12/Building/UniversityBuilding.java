package Building; 

public abstract class UniversityBuilding extends Building implements BuildingInterface {
	private String name;
	private double area;
	private int rooms, parks, floors;
	
	public UniversityBuilding() {
		name = "UniversityBuilding";
		area = 2500;
		rooms = 700;
		parks = 100;
		floors = 4;
	}
	
	public UniversityBuilding(String name) {
		this();
		this.name = name;
	}
	
	// BuildingInterface
	public void printName() {
		System.out.println("Building name: " + name);
	}
	public void printArea() {
		System.out.println("Building area: " + area);
	}
	
	// Building
	public void printHeight() {
		System.out.println("Height: 40 feet");
	}
	public void printWallThickness() {
		System.out.println("Thickness of the walls: 4 1/2 inches");
	}

	// Getters
	
	public int getRoomsNum() {
		return rooms;
	}
	public int getParksNum() {
		return parks;
	}
	public int getFloorsNum() {
		return floors;
	}
	
	public abstract void printUniversityDetails();
	public abstract void printBuildingDetails();
}
