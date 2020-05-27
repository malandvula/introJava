import java.util.Scanner;

public class Fraction{
	// return decimal from input numerator and denominator
	public static void main(String[] args){
	// initialze variables
	double numerator, denominator;

	// read in values
	Scanner scan = new Scanner(System.in);


	System.out.println("Enter the numerator: ");
	numerator = scan.nextDouble();
	System.out.println("Enter the denominator: ");
	denominator = scan.nextDouble();

	// return the demical equivalent
	System.out.println(numerator/denominator);
	}
}
