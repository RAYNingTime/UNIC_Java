package ThreeInterfacesExcercise;

public class Concrete extends AbstractClass {
	
	public void methodInterOne(InterfaceOne i) {
		i.interfaceOneMethod1();
		i.interfaceOneMethod2();
	}
	
	public void methodInterTwo(InterfaceTwo i) {
		i.interfaceTwoMethod1();
		i.interfaceTwoMethod2();
	}
	
	public void methodInterThree(InterfaceThree i) {
		i.interfaceThreeMethod1();
		i.interfaceThreeMethod2();
	}
	
	public void methodInter(Inter i) {
		i.interMethod1();
		i.interMethod2();
	}

	public void method1() {
		System.out.println("Method 1 of abstract class");
	}

	public void method2() {
		System.out.println("Method 2 of abstract class");
	}

}
