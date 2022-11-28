package OverloadOverride;

public class C extends A{
	B bObj = new B();
	
	public void a() {
		System.out.println("I am in A class method overrided in C class");
	}
	
	public void b() {
		System.out.println("I am in B class method overrided in C class");
	}

}
