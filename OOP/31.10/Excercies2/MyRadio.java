package Excercies2;

public class MyRadio {
	Radio myRadio = new Radio();
	
	// Prints out the frequency of Classic FM
	public void printClassicFreq() {
		System.out.println("Frequency of CLASSIC_FM: " + Radio.CLASSIC_FM);
	}
	
	// Prints out the frequency of BBC Radio 3
	public void printBBC3Freq() {
		System.out.println("Frequency of BBC Radio 3: " + Radio.frequencyOfBBC(3));
	}
	
	// Prints out what is playing on BRMB
	public void printBRMBPlaying() {
		myRadio.setFrequency(Radio.BRMB);
		System.out.print("Now on BRMB: ");
		myRadio.listen();
	}
	
	// Prints out what is happening on BBC Radio 2
	public void printBBC2Playing() {
		myRadio.setFrequency(Radio.frequencyOfBBC(2));
		System.out.print("Now on BBC Radio 2: ");
		myRadio.listen();
	}
	
	// Prints out what can be heard on 92.7 FM
	public void print92_7Playing() {
		myRadio.setFrequency(92.7f);
		System.out.print("Now on 92.7f frequency: ");
		myRadio.listen();
	}
	
	// Prints out what can be heard on 94.5 FM
	public void print94_5Playing() {
		myRadio.setFrequency(94.5f);
		System.out.print("Now on 94.5f frequency: ");
		myRadio.listen();
	}

}

