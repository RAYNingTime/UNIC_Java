package Poem;

public class Poem {
	private String name;
	private int linesNum;
	
	public Poem() {
		System.out.println("Poem created");
	}
	
	public Poem(String n, int lines) {
		name = n;
		linesNum = lines;
		System.out.println("Poem name: " + n
							+ "\nLines: " + lines);
	}
	
	public String getName() {
		return name;
	}
	
	public int getLinesNum() {
		return linesNum;
	}

}
