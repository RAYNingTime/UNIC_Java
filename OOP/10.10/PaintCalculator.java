import java.util.Scanner;

public class progExNum3 {

	public static void main(String[] args) {
		final char AGREE = 'y', DISAGREE = 'n';
		int length,width,height,totalPrice = 0;
		char userAnswer;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter length,width and height of a rectangular room: ");
		length = sc.nextInt();
		width = sc.nextInt();
		height = sc.nextInt();
		
		// I re-read an exercise and it says without ceiling
		// But because you said to count ceiling as well I've created two options
		// With two similar functions (The only difference is the formula of the area)
		do {
			System.out.println("Would you like to paint a ceiling as well? ["+ AGREE +"/" + DISAGREE + "]");
			userAnswer =  sc.next().charAt(0);
			
			if(userAnswer == AGREE) 
				totalPrice = countGallonsWithCeiling(length,width,height);
			else if (userAnswer == DISAGREE) 
				totalPrice = countGallonsWithoutCeiling(length,width,height);
			else System.out.println("You've entred an incorrect character! Try again!");
		} while (userAnswer != AGREE && userAnswer != DISAGREE);
		
		System.out.println("The cost to paint your room will be " + totalPrice);
		
		sc.close();
	}

	// This function counts only area of the WALLS without Ceiling
	public static int countGallonsWithoutCeiling(int length,int width,int height) {
		final double PER_GALLON = 350,GALLON_PRICE = 32;
		int roomArea, gallonsNeeded,totalPrice;
		
		roomArea = 2*(length*height + width*height);
		
		// Rounding number in bigger side
		gallonsNeeded = (int)Math.ceil(roomArea/PER_GALLON);
		
		System.out.println("You will need a " + gallonsNeeded + " gallons of paint.");
		totalPrice = (int)(gallonsNeeded * GALLON_PRICE);
		
		return totalPrice;
	}
	
	// This function counts area of the wall with ceiling
	public static int countGallonsWithCeiling(int length,int width,int height) {
		final double PER_GALLON = 350,GALLON_PRICE = 32;
		int roomArea, gallonsNeeded,totalPrice;
		
		
		roomArea = 2*(length*height + width*height) + width*length;
		
		// Rounding number in bigger side
		gallonsNeeded = (int)Math.ceil(roomArea/PER_GALLON);
		
		System.out.println("You will need a " + gallonsNeeded + " gallons of paint.");
		totalPrice = (int)(gallonsNeeded * GALLON_PRICE);
		
		return totalPrice;
	}
}
