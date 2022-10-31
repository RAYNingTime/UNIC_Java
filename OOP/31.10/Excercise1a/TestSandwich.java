package Excercise1a;
import java.util.Scanner;

public class TestSandwich {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Sandwich NewSandwich = new Sandwich();
		
		String mainIngredient, breadType;
		double price;
		
		System.out.print("Enter the main ingredient of sandwich: ");
		mainIngredient = sc.next();
		
		System.out.print("Enter the bread type of sandwich: ");
		breadType = sc.next();
		
		price = enterPrice();
		
		NewSandwich.setMainIngredient(mainIngredient);
		NewSandwich.setBread(breadType);
		NewSandwich.setPrice(price);
		
		System.out.print("Your sandwich with " + NewSandwich.getMainIngredient() + " in " + 
		NewSandwich.getBread() + " bread will cost you " + NewSandwich.getPrice());
		
		
		
		
	}
	
	static double enterPrice() {
		double price;
		
		do {
		System.out.print("Enter the price of sandwich: ");
		price = sc.nextDouble();
		
		if(price < 0)
			System.out.println("You've entered a negative value! Try again!");
		} while (price < 0);
		
		return price;
	}

}
