import java.util.Scanner;

public class HMS{
	// convert seconds to hours, mins, and seconds
	public static void main(String[] args){
		// initialize
		int hours, mins, seconds, secs, tempTime;
		double dmins;

		// read in value
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of seconds");
		secs = scan.nextInt();

		// change seconds to mins
		dmins = secs / 60;
		seconds = secs % 60;

		// change mins to hours
		hours = (int) dmins / 60;
		mins = (int)dmins % 60;

		// change assign the ints variables with  dvariables

		// print the out in hours, mins and seconds
		System.out.println(secs + " seconds " + "is equivalent to " + hours + " hours " + mins 
					+ " minutes, and " + seconds + " seconds.");
	}
}
