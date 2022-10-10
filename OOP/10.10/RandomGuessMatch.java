import java.util.Scanner;

public class progExNum2 {

	public static void main(String[] args) {
		final int MAX = 5, MIN = 1;
		int userNumber, random = MIN + (int)(Math.random() * MAX);
		boolean win = false;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Guess a number from " + MIN + " to " + MAX + ": ");
		do {	
			userNumber = sc.nextInt();
			
			if (userNumber == random) {
				System.out.print("Congrats! You won!");
				win = true;
			} else if (userNumber > random)
				System.out.print("Difference between your and a random number is " 
				+ (userNumber - random) + "\n\nTry again: ");
			else System.out.print("Difference between your and a random number is " 
				+ (random - userNumber) + "\n\nTry again: ");
		
		} while (!win);
		
		sc.close();
	}

}
