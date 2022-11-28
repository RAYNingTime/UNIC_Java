package Port;
import java.util.Scanner;

class Ship {
	Scanner sc= new Scanner(System.in);
	
	Ship(Dock mainDock){
		immersed = false;
		weather = mainDock.weather;
		moored = false;
		degree = "North";
		speed = "stop";
	}
	
	// This method rotates a ship to the N or E or W or S
	public void Rotate() {
		final char NORTH_SYMB = 'N', EAST_SYMB = 'E', SOUTH_SYMB = 'S', WEST_SYMB = 'W';
		
		boolean incorrectAnswer = true;
		char userChoise = '-';
		
		if (this.moored)
			System.out.println("\nTo change the cardinal direction of the ship you should unmoore first!\n");
		else {
		
			// Ask user where to rotate ( N, E, S, W)
			System.out.println("\nWhich cardinal direction would you like to rotate a ship?");
			System.out.println("Enter "+ NORTH_SYMB +" for North, " + EAST_SYMB + " for East, " + 
			 SOUTH_SYMB +" for South, " + WEST_SYMB + " for West");
			
			
			// Loop until user enters 'N' OR 'E' OR 'S' OR 'W'
			do {
				userChoise = sc.next().charAt(0);
				
				switch (userChoise) {	
					case NORTH_SYMB: {
						this.degree = "North";
						incorrectAnswer = false;
						break;
					}
					
					case EAST_SYMB: {
						this.degree = "East";
						incorrectAnswer = false;
						break;
					}
					
					case SOUTH_SYMB: {
						this.degree = "South";
						incorrectAnswer = false;
						break;
					}
					
					case WEST_SYMB: {
						this.degree =  "West";
						incorrectAnswer = false;
						break;
					}
				
					default: {
						System.out.println("You've entered an invalid value! Try again!");
						System.out.println("Enter "+ NORTH_SYMB +" for North, " + EAST_SYMB + " for East, " + 
								 SOUTH_SYMB +" for South, " + WEST_SYMB + " for West");
						break;
					}
				}		
			} while (incorrectAnswer);
			System.out.println("Ship successfully turned to the " + this.degree + " degree.");
		}
	}
	
	// This method changes the speed of the ship
	public void SetSpeed() {
		final int STOP_SPEED = 0, LOW_SPEED = 1, MEDIUM_SPEED = 2, FAST_SPEED = 3;
		boolean incorrectAnswer = true;
		int userChoise;
		
		if (this.moored)
			System.out.println("\nTo change the speed of the ship you should unmoore first!\n");
		else {
		
			// Ask user what speed he would like to select
			System.out.println("\nWhat speed would you like to select?");
			System.out.println("Enter "+ STOP_SPEED +" for Stop, " + LOW_SPEED + " for low, " + 
			MEDIUM_SPEED + " for medium, " + FAST_SPEED + " for fast");
			
			
			// Loop until user enters 0 or 1 or 2 or 3
			do {
			userChoise = sc.nextInt();
				switch (userChoise) {
					case STOP_SPEED: {
						this.speed = "stop";
						incorrectAnswer = false;
						break;
					}
					
					case LOW_SPEED: {
						this.speed = "low";
						incorrectAnswer = false;
						break;
					}
					
					case MEDIUM_SPEED: {
						this.speed = "medium";
						incorrectAnswer = false;
						break;
					}
					
					case FAST_SPEED: {
						this.speed = "fast";
						incorrectAnswer = false;
						break;
					}
				
					default: {
						System.out.println("You've entered an invalid value! Try again!");
						System.out.println("Enter "+ STOP_SPEED +" for Stop, " + LOW_SPEED + " for low, " + 
								MEDIUM_SPEED + " for medium, " + FAST_SPEED + " for fast");
						break;
					}
				}
			}while (incorrectAnswer);
			
			if (this.speed != "stop")
				System.out.println("Ship successfully changed speed to the " + this.speed + " speed.");
			else
				System.out.println("Ship successfully stopped!");
	}}
	
	
	// This method gives all the information about the ship at current moment
	public void Report() {
		
		// Ship movement status
		if (this.moored)
			System.out.println("\nThis ship is moored to the dock.");
		else if (this.speed == "stop")
			System.out.println("\nThe ship stopped in the middle of the water.");
		else
			System.out.println("\nThis ship is currently going to the " + this.degree + " with the " + this.speed + " speed.");
		
		// Ship cargo status
		if (!immersed)
			System.out.println("This ship has no cargo on board.");
		else
			System.out.println("This ship has cargo on board.");
		
		// Ship weather status
		System.out.println("Outside the ship is now " + this.weather + " weather.\n");
	}
	
	// This method loads a cargo on a ship
	public void LoadShip() {
		if(!this.immersed && this.moored) {
			System.out.println("\nCargo has been successfully loaded onto the ship.\n");
			this.immersed = true;
		} else if (!this.moored)
			System.out.println("\nThis ship is not moored.\n");
		else System.out.println("\nThis ship is already loaded with cargo.\n");
	}
	
	// This method unloads a cargo from a ship
	public void UnloadShip() {
		if(this.immersed && this.moored) {
			System.out.println("\nCargo has been successfully unloaded from the ship.\n");
			this.immersed = false;
		} else if (!this.moored)
			System.out.println("\nThis ship is not moored.\n");
		else System.out.println("\nThere is no cargo on this ship.\n");
	}
	
	// Starting information about ship
	boolean immersed;
	boolean moored;
	String weather;
	
	// Moving information
	String speed;
	String degree;
}
