package Candle;

public class Candle {
	private String color;
	private double height;
	private double price;
	
	public String getColor() {
		return color;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setHeight(double height, int perInch) {
		this.height = height;
		setPrice(height*perInch);
	}
	
	private void setPrice(double price) {
		this.price = price;
	}

}
