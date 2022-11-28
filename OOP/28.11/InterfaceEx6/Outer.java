package InterfaceEx6;

public class Outer {
	private int outerNumber = 5;
	public void display() {
		System.out.println("Inner number in outer class is " + new Inner().getNum());
	}
	
	class Inner {
		private int innerNumber = 3;
		public void display() {
			System.out.println("Outer number in inner class is " + outerNumber);
		}
		public int getNum() {
			return innerNumber;
		}
	}

}
