import java.util.Scanner;

public class progExNum4 {

	public static void main(String[] args) {
		final int PER_YEARS = 10, INCRESE = 15, MULTIPLICATION = 20;
		int userAge, userYearOfBirth, currentYear, payment;
		
		Scanner sc= new Scanner(System.in);
		
		do {
		System.out.println("Welcome to the The Harrison Group Life Insurance company! \n\n"
				+ "Enter current year: ");
		currentYear = sc.nextInt();
		
		// Checking if user entered a negative year
		if(currentYear < 0)
			System.out.println("\nYou've entered a negative year! Try again!\n");
		} while (currentYear < 0);
		
		
		do {
			System.out.println("Enter your year of birth:");
			userYearOfBirth = sc.nextInt();
			
			// Checking if user entered a negative year
			if(userYearOfBirth < 0)
				System.out.println("\nYou've entered a negative year! Try again!\n");
			
			// Checking if current year is lower then user's year of birth
			else if (userYearOfBirth > currentYear)
				System.out.println("\nYour year of birth is higher than current year! Try again!\n");
		} while (userYearOfBirth < 0 || userYearOfBirth > currentYear);
		
		userAge = currentYear - userYearOfBirth;
		payment = (int)((Math.floor(userAge / PER_YEARS) + INCRESE) * MULTIPLICATION);
		
		System.out.println("\nYou are " + userAge + " years old. You are going to be payed " + payment + "$.");
		
		sc.close();
	}
}
