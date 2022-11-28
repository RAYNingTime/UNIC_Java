package GarbageCollection;

public class Derived2 extends Derived1{
	protected void finalize() {
		System.out.println("Derived2.finalize()");
		super.finalize();
	}

}
