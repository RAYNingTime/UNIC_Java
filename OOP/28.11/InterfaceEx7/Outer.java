package InterfaceEx7;

interface SimpleInterface {
	void interfaceDisplay();
}

public class Outer {
	public Inner get2() {
		return new Inner();
	}
	
	public SimpleInterface get() {
		return new Inner();
	}
	
	private class Inner implements SimpleInterface{
		public void interfaceDisplay() {
			System.out.println("Method of interface");
		}
		
		// Commented, so unused
		@SuppressWarnings("unused")
		public void display() {
			System.out.println("Method of private Inner class");
		}
	}
	
	public static void main(String[] args) {
		Outer outerTest = new Outer();
		SimpleInterface simpleInterfaceTest = outerTest.get();
		simpleInterfaceTest = outerTest.get2();
		simpleInterfaceTest.interfaceDisplay();
		
		//si.display(); //cannot access
		
	}

}
