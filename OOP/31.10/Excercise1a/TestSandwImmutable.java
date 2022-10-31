package Excercise1a;

public class TestSandwImmutable {

	public static void main(String[] args) {
		ImmSandwich lunch = new ImmSandwich("meat", "whole", 6.00);
		System.out.println("Main ingredient of the sandwich: " + lunch.getMainIngredient() + 
				"\nBread type of the sandwich: " + lunch.getBread()
				+ "\nPrice of the sandwich: " + lunch.getPrice());
	}
}
