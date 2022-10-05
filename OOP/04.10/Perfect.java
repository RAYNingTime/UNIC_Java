
public class Perfect {

	public static void main(String[] args) {
		//	Checking perfect numbers until this variable
		final int PERFECT_UNTIL = 1000;
		int sumOfTheNumbers;
		
		System.out.println("Here are all the perfect numbers from 1 to " + PERFECT_UNTIL);
		
		for (int i = 0; i < PERFECT_UNTIL + 1; i++) {
			// Reset for every loop
			sumOfTheNumbers = 0; 
			for (int j = 1; j < i; j++) 
				if (i % j == 0)
					sumOfTheNumbers += j;
			
			// The number is perfect when it equals the sum of all numbers
			// that divide evenly into it.
			if (sumOfTheNumbers == i && sumOfTheNumbers != 0)
				System.out.print(i + " ");
		}

	}

}
