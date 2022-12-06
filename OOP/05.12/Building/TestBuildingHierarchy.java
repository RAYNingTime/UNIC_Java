package Building;

public class TestBuildingHierarchy {

	public static void main(String[] args) {
		EuropaBuilding europa = new EuropaBuilding();
		MainBuilding main = new MainBuilding();
		
		//ERROR: Initialization of the abstract class
		//Building millennium = new Building(); 
		
		europa.printUniversityDetails();
		europa.printBuildingDetails();
		
		System.out.println("\n\n| | | | | | | | | | | | | |\n\n");
		
		main.printUniversityDetails();
		main.printBuildingDetails();
		
		System.out.println("\n\n| | | | | | | | | | | | | |\n\n");
		
		UniversityBuilding[] uniArr = {
				new EuropaBuilding(),
				new EuropaBuilding(),
				new EuropaBuilding(),
				new EuropaBuilding(),
				new EuropaBuilding(),
				new MainBuilding(),
				new MainBuilding(),
				new MainBuilding(),
				new MainBuilding(),
				new MainBuilding()
		};
		
		for(int i = 0; i < 10; ++i) {
			System.out.println("Number of the building:" + (i+1));
			uniArr[i].printUniversityDetails();
			uniArr[i].printBuildingDetails();
			System.out.println("\n| | | | | | | | | | | | | |\n");
		}
	}

}
