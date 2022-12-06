package ThreeInterfacesExcercise;

public class Demo {

	public static void main(String[] args) {
		Concrete testObject = new Concrete();
		
		// Calling first interface
		testObject.methodInterOne(testObject);
		System.out.println();
		
		// Calling second interface
		testObject.methodInterTwo(testObject);
		System.out.println();
		
		// Calling third interface
		testObject.methodInterThree(testObject);
		System.out.println();
		
		// Calling inter interface
		testObject.methodInter(testObject);
		System.out.println();
		
		// Abstract
		testObject.method1();
		testObject.method2();
	}

}
