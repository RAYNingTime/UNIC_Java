package Building;

public class EuropaBuilding extends UniversityBuilding {

	public EuropaBuilding() {
		super("Europa Building");
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

