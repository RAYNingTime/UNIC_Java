package Excercise1a;

public class Sandwich {
	private String mainIngredient;
	private String breadType;
	private	double price;
		
	// Constructor
	public Sandwich() {
		mainIngredient = "none";
		breadType = "wheat";
		price = 2.50;
	}
	
	// This method sets main ingredient to store it in class
	public void setMainIngredient(String main) {
		mainIngredient = main;
	}
	
	// This method sets bread type to store them in class
	public void setBread(String bread) {
		breadType = bread;
	}
	
	// This method sets price of sandwich to store them in class
	public void setPrice(double userPrice) {
		price = userPrice;
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
