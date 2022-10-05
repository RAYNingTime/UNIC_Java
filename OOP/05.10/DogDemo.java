import java.util.Scanner;

public class DogDemo {

	public static void main(String[] args) {
		// TO SHOW TWO DOGS THAT YOU ASKED ON LECTURE
		final boolean SHOW_TEST = true, SHOW_PRACTICE = false;
		
		final char YES = 'y', NO = 'n';		
		Dog userDog = new Dog();
		char shotAnswer;
		boolean passed = false;
		
		Scanner sc= new Scanner(System.in);
		
		if (SHOW_TEST) {
			// PART THAT YOU ASKED TO MAKE IN CLASS
			Dog firstDog = new Dog();
			firstDog.Name = "Leo";
			firstDog.Age = 3;
			firstDog.Breed = "Bulldog";
			firstDog.ShotStatus = true;
			
			System.out.print("\t1 TEST DOG INFO" + 
					"\n NAME: " + firstDog.Name +
					"\n AGE: " + firstDog.Age + 
					"\n BREED: " + firstDog.Breed +
					"\n VACCINATED: " + firstDog.ShotStatus
					);
			
			Dog secondDog = new Dog();
			secondDog.Name = "Keo";
			secondDog.Age = 5;
			secondDog.Breed = "Kokoni";
			secondDog.ShotStatus = false;
			
			System.out.print("\n\n\t1 TEST DOG INFO" + 
					"\n NAME: " + secondDog.Name +
					"\n AGE: " + secondDog.Age + 
					"\n BREED: " + secondDog.Breed +
					"\n VACCINATED: " + secondDog.ShotStatus
					);
			
		}	
		
		if (SHOW_PRACTICE) {
			//PRACTICE PART
			
			System.out.println("\n\n\tWELCOME TO THE CLINIC\n");
			System.out.println("What is the name of your dog?");
			userDog.Name = sc.next();
			
			System.out.println("\nHow old is " + userDog.Name + "?");
			userDog.Age = sc.nextInt();
			
			System.out.println("\nWhat is the breed of the " + userDog.Name + "?");
			userDog.Breed = sc.next();
			
			do {
				System.out.println("\nIs " + userDog.Name + " vaccinated? (" + YES + "/" + NO + ")");
				shotAnswer =  sc.next().charAt(0);
				
				if(shotAnswer == YES) {
					userDog.ShotStatus = true;
					passed = true;
				}
				else if (shotAnswer == NO) {
					userDog.ShotStatus = false;
					passed = true;
				}
				else System.out.println("You've entred an incorrect character! Try again!");
			} while (!passed);
			
			System.out.print("\n\tDOG INFO" + 
					"\n NAME: " + userDog.Name +
					"\n AGE: " + userDog.Age + 
					"\n BREED: " + userDog.Breed +
					"\n VACCINATED: " + userDog.ShotStatus
					);
		}
		
		sc.close();
	}
}
