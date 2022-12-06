package Building;

public class MainBuilding extends UniversityBuilding {

	public MainBuilding() {
		super("Main Building");
	}
	
	public void printUniversityDetails() {
		System.out.println("Amount of the Floors: " + getFloorsNum());
		System.out.println("Amount of the Rooms: " + getRoomsNum());
		System.out.println("Amount of the Parks: " + getParksNum());
	}

	public void printBuildingDetails() {
		printName();
		printArea();
		printHeight();
		printWallThickness();
	}

}
