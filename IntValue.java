import java.util.Scanner;

public class IntValue{
	// determine and print the number of odd, even and zero digits

	public static void main(String[] args){
		// initialize variable
		int number, countZero = 0, countOdd = 0, countEven = 0;
		String quit = "No";

		// Input object
		Scanner scan = new Scanner(System.in);

		do
		{
			System.out.println("Enter a number (Enter -1 to quit):");
			number = scan.nextInt();

			if (number == -1)
			{
				quit = "Yes";
			}
			// If zero add 1 to countZero
			else if (number == 0)
			{
				countZero += 1;
			}

			// If divisible by 2 add 1 to countEven
			else if (number % 2 == 0)
			{
				countEven += 1;
			}

			// Else odd number add 1 to countOdd
			else if (number % 2 != 0)
			{
				countOdd += 1;
			}

		}
		while (quit == "No");

		//System.out.printf("You entered %d odd numbers, %d even number and %d zeros that were entered." countOdd, countEven, countZero);
		System.out.print("You entered " + countOdd + " odd numbers," + countEven + " even numbers, and " + countZero + " Zeros.");
	}
}
