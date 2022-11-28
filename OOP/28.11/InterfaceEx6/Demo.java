package InterfaceEx6;

public class Demo {
	public static void main(String[] args) {
		
		Outer testOuter = new Outer();
		testOuter.display();
		testOuter.new Inner().display();

	}
}
