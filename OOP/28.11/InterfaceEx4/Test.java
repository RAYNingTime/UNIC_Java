package InterfaceEx4;

//     INTERFACES WITH METHODS 
// ----------------------------------

interface One{
	void methodFirst_First();
	void methodFirst_Second();
}

interface Two{
	void methodSecond_First();
	void methodSecond_Second();
}

interface Three{
	void methodThird_First();
	void methodThird_Second();
}

interface Four extends One, Two, Three{
	void newMethod();
}

//----------------------------------
// CLASS WITH IMPLEMENTATION 

public class Test implements One, Two, Three, Four{
	// IMPLEMENTATION OF THE FIRST INTERFACE
	public void methodFirst_First() {
		System.out.println("First method of first interface");
	}
	public void methodFirst_Second() {
		System.out.println("Second method of first interface");
	}
	
	// IMPLEMENTATION OF THE SECOND INTERFACE
	public void methodSecond_First() {
		System.out.println("First method of second interface");
	}
	public void methodSecond_Second() {
		System.out.println("Second method of second interface");
	}
	
	// IMPLEMENTATION OF THE THIRD INTERFACE
	public void methodThird_First() {
		System.out.println("First method of third interface");
	}
	public void methodThird_Second() {
		System.out.println("Second method of third interface");
	}
	
	// IMPLEMENTATION OF THE FOURTH INTERFACE
	public void newMethod() {
		System.out.println("New method of new interface");
	}
	
	
	// METHODS TO CALL EACH METHOD OF INTERFACES
	public void method1(One x) {
		System.out.print("method 1 (with interface 1 in args): ");
		x.methodFirst_First();
		System.out.print("method 2 (with interface 1 in args): ");
		x.methodFirst_Second();
	}
	
	public void method2(Two x) {
		System.out.print("method 1 (with interface 2 in args): ");
		x.methodSecond_First();
		System.out.print("method 2 (with interface 2 in args): ");
		x.methodSecond_Second();
	}

	public void method3(Three x) {
		System.out.print("method 1 (with interface 3 in args): ");
		x.methodThird_First();
		System.out.print("method 2 (with interface 3 in args): ");
		x.methodThird_Second();
	}

	public void method4(Four x) {
		System.out.print("new method (with interface 4 in args): ");
		x.newMethod();
	}

}
