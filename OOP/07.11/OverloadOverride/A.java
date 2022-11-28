package OverloadOverride;

public class A {
	public A() {
		System.out.println("This is A class constructor");
	}
	
	public A(String s) {
		System.out.println("A(): " + s);
	}
	
	public void a() {
		System.out.println("I am in A class method");
	}

}
