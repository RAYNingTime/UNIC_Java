import java.util.Scanner;

/* (Summing series)
 * Write a method (in the class) to compute the following series:
 * m = 1/2 + 2/3 + ... + i/(i+1)
 * 
 * Made by Ivan Kosiakov on 17.10.2022
 */

public class ProgEx2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cycles;
		double m = 0.0;
		
		do {
		// Prompt the user to enter a positive integer
		System.out.print("Enter amount of cycles: ");
		cycles = sc.nextInt();
		
		if (cycles <= 0)
			System.out.print("You should enter a positive number!\n");
		} while(cycles <= 0);
		
		for(int i = 1; i <= cycles; i++) {
			m += (double)i/(i+1);
		}
		
		System.out.print("m is " + m);
			
		sc.close();
	}


}
