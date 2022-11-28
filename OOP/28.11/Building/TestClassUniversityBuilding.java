package Building;

public class TestClassUniversityBuilding {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
		  EuropaBuilding b1 = new EuropaBuilding();
			MainBuilding b2 = new MainBuilding();
			
			UniversityBuilding u1 = b1;
			UniversityBuilding u2 = b2;
			
			u1.displayArea();
			u1.roomsNum();
			u1.parksNum();
			u1.method1();
			u1.method2();
			
			System.out.println();
			u2.displayArea();
			u2.roomsNum();
			u2.parksNum();
			u2.method1();
			u2.method2();
			
			UniversityBuilding[] buildingArray = {
				new EuropaBuilding(),
				new EuropaBuilding(),
				new EuropaBuilding(),
				new EuropaBuilding(),
				new EuropaBuilding(),
				new MainBuilding(),
				new MainBuilding(),
				new MainBuilding(),
				new MainBuilding(),
				new MainBuilding(),
			};
			
			for(int i = 1; i <= 10; i++) {
				System.out.println("\nBuilding number " + i);
				buildingArray[i].displayArea();
				buildingArray[i].roomsNum();
				buildingArray[i].parksNum();
				buildingArray[i].method1();
				buildingArray[i].method2();
			}

		}



}
