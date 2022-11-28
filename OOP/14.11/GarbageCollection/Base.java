package GarbageCollection;

public class Base {
	protected void finalize() {
		System.out.println("Base.finalize()");
	}

}
