import java.util.Scanner;

public class Seconds{
	// convert hours and mins to seconds
	public static void main(String[] args){
		// initialize
		int hours, mins, secs, tempMins = 0, seconds = 0;

		// Object to take in hours, mins, and seconds
		Scanner scan = new Scanner(System.in);

		// read in hours, mins and seconds
		System.out.println("Enter number of hours:");
		hours = scan.nextInt();
		System.out.println("Enter number of mins:");
		mins = scan.nextInt();
		System.out.println("Enter number of seconds");
		secs = scan.nextInt();

		// convert to seconds
		tempMins += hours * 60;
		seconds +=  ((tempMins + mins) * 60)+ secs;

		// print out number of seconds
		System.out.println(hours + " hour " + mins + " mins " + " and " + secs + " seconds " + "is equivalent to  "
		 + seconds + " seconds." );
	}
}
