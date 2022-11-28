package Excersice1;

public class DemoClass {

	public static void main(String[] args) {

		ManipClass newClass = new ManipClass();
		newClass.show();
		newClass.changeNum(10);
		newClass.show();
		
		TestClass.Inner innerClass = new TestClass.Inner();

	}

}
