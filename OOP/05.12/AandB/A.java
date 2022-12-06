package AandB;

// ERROR: Fields of interface always must be public
// HOW TO FIX: Remove private and protected modifiers or change them to public 

interface A {
	private int F1 = 0;
	private int F2 = 0;
	protected int F3 = 0;
}

