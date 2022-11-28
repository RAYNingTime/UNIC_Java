package Excersice3;

public abstract class Child {
	protected String name;
	protected String gender;
	protected int age;
	
	public Child() {
		
	}
	
	public Child(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public abstract void setAge(int age);
	public abstract void display();

}
