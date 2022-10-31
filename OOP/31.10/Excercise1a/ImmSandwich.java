package Excercise1a;

public class ImmSandwich {
	private String mainIngredient;
	private String breadType;
	private	double price;
		
	// Constructor	
	public ImmSandwich(String main, String bread, double cost) {
		this.mainIngredient = main;
		this.breadType = bread;
		this.price = cost;
	}
	
	// This method returns main ingredient that have been stored in class
	public String getMainIngredient() {
		return mainIngredient;
	}
	
	// This method returns bread type that have been stored in class
	public String getBread() {
		return breadType;
	}
	
	// This method returns price of sandwich that have been stored in class
	public double getPrice() {
		return price;
	}
}
