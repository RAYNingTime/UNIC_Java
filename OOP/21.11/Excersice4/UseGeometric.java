package Excersice4;

public class UseGeometric {

	public static void main(String[] args) {
		final int MAX_SIZE = 2; 
		GeometricFigure[] arr = new GeometricFigure[MAX_SIZE];
		
		// Initialization of the Square
		arr[0] = new Square(4, 4);
		arr[0].clacArea();
		
		// Initialization of the Triangle
		arr[1] = new Triangle(10, 5);
		arr[1].clacArea();
		
		for (int i = 0; i < MAX_SIZE; i++) {
			System.out.println("Type: " + arr[i].getType());
			System.out.println("Height: " + arr[i].getHeight());
			System.out.println("Width: " + arr[i].getWidth());
			System.out.println("Area: " + arr[i].getArea());
			
			System.out.println();
		}
	}
}
