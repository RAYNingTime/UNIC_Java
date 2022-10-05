import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		// Using some default values for the age, name and surname
		// to avoid an error with straight call for the "3"
		int option, age = -1;
		String name = " ", surname = " ";
		
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("\n\tMenu\n1. Enter your name and surname\n2. Enter your age\n"); 
			System.out.print("3. Prints-out your data\n4. Exit\n\n Select an option:");
			option = sc.nextInt();
			
			switch (option) {
			case 1: {
				System.out.print("Enter your name: ");  
				name= sc.next();
				System.out.print("Enter your surname: ");  
				surname= sc.next();
				break;
			}
			case 2: {
				System.out.print("Enter your age: ");  
				age= sc.nextInt();  
				break;
			}
			case 3: {
				// Catching an errors if user didn't change one of the values
				// or changed it, but didn't enter any info.
				if (age < 0 || name == " " || surname == " ")
					System.out.print("\nERROR. You didn't entered a data OR you've entered an invalid value!");
				else 
					System.out.println("\nHello, "+ name + " " + surname + ". You're " + age + " years old!");
					
				break;
			}
			case 4: {
				// No code needed
				break;
			}
			default: System.out.print("\nYou've entered an invalid number of the menu! Try again!\n"); 
			}
		} while(option != 4);
		
		System.out.print("\nGoodbye! :)");
		sc.close();
	}
}
