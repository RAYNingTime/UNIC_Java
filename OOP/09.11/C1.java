public class C1 extends B1{
	
	A1.Aa a1 = new A1.Aa(); 
	B1.Bb b1 = new B1.Bb(); 
	
	public static void main(String [] args){
		C1 c = new C1();
		
		c.a1.printA();
		c.b1.printB();	
	}	
}
