import java.util.Scanner;

public class BeerSong {
	// Prints the beer song
	public static void main(String[] args) {
		// instantiate
		String messageOne, messageTwo, messageThree;
		int stop, numVerse, i; 
		
		// Prompt for user
		System.out.println("How many verse should I print? ");
		
		// Get user input
		Scanner scan = new Scanner(System.in);
		numVerse = scan.nextInt();
		stop = 100 - numVerse;
		
		// Verses for the song
		messageOne = " bottles of beer on the wall";
		messageTwo = " bottles of beer";
		messageThree  = "If one of those bottles should happen to fall";
		
		// Loop
		for (i = 100; i >= stop; i--){
			System.out.println(i + messageOne);
			System.out.println(i + messageTwo);
			System.out.println(messageThree);
		}
		
		
	}
	
}
