package Excersice3;

public class Female extends Child {
	public Female(String name) {
		super.name = name;
		super.gender = "female";
	}
	
	public Female(String name, int age) {
		super.name = name;
		super.gender = "female";
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
