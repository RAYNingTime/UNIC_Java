package Excersice4;

public class Square extends GeometricFigure {
	
	public Square(double height, double width) {
		setHeight(height);
		setWidth(width);
		setType("Square");
	}

	public void clacArea() {
		setArea(getHeight() * getWidth());
	}

}
