package OverloadOverride;

public class B {
	public B() {
		System.out.println("This is B class constructor");
	}
	
	public B(String s) {
		System.out.println("B(): " + s);
	}
	
	public void b() {
		System.out.println("I am in B class method");
	}

}
