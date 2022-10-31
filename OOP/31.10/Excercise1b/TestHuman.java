package Excercise1b;

import java.util.Scanner;

public class TestHuman {

	public static void main(String[] args) {
		Human friend, neighbor, sibling;
		String firstName, middleName, lastName;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		firstName = sc.next();
		System.out.print("Enter the middle name: ");
		middleName = sc.next();
		System.out.print("Enter the last name: ");
		lastName = sc.next();
		sc.close();
		
		friend = new Human();
		neighbor = new Human(firstName, middleName, lastName);
		sibling = new Human(neighbor);
	}

}
