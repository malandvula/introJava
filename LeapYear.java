import java.util.Scanner;

public class LeapYear{
	// Tells you if the year entered is a leap year
	public static void main(String[] args){
		// Initialize variables
		int year = 1852;

		// Scanner object
		Scanner scan = new Scanner(System.in);


		// Get year
		System.out.println("Enter a year and I will tell if it's a leap year or not. Enter zero to quit program.");
		year = scan.nextInt();

		// Is it a leap year
		if (year < 1582)
		{
			System.out.println("Enter a year after 1581 (Gregorian calendar was adopted in 1582). ");
		}
		else
		{
			if (year % 100 == 0 && year % 400 != 0)
			{
				System.out.println("It's not a leap year.");
			}
			else if (year % 4 == 0)
			{
				System.out.println("It's a leap year.");
			}
			else
			{
				System.out.println("It's not a leap year.");
			}
		}
	}
}
