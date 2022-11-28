package Poem;

public class DemoPoems {

	public static void main(String[] args) {
		Poem poem = new Poem("poem", 4);
		System.out.println("Name: " + poem.getName() + 
				"\nLines: " + poem.getLinesNum() + "\n");
		
		Couplet couplet = new Couplet("couplet");
		System.out.println("Name: " + couplet.getName() + 
				"\nLines: " + couplet.getLinesNum() + "\n");
		
		Limerick limerick = new Limerick("limerick");
		System.out.println("Name: " + limerick.getName() + 
				"\nLines: " + limerick.getLinesNum() + "\n");
		
		Haiku haiku = new Haiku("haiku");
		System.out.println("Name: " + haiku.getName() + 
				"\nLines: " + haiku.getLinesNum() + "\n");
	}

}
