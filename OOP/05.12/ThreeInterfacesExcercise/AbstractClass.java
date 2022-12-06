package ThreeInterfacesExcercise;

public abstract class AbstractClass implements Inter {

	// Interface one
	public void interfaceOneMethod1() {
		System.out.println("Method 1 of interface 1");
	}

	public void interfaceOneMethod2() {
		System.out.println("Method 2 of interface 1");
	}

	
	// Interface two
	public void interfaceTwoMethod1() {
		System.out.println("Method 1 of interface 2");
	}

	public void interfaceTwoMethod2() {
		System.out.println("Method 2 of interface 2");
	}

	
	// Interface three
	public void interfaceThreeMethod1() {
		System.out.println("Method 1 of interface 3");
	}

	public void interfaceThreeMethod2() {
		System.out.println("Method 2 of interface 3");
	}
	
	
	// Inter
	public void interMethod1() {
		System.out.println("Method 1 of interface 4");
	}

	public void interMethod2() {
		System.out.println("Method 2 of interface 4");
	}
	
	public abstract void method1();
	public abstract void method2();

}
