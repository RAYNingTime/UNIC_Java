package GarbageCollection;

public class Derived1 extends Base{
	protected void finalize() {
		System.out.println("Derived1.finalize()");
		super.finalize();
	}

}
