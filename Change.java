import java.util.Scanner;

public class Change{
	// How much change ($) do you have?
	public static void main(String[] args){
		// variables
		int quarters, dimes, nickles, pennies;

		// read in the values from keyboard
		Scanner scan = new Scanner(System.in);

		System.out.println("How many quarters? ");
		quarters = scan.nextInt();
		System.out.println("How many dimes?");
		dimes = scan.nextInt();
		System.out.println("How many nickles?");
		nickles = scan.nextInt();
		System.out.println("How many pennies?");
		pennies = scan.nextInt();

		// dollar value
		quarters *= 25;
		dimes *= 10;
		nickles *= 5;
		pennies *= 1;

		float dollars = quarters + dimes + nickles + pennies;

		System.out.println("You have $" + dollars/100.0 + "cents.");
	}
}
