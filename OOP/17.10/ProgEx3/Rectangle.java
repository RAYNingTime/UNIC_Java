package ProgEx3;

public class Rectangle {

	// Two double data fields named width and height
	private double height;
	private double width;
	
	// A string data field named color that specifies the color of a rectangle.
	private String color; 
	
	// A no-arg constructor that creates a default rectangle.
	public Rectangle(){
		// The default values are 1 for both width and height.
		height = 1;
		width = 1;
		
		// The default color is white.
		color = "White";
	} 
	
	// A constructor that creates a rectangle with the specified width and height.
	public Rectangle(double wid, double high){
		height = high;
		width = wid;
	} 
		
	// The accessor and mutator methods for Height.
	public void setHeight(double high){
		height = high;
	}
	
	// The accessor and mutator methods for Width.
	public void setWidth(double wid){
		width = wid;
	}
	
	// The accessor and mutator methods for Color.
	public void setColor(String col){
		color = col;
	} 
	
	// A method named getArea() that returns the area of this rectangle.
	public double getArea(){
		return height*width;
	}
	
	// A method named getPerimeter() that returns the perimeter.
	public double getPerimeter(){
		return 2*(height + width);
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWigth() {
		return width;
	}
	
	public String getColor(){
		return color;
	}
}
