package Excersice3;

public class Male extends Child {
	public Male(String name) {
		super.name = name;
		super.gender = "male";
	}
	
	public Male(String name, int age) {
		super.name = name;
		super.gender = "male";
		setAge(age);
	}
	
	public void setAge(int age) {
		super.age = age;
	}

	public void display() {
		System.out.println("Name: " + super.name);
		System.out.println("Gender: " + super.gender);
		System.out.println("Age: " + super.age);
	}

}
