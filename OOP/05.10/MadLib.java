import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		final int MAX_WORDS = 12;
		final String[] WORD_TYPE = {"adjective","noun", "verb, past tense", 
							"adverb","adjective","noun",
							"noun","adjective","verb",
							"adverb","verb, past tense","adjective"};
		Scanner sc= new Scanner(System.in);
		
		String[] madLibWords = new String[MAX_WORDS];
		int positionCounter = 0;
		
		for (int i = 0; i < MAX_WORDS; i++) {
			System.out.print("Enter a " + WORD_TYPE[i] + ": ");
			madLibWords[i] = sc.next();
		}
		System.out.print("\n\nToday I went to the zoo. I saw a(n) " + madLibWords[positionCounter++]+ 
				"\n" + madLibWords[positionCounter++] + " jumping up and down in its tree." + 
				"He " + madLibWords[positionCounter++] + " "+ madLibWords[positionCounter++] +
				"\nthrough the large tunnel that led to its " + madLibWords[positionCounter++] +
				"\n" + madLibWords[positionCounter++] + ". I got some peanuts and passed" +
				"\nthem through the cage to a gigantic gray" + madLibWords[positionCounter++] + 
				"\ntowering above my head. Feeding that animal made" + 
				"\nme hungry. I went to get a " + madLibWords[positionCounter++] + " scoop" +
				"\nof ice cream. It filled my stomach. Afterwards I had to" +
				"\n" + madLibWords[positionCounter++] + " " + madLibWords[positionCounter++] + " to catch our bus." +
				"\nWhen I got home I " + madLibWords[positionCounter++] + " my" +
				"\nmom for a " + madLibWords[positionCounter++] + " day at the zoo.");
	sc.close();
	}

}
