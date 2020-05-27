import java.util.Scanner;

public class KMs{
	// convert miles to kms
	public static void main(String[] args){
		// instance variables
		float miles, kms;

		// input object
		Scanner scan = new Scanner(System.in);

		// number of miles
		System.out.println("Entr the number of miles");
		miles = scan.nextFloat();

		// convert to Kms
		kms = miles * (float)1.60935;

		// print out the equivalent number of kms
		System.out.println("The equivalent number of kilometers is " + kms + ".");

	}
}
