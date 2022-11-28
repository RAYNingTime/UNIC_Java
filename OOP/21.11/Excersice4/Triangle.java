package Excersice4;

public class Triangle extends GeometricFigure {
	
	public Triangle(double height, double width) {
		setHeight(height);
		setWidth(width);
		setType("Triangle");
	}
	
	public void clacArea() {
		setArea(getHeight() * getWidth() * 0.5);
	}

}
