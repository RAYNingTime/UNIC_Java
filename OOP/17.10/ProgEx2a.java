import java.util.Scanner;

/* (Displaying an integer reversed)
 * Write the following method (in the class) to display an integer in reverse
 * order:
 * public static void reverse(int number)
 * 
 * Made by Ivan Kosiakov on 17.10.2022
 */

public class ProgEx2a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();

		// Display the reversal of number
		reverse(number);
		
		sc.close();
	}

	public static void reverse(int number) {
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
	}

}
