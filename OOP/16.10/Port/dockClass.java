package Port;
import java.util.Scanner;

class Dock {
	Dock(){
		// Configuration needed for the ship
		this.weather  = "Sunny";
		filled = false;
	}
	
	// This method changes weather at the dock
	public void ChangeWeather(Ship CurrentShip) {
		final char SUNNY_SYMB = 'S', CLOUDY_SYMB = 'C', RAIN_SYMB = 'R' , THUNDER_SYMB = 'T'; 
		Scanner sc = new Scanner(System.in);
		
		
		boolean incorrectAnswer = true;
		char userChoise;
		
		// Ask user where to rotate ( N, E, S, W)
		System.out.println("\nWhat is the current weather at dock location? ");
		System.out.println("Enter " + SUNNY_SYMB + " for Sunny, " + CLOUDY_SYMB + " for Cloudy, " + 
		RAIN_SYMB + " for Rain, " + THUNDER_SYMB + " for Stormy");
		
		
		// Loop until user enters 'S' OR 'C' OR 'R' OR 'T'
		do {
		userChoise = sc.next().charAt(0);
		
		switch (userChoise) {
		
			case SUNNY_SYMB: {
				this.weather = "Sunny";
				incorrectAnswer = false;
				break;
			}
			
			case CLOUDY_SYMB: {
				this.weather = "Cloudy";
				incorrectAnswer = false;
				break;
			}
			
			case RAIN_SYMB: {
				this.weather = "Rainy";
				incorrectAnswer = false;
				break;
			}
			
			case THUNDER_SYMB: {
				this.weather = "Stormy";
				incorrectAnswer = false;
				break;
			}
		
			default: {
				System.out.println("You've entered an invalid value! Try again!");
				System.out.println("Enter " + SUNNY_SYMB + " for Sunny, " + CLOUDY_SYMB + " for Cloudy, " + 
						RAIN_SYMB + " for Rain, " + THUNDER_SYMB + " for Stormy");
				break;
			}
		}		
		} while (incorrectAnswer);
		System.out.println("Weather successfully changed to " + this.weather + " weather.");
		
		// If ship is moored in this dock then weather is the same
		if (CurrentShip.moored)
			CurrentShip.weather = this.weather;
	}
	
	// This method moors ship to the dock
	public void Moor(Ship CurrentShip) {
		if(!this.filled && !CurrentShip.moored) {
			System.out.println("\nThe ship has been successfully moored.\n");
			
			this.filled = true;
			CurrentShip.moored = true;
			
			// If ship got moored in the dock then weather is the same for both
			// And speed of the ship is going to be set to stop
			CurrentShip.weather = this.weather;
			CurrentShip.speed = "stop";
		} else if (CurrentShip.moored)
			System.out.println("\nThe ship already moored.\n");
		else System.out.println("\nThis dock is already occupied by another ship.\n");
	}
	
	// This method unmoors ship from the dock
	public void Unmoor(Ship CurrentShip) {
		// BUG. You can unmoor the ship from different dock because 
		// ships don't have any "Prime Key" as id and I cannot connect
		
		if(this.filled && CurrentShip.moored) {
			System.out.println("The ship has been successfully unmoored.\n");
			this.filled = false;
			CurrentShip.moored = false;
			
			// To get out of dock ship usually using low speed
			CurrentShip.speed = "low";
		} else if (!CurrentShip.moored)
			System.out.println("The ship is not moored.\n");
		else System.out.println("This dock is empty.\n");
	}
	
	// True means Sunny | False means Thunderstorm
	String weather;
	boolean filled;
}
