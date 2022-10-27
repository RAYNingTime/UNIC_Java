
public class Foo {
	static int x = 0;
	static int y = 0;
	static int k = 2;
	
	public void p() {
		x = 1;
		x = 16;
		System.out.println(x);
	}
	
	public Foo() {
		p();
	}
	
	public static void main(String[] args) {
		new Foo();
	}
}// class
