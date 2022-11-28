package Excersice1;

public class TestClass {
	protected int number = 4;
	
	public static class Inner {
		public Inner() {
			System.out.println("This is constructor of the inner class");
		}
	}
	
	public void show() {
		System.out.println("Number is a " + number);
	}

}
