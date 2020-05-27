import java.util.Scanner;

public class Celsius{

	// Convert Fahrenheit to Celsius
	public static void main(String[] args){
		double fahrenheit, Celsius;

		// Read the current temp in Fahrenheit
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		fahrenheit = scan.nextDouble();

		// Convert to Celsius
		Celsius =  ((fahrenheit - 32.0)*5.0)/9.0;

		// print the temperature in Celsius
		System.out.println("It is " + Celsius + " degrees Celsuis.");
	}
}

