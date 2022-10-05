import java.util.*;  
public class Hello {

	public static void main(String[] args) {		
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter your name: ");  
	String name= sc.next();  // sc.nextLine - reads whole line of input
	System.out.print("Enter your age: ");  
	int age= sc.nextInt();  
	System.out.println("Hello, "+ name + ". You're " + age + " years old!");
	
	System.out.print("Enter frist double: ");  
	double firstDouble = sc.nextDouble();
	System.out.print("Enter second double: ");  
	double secondDouble = sc.nextDouble();
	System.out.println(firstDouble/secondDouble);
	
	sc.close();
	}
}


