import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int option, age = -1;
		String name = " ", surname = " ";
		
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("\tMenu\n1. Enter your name and surname\n2. Enter your age\n"); 
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
				if (age < 0 || name == " " || surname == " ")
					System.out.print("ERROR. You didn't entered a data OR you've entered an invalid value!\n\n");
				else 
					System.out.println("Hello, "+ name + " " + surname + ". You're " + age + " years old!\n\n");
					
				break;
			}
			case 4: {
				// No code needed
				break;
			}
			default: System.out.print("You've entered an invalid number! Try again!"); 
			}
		} while(option != 4);
		
		System.out.print("\nGoodbye! :)");
		sc.close();
	}
}
