package ProgEx3;
import ProgEx3.Rectangle;

public class ProgEx3 {
	public static void main(String[] args){
		final String COLOR = "Red";
		
		Rectangle firstRectangle = new Rectangle(4, 40);
		Rectangle secondRectangle = new Rectangle(3.5, 35.9);
		
		
		firstRectangle.setColor(COLOR);
		secondRectangle.setColor(COLOR);
		
		System.out.println("The perimeter of the first rectangle is: " + firstRectangle.getPerimeter() + 
				"\nThe area is: " + firstRectangle.getArea() + 
				"\nThe width is: " + firstRectangle.getWigth() + 
				"\nThe height is: " + firstRectangle.getHeight() +
				"\nThe color is: " + firstRectangle.getColor() + "\n\n");
		
		
		System.out.println("The perimeter of the second rectangle is: " + secondRectangle.getPerimeter() + 
				"\nThe area is: " + secondRectangle.getArea() + 
				"\nThe width is: " + secondRectangle.getWigth() + 
				"\nThe height is: " + secondRectangle.getHeight() +
				"\nThe color is: " + secondRectangle.getColor() + "\n\n");
	}
}