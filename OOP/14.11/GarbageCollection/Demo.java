package GarbageCollection;

public class Demo {

	public static void main(String[] args) {
		new Derived2();
		System.gc();
		
		new Derived2();
	}

}
