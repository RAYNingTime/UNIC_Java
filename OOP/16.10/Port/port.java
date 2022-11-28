package Port;
import java.util.Scanner;

public class port {
	
	public static int menuPrint() {
		Scanner sc = new Scanner(System.in);
		int userChoise;
		
		System.out.print("\n===MENU===\n" + 
				"--- DOCK ---\n" +
				" 1) Change Weather in Dock\n" +
				" 2) Moor Ship\n"+
				" 3) Unmoor Ship\n"+
				"\n--- SHIP ---\n" +
				" 4) Load Ship\n" +
				" 5) Unload Ship\n" +
				" 6) Set Speed\n" +
				" 7) Rotate Ship\n" +
				" 8) Report Ship\n" +
				" 9) Exit\n\tEnter:");
		userChoise = sc.nextInt();
		
		return userChoise;
	}
	
	public static void main(String[] args) {
		Dock CurrentDock = new Dock();
		Ship CargoShip = new Ship(CurrentDock);
		int userChoise;
		
		do {
			userChoise = menuPrint();
			
			switch (userChoise) {
			case 1: 
				CurrentDock.ChangeWeather(CargoShip);
				break;
				
			case 2:
				CurrentDock.Moor(CargoShip);
				break;
				
			case 3:
				CurrentDock.Unmoor(CargoShip);
				break;
			
			case 4:
				CargoShip.LoadShip();
				break;
				
			case 5:
				CargoShip.UnloadShip();
				break;
				
			case 6:
				CargoShip.SetSpeed();
				break;
				
			case 7:
				CargoShip.Rotate();
				break;
				
			case 8:
				CargoShip.Report();
				break;
				
			case 9:
				//No Code Needed
				break;
			
			default:
				System.out.println("You've entered an invalid option! Try again!");
				break;
			}
			
		} while (userChoise != 9);
	}
	
}
